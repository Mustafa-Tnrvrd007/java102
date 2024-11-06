package Gun5.Ders1Set;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {


        HashSet<Integer> hashSet = new HashSet<>(); // HashSet tanımlandı
        // <Integer>  => Integer değerler içerir



        hashSet.add(90); // 90 ekle
        // hashSet.add(10.5); // Integer deger dışında bir değer verirsek hata veriri
        hashSet.add(100);
        hashSet.add(80);
        hashSet.add(80);
        hashSet.add(80);
        hashSet.add(80);
        hashSet.add(110);
        hashSet.add(null);
        hashSet.add(null);

        System.out.println("hashSet = " + hashSet);
        /*
        Set yapıları kümeler gibidir . Her eleman birbirinden farklıdır .
        Bir elemanın aynısı küme içinde bulunmaz. Örnekte de görüldüğü gibi
        sonuç [ 90,100,110,null,80] aynı elemandan birden fazla sayıuda eklememize rağmen
        set yapısının içinde sadece 1 tane görünüyor.
         */

        hashSet.remove(80); // 80 'i siler
        System.out.println("hashSet = " + hashSet);

        System.out.println("hashSet içinde 100 var mı = " + hashSet.contains(100));

        System.out.println("hashSet içinde 80 var mı = " + hashSet.contains(0));

        System.out.println("hashSet boyutu / eleman sayısı = " + hashSet.size());





    }
}
