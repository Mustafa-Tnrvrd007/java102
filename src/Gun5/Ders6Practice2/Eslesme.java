package Gun5.Ders6Practice2;

import java.util.ArrayList;

public class Eslesme {
    private ArrayList<Clup> takimList = new ArrayList<Clup>();
    private int takimSayisi;
    private int ligHaftaSayisi;

    private Clup[][] round;
    private ArrayList<Clup[][]> arrayRound;

    Eslesme(ArrayList<Clup> takimList, int takimSayisi, int ligHaftaSayisi) {
        getTakimList().addAll(takimList);
        setTakimSayisi(takimSayisi);
        setLigHaftaSayisi(ligHaftaSayisi);
        setRound(new Clup[getTakimSayisi() / 2][2]); // haftalık oynanacak maç sayısı
        setArrayRound(new ArrayList<Clup[][]>());
        //// firstWeek kontrol
//        firstWeek();
//        System.out.println("takim listesi : "+getTakimList());
//        System.out.println("ilk hafta eşleştirmeleri : ");
//        printMatris(getRound());
//        System.out.println("getArrayRound().get(0) = " ); // arrayRound kontroll
//        printMatris(getArrayRound().get(0));

        //match(); // match kontrol
//        liginIlkYariMaclariAtama(); // 1. devre kontrol
////        System.out.println("ilk yarı eşleşmeleri ");
////        for (int i = 0; i < getArrayRound().size(); i++) {
////            System.out.println("\n" + i + ". hafta\n");
////            printMatris(getArrayRound().get(i));
////        }

//        System.out.println("###################");
//        liginIkinciYariMaclariAtama();
//        System.out.println("ilk yaridaki düzgün round :");
//        printMatris(getArrayRound().get(0));
//        System.out.println("bu haftanın ters çevrilmiş hali ");
//        printMatris(getRound());
//        liginIlkYariMaclariAtama();
//        liginIkinciYariMaclariAtama();
//        deplasmanDuzenleme();
//        // System.out.println("getLigHaftaSayisi() = " + getLigHaftaSayisi()); // kontrol
//        System.out.println("Fikstur");
//        for (int i = 0; i < getArrayRound().size(); i++) {
//            System.out.println("\n" + (i+1) + ". hafta\n");
//            printMatris(getArrayRound().get(i));
//        }

    }

    public ArrayList<Clup[][]> fiksturOlustur(){
        liginIlkYariMaclariAtama();
        liginIkinciYariMaclariAtama();
        deplasmanDuzenleme();
        // System.out.println("getLigHaftaSayisi() = " + getLigHaftaSayisi()); // kontrol

        return getArrayRound();
    }

    public void deplasmanDuzenleme() {
        // haftalardaki mac eslesmeleri rastgele durmadığı için
        // hafta sayisi cift olan haftalarin roundlarını ters ceviricez

        for (int i = 0; i < getArrayRound().size(); i++) {
            if (i % 2 == 0 && i< getLigHaftaSayisi()/2 || i>= getLigHaftaSayisi()/2 && i%2 !=0 ) {
                //getArrayRound().set();
                Clup takim  = new Clup("");
                takim = getArrayRound().get(i)[0][0];
                getArrayRound().get(i)[0][0] = getArrayRound().get(i)[0][1];
                getArrayRound().get(i)[0][1] = takim;
            }
        }

    }

    public void liginIkinciYariMaclariAtama() {
        // ilk devredeki maçları ters çevirip ( deplesmanı ev sahibi , ev sahibini deplesman)
        // ikinci devreye atamak lazım
        int index = 0;
        // metod(0);
        for (int i = 0; i < getLigHaftaSayisi() / 2; i++) {

            getArrayRound().add(deepCopyMatris(tersCevir(index)));
            index++;
        }

    }

    public Clup[][] tersCevir(int index) {
        Clup[][] tersRound = new Clup[getArrayRound().get(0).length][2];

        for (int i = 0; i < getArrayRound().get(0).length; i++) {
            for (int j = 0; j < 2; j++) {
                tersRound[i][j] = getArrayRound().get(index)[i][1 - j];
                // ilk devredeki eslesmeler ters cevriliyor
            }
        }
        // getArrayRound().add(deepCopyMatris(tersRound));
        return tersRound;
    }

    public void liginIlkYariMaclariAtama() {
        firstWeek();
        for (int hafta = 1; hafta < getLigHaftaSayisi() / 2; hafta++) {
            getArrayRound().add(match());

        }
    }

    public Clup[][] match() { // asıl algoritma burada yazılmalı
        // 2 tane matris var : round ve arrayRound.get(index)
        int index = getArrayRound().size();
        int length = getRound().length;
        getRound()[1][0] = getArrayRound().get(index - 1)[0][1]; // 2. takım 3. takımın yerine atandı
        getRound()[0][1] = getArrayRound().get(index - 1)[1][1]; // 4. takım 2. takımın yerine atandı
        getRound()[length - 1][1] = getArrayRound().get(index - 1)[length - 1][0];
        // sol en alttaki takım sağ en alta atandı

        for (int row = 1; row < getRound().length - 1; row++) {
//            System.out.println("Dongu " + row + " kere çalıştı ");
//
//            System.out.println(getRound()[row + 1][0] + " yerine " +
//                    getArrayRound().get(index - 1)[row][0] + " atandı");
            getRound()[row + 1][0] = getArrayRound().get(index - 1)[row][0]; // sol kolon aşağı doğru kaydı
//            System.out.println(getRound()[row][1] + " yerine " +
//                    getArrayRound().get(index - 1)[row + 1][1] + " atandı");
            getRound()[row][1] = getArrayRound().get(index - 1)[row + 1][1]; //sağ taraf yukarı doğru kaydı

        }

        // getArrayRound().add(deepCopyMatris(getRound())); // listeye matrix eklendi

//        System.out.println(index + ". hafta eşleşmesi yapıldı : ");
        printMatris(getRound());
        return deepCopyMatris(getRound());

    }

    public void firstWeek() {
        int index = 0;
        for (int i = 0; i < getRound().length; i++) {
            for (int j = 0; j < 2; j++) {
                getRound()[i][j] = getTakimList().get(index);
                index++;
            }
        }
        getArrayRound().add(deepCopyMatris(getRound()));
    }

    public void printMatris(Clup[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            System.out.println(matris[i][0] + "\tvs\t" + matris[i][1]);
        }
    }

    public Clup[][] deepCopyMatris(Clup[][] origin) { // referans atamaya manuel çözüm
        int row = origin.length;
        int column = origin[0].length;
        Clup[][] copy = new Clup[row][column];
        for (int i = 0; i < row; i++) {
            System.arraycopy(origin[i], 0, copy[i], 0, origin[i].length);
        }

        return copy;
    }


    public int getLigHaftaSayisi() {
        return ligHaftaSayisi;
    }

    public void setLigHaftaSayisi(int ligHaftaSayisi) {
        this.ligHaftaSayisi = ligHaftaSayisi;
    }

    public ArrayList<Clup> getTakimList() {
        return takimList;
    }

    public void setTakimList(ArrayList<Clup> takimList) {
        this.takimList = takimList;
    }

    public int getTakimSayisi() {
        return takimSayisi;
    }

    public void setTakimSayisi(int takimSayisi) {
        this.takimSayisi = takimSayisi;
    }

    public ArrayList<Clup[][]> getArrayRound() {
        return arrayRound;
    }

    public void setArrayRound(ArrayList<Clup[][]> arrayRound) {
        this.arrayRound = arrayRound;
    }

    public Clup[][] getRound() {
        return round;
    }

    public void setRound(Clup[][] round) {
        this.round = round;
    }
}
