package Gun5.Ders6Practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Fikstur {
    private ArrayList<Clup> takimList = new ArrayList<Clup>();
    private int takimSayisi;
    private int ligHaftaSayisi;
    private ArrayList<HashMap<Clup, Clup>> arrayRound = new  ArrayList<>();

    Fikstur(ArrayList<Clup> takimList) {
        getTakimList().addAll(takimList);
        // System.out.println("Array'e aktarılan takımlar : "+getTakimList());
        setTakimSayisi(getTakimList().size());// girilen takım sayısı
        takimListeDuzenleme();

//        // eslestirme kontrol
//        eslestir();
    }

    public void printFikstur() {
        System.out.println("fikstur yazma işlemi basladı \n\n");
        System.out.println("FIKSTUR");
        for (int i = 0; i < getArrayRound().size(); i++) {
            System.out.println("\n" + (i) + ". hafta\n");
            for (Map.Entry<Clup,Clup> eleman : getArrayRound().get(i).entrySet()){
                System.out.println(eleman.getKey()+"\tvs\t"+eleman.getValue());
            }
        }
        System.out.println("fikstur yazma islemi bitti");
    }

    public void eslestir() {
        Eslesme es = new Eslesme(getTakimList(), getTakimSayisi(), getLigHaftaSayisi());
        //es.fiksturOlustur();
        ArrayList<Clup[][]> temp = es.fiksturOlustur();
        System.out.println("gelen array boyutu = "+ temp.size());
        System.out.println("gelen arrayin içindeki matrixin uzunluğu = " + temp.getFirst().length);


        mapaAta(temp);
        //
        System.out.println("fiksturu yazdirma islemine geciliyor");
        printFikstur();
    }

    public void mapaAta(ArrayList<Clup[][]> array) {
        System.out.println("Mapa atama işlemi başladı");
        for (int indexArray = 0; indexArray < array.size(); indexArray++) {
            System.out.println("Dış dongunun "+indexArray+". adımındayız");
            HashMap<Clup, Clup> round = new HashMap<>();
            for (int j = 0; j < array.get(indexArray).length; j++) {
                System.out.println("İç dongunun "+j+". adımındayız");
                round.put(array.get(indexArray)[j][0], array.get(indexArray)[j][1]);
            }
            System.out.println("İç dongu bitti  ");
            System.out.println("Olusturulan map : ");
            for (Map.Entry<Clup,Clup> eleman : round.entrySet()){
                System.out.println(eleman.getKey()+"\tvs\t"+eleman.getValue());
            }
            getArrayRound().add(round);
        }
        System.out.println("mapa atama işlemi bitti");
    }

    public void takimListeDuzenleme() {

        System.out.println("Takim  sayisi = " + getTakimSayisi());

        if (getTakimSayisi() % 2 == 0) {
            System.out.println("Çift ");
            setLigHaftaSayisi((getTakimSayisi() - 1) * 2);
        } else {
            System.out.println("Tek ");
            setLigHaftaSayisi(getTakimSayisi() * 2);
            getTakimList().add(new Clup("Bay"));
            setTakimSayisi(getTakimSayisi() + 1); // Bay ile beraber takım sayısı toplandı
        }
        System.out.println("Bu lig " + getLigHaftaSayisi() + " hafta oynanacak");
        System.out.println("Yeni takim sayisi : " + getTakimSayisi());
    }


    public void setTakimList(ArrayList<Clup> takimList) {
        this.takimList = takimList;
    }

    public ArrayList<Clup> getTakimList() {
        return takimList;
    }

    public int getTakimSayisi() {
        return takimSayisi;
    }

    public void setTakimSayisi(int takimSayisi) {
        this.takimSayisi = takimSayisi;
    }

    public void setLigHaftaSayisi(int ligHaftaSayisi) {
        this.ligHaftaSayisi = ligHaftaSayisi;
    }

    public int getLigHaftaSayisi() {
        return ligHaftaSayisi;
    }

    public ArrayList<HashMap<Clup, Clup>> getArrayRound() {
        return arrayRound;
    }

    public void setArrayRound(ArrayList<HashMap<Clup, Clup>> arrayRound) {
        this.arrayRound = arrayRound;
    }
}
