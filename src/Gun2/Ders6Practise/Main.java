package Gun2.Ders6Practise;

public class Main {
    public static void main(String[] args) {
        Kisi ogr = new Ogrenci("Aylin","Pınar",123123123,2);
        Gorevli gorevli = new Gorevli("Ahmet","Boz",223423,0);

        Kitap k1 = new Kitap("Suc ve Ceza","Dostoyevski",123123,true);
        Kitap k2 = new Kitap("Sefiller","Victor Hugo",56733,false);
        Kitap k3 = new Kitap("İki Şehrin Hikâyesi","Charles Dickens",89427,true);
        Kitap k4 = new Kitap("Küçük Prens "," Antonie de Saint-Exupery",10369,false);
        Kitap k5 = new Kitap("Hobbit ","J.R.R. Tolkien",34872,true);

        ogr.giris();
        ogr.calis();
        ogr.cikis();

        gorevli.giris();
        gorevli.calis();
        gorevli.cikis();
        System.out.println("\n\n###############\n");

        gorevli.oduncVer(ogr,k1);

        gorevli.iadeAl(ogr,k1);
        gorevli.oduncVer(ogr,k2);
        gorevli.oduncVer(ogr,k3);

    }
}
