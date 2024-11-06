package Gun5.Ders2List;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        /*
        kullanım açısından LinkedList yapısı ArrayList yapısına oldukça benze.
        Ama arka plandaki çalışma mantığı oldukça farklıdır.
        LinkedList yapısı veri yapılarındaki kuyruk algoritması ile çalışır.
        ArrayList ise index mantığı ile.
        Bu nedenle ekleme silme işlemleri LinkedList'te daha hızlıdır.
         */

        /*
       * Bağlantı Yapısı: LinkedList, her öğenin bir sonraki ve önceki öğeye
       referans içerdiği çift yönlü bir bağlantı yapısına sahiptir.
       Bu yüzden ArrayList gibi tek bir blok değil, bağlantılı düğümlerden oluşur.

       * Ekleme ve Silme: Listenin başına, sonuna veya ortasına ekleme/silme işlemleri
       oldukça hızlıdır çünkü sadece düğümler arasındaki bağlantılar güncellenir.
       Bu işlemler genellikle O(1) sürede gerçekleşir.

       * Arama ve Erişim: LinkedList, belirli bir indekse direkt ulaşımı desteklemez.
       Belirli bir elemana erişmek için sırayla düğümleri dolaşmak gerekir,
       bu da O(n) sürede gerçekleşir.

       * Kullanım Alanı: Listenin başında veya ortasında sıkça eleman
       ekleme/silme gereken durumlarda idealdir.
       Ancak, hızlı rastgele erişim gerekiyorsa ArrayList daha uygun olur.
         */

        LinkedList<String> isimler = new LinkedList<>();
        isimler.add("Ali"); // eleman ekleme
        isimler.add("Aynur");
        isimler.add("Bilal");
        isimler.add("Buse");
        isimler.add("Dilan");
        isimler.add("Deniz");
        isimler.add("Cafer");
        isimler.add("Ceren");

        System.out.println(isimler);

        System.out.println("isimler.get(5) = " + isimler.get(5));
        System.out.println("isimler.contains(\"Buse\") = " + isimler.contains("Buse"));
        System.out.println("isimler.peekLast() = " + isimler.peekLast());
        isimler.addFirst("Zeynep"); // ilk sıraya ekler
        System.out.println(isimler);
        isimler.addLast("Berna");
        System.out.println(isimler);// son sıraya ekler
        isimler.add(2,"Zeynal"); // Belirtilen sıraya ekler(2.) sıraya ekler
        System.out.println(isimler);


    }
}
