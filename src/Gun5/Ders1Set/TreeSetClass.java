package Gun5.Ders1Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

    public static void main(String[] args) {
        /*
        diger set yapılarından farklı olarak listeyi sıralı olarak almamızı sağlar.
        alfabetik sıra , buyukten kucuğe vs
        compperable yöntemi ile bu sıralama işlemini kendi istediğimiz sıralamada yapabiliriz

        TreeSet’in en önemli özelliği, öğeleri doğal sıralama
        (alfabetik veya sayısal) ile düzenli olarak saklamasıdır.

        TreeSet'in Özellikleri
            -- Sıralı Yapı: TreeSet, eklenen elemanları sıralı bir biçimde tutar.
            Varsayılan olarak "doğal sıralama" yapar. ,
            Örneğin, String türünde ise alfabetik, Integer türünde ise sayısal sıraya göre sıralar.

            -- Benzersiz Öğeler: TreeSet, tıpkı HashSet gibi benzersiz elemanlar tutar,
            yani aynı öğeyi birden fazla kez eklemez.

            -- null Değeri Kabul Etmez: TreeSet null değerini desteklemez.
            null değeri eklemeye çalıştığında NullPointerException hatası alırsın.

            -- Yüksek Performans: TreeSet, NavigableSet arayüzünü uygular ve
            ikili arama ağacı (binary search tree) yapısını kullanır,
            bu da ona hızlı arama, ekleme ve silme yeteneği sağlar.
         */

        TreeSet<String> liste = new TreeSet<>();
        liste.add("Yusuf");
        liste.add("Yeliz");
        liste.add("Zeki");
        liste.add("Zeki");
        liste.add("Zeki");
        liste.add("Zuleyha");
        liste.add("Ali");
        liste.add("Ayşe");
        liste.add("Ayşe");
        liste.add("Ayşe");
        liste.add("Buse");
        liste.add("Buse");
        liste.add("Buse");
        liste.add("Burak");
        liste.add("Burak");
        liste.add("Burak");
        // liste.add(null); // .NullPointerException hatasi verdi
         Iterator<String> itr = liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        /*
      TreeSet ile Sıralama ve Arama İşlemleri
        -- subSet(start, end): Belirli bir aralık içindeki öğeleri alır (start dahil, end hariç).
        -- headSet(element): Belirli bir öğeye kadar olan elemanları (o öğe hariç) getirir.
        -- tailSet(element): Belirli bir öğeden sonraki elemanları (o öğe dahil) getirir.

      TreeSet Avantajları ve Kullanım Alanları
        -- Sıralı ve Benzersiz Veri Tutma: Örneğin, bir sıralı öğrenci listesi veya benzersiz, sıralı sayılar koleksiyonu saklamak için.
        -- Hızlı Erişim: Özellikle sıralama gereken durumlarda TreeSet, verimli bir çözümdür.
         */
        System.out.println("liste.subSet(\"Ali\",\"Buse\") = " + liste.subSet("Ali", "Buse"));
        System.out.println("liste.headSet(\"Zeki\") = " + liste.headSet("Zeki"));
        System.out.println("liste.tailSet(\"Buse\") = " + liste.tailSet("Buse"));

    }
}
