package Gun5.Ders5Practice1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //   –
        Book k1 = new Book("Iki Şehrin Hikayesi","Charles Dickens",600);
        Book k2 = new Book("Suç ve Ceza","Fyodor Mihayloviç Dostoyevski",1500);
        Book k3 = new Book("Notre Dame’ın Kamburu","Victor Hugo",465);
        Book k4 = new Book("Aşk ve Gurur","Jane Austen",523);
        Book k5 = new Book("Oblomov","Ivan Gonçarov",1300);

        HashSet<Book> setListe = new HashSet<>();

        setListe.add(k1);
        setListe.add(k2);
        setListe.add(k3);
        setListe.add(k4);
        setListe.add(k5);
        setListe.add(k2);
        setListe.add(k1);
        setListe.add(k3);
        setListe.add(k4);
        setListe.add(k5);

        //
        Iterator<Book> itr = setListe.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next().getIsim());
        }

        ArrayList<Book> kitaplar = new ArrayList<>(setListe); // set yapısını listeye taşıdık
        System.out.println("\n\nSıralanmamıs kitap listesi");

        for (Book kitap : kitaplar){
            System.out.println(kitap);
        }

        Collections.sort(kitaplar); // kitaplar book clasında yazdığımız compare metoduna göre sıralandı

        System.out.println("\n\nIsime göre alfabetik sıralanmış kitap listesi");

        for (Book kitap : kitaplar){
            System.out.println(kitap);
        }


        Collections.sort(kitaplar,new SayfaSirasi()); // sayfa sirasına göre sıralanmıştır


        System.out.println("\n\nSayfa sayisina göre sıralanmış kitap listesi");

        for (Book kitap : kitaplar){
            System.out.println(kitap.getSayfa() + "\t" + kitap.getIsim()+"\t\t\t"+kitap.getYazar());
        }


    }
}
