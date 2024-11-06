package Gun5.Ders4Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        /*
        Diğer maplarden farklı olarak verileri sırasız tutar .
        Hızlıdır.
         */
        HashMap<Integer , String > sehirler = new HashMap<>();

        sehirler.put(01,"Adana"); // veri ekleme
        sehirler.put(02,"Adıyaman");
        sehirler.put(07,"Antalya");
        sehirler.put(34,"İstanbul");
        sehirler.put(06,"Ankara");

        System.out.println("sehirler = " + sehirler);

        System.out.println("sehirler.get(6) = " + sehirler.get(6));

        System.out.println("sehirler.keySet() = " + sehirler.keySet()); // keyleri veriri
        System.out.println("sehirler.values() = " + sehirler.values());// value'leri verir

        // sehirler.entrySet() => key value çiftini verir

        for (Map.Entry<Integer , String > eleman : sehirler.entrySet()){
            System.out.println(eleman);
        }

        System.out.println("sehirler.containsKey(07) = " + sehirler.containsKey(07));// key kontrolu
        System.out.println("sehirler.containsValue(\"Muğla\") = " + sehirler.containsValue("Muğla"));
        // value kontrolu

        sehirler.replace(06,"Baskent"); // veri güncelleme
        System.out.println("sehirler = " + sehirler);


        sehirler.remove(06);
        System.out.println("sehirler = " + sehirler);


    }
}
