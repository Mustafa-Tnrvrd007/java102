package Gun5.Ders2List;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {

        /*
        ArrayList, dinamik olarak boyutlandırılabilen bir dizi gibi çalışır.
        Bu, eklenen veya çıkarılan elemanlara göre otomatik olarak genişleyip daralmasını sağlar.

        ArrayList'in Özellikleri
          -- Dinamik Boyut: ArrayList, başlangıçta belirli bir kapasiteyle oluşturulsa bile
             ihtiyaç halinde otomatik olarak boyutunu artırır.

          -- Sıralı Veri Tutma: ArrayList, elemanları eklenme sırasına göre saklar.

          -- Rastgele Erişim: Diziler gibi ArrayList de hızlı rastgele erişim sağlar;
             belirli bir indeksle erişmek O(1) zaman alır.

          -- null Değeri Destekler: ArrayList içine null değeri ekleyebilirsin.
         */

        ArrayList<String> liste = new ArrayList<>();
        liste.add("İstanbul"); // eleman ekleme
        liste.add("İzmir");
        liste.add("Ankara");
        liste.add("Eskişehir");
        liste.add("Muğla");

        System.out.println(liste);

        System.out.println("liste 3. indexindeki eleman = " + liste.get(3));
        System.out.println("liste boyutu / eleman sayisi = " + liste.size());

        liste.set(2,"Aydın"); // 2. indexteki eleman artık "Ankara" değil , "Aydın" oldu
        System.out.println(liste);

        liste.remove(2);// 2. indexteki elemanı siler . "Aydın" silinir
        System.out.println(liste);

        liste.clear();// tüm elemanları siler
        System.out.println("liste = " + liste);

    }
}
