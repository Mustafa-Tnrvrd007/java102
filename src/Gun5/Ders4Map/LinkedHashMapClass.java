package Gun5.Ders4Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        /*
        HashMap ' den  farklı olarak verileri girdiği sıraya göre tutar .
        HashMap den biraz yavaştır
         */
        LinkedHashMap<String , String > ulkeler = new LinkedHashMap<>();

        ulkeler.put("TR","Turkiye"); // veri ekleme
        ulkeler.put("EN","İngiltere");
        ulkeler.put("US","AMerika");
        ulkeler.put("GR","Almanya");
        ulkeler.put("FR","Fransa");

        System.out.println("ulkeler = " + ulkeler);

        System.out.println("ulkeler.get(\"GR\") = " + ulkeler.get("GR"));

        System.out.println("ulkeler.keySet() = " + ulkeler.keySet()); // keyleri veriri
        System.out.println("ulkeler.values() = " + ulkeler.values());// value'leri verir

        // ulkeler.entrySet() => key value çiftini verir

        for (Map.Entry<String , String > eleman : ulkeler.entrySet()){
            System.out.println(eleman);
        }

        System.out.println("ulkeler.containsKey(\"JP\") = " + ulkeler.containsKey("JP"));// key kontrolu
        System.out.println("ulkeler.containsValue(\"Almanya\") = " + ulkeler.containsValue("Almanya"));
        // value kontrolu

        ulkeler.replace("TR","Turkey"); // veri güncelleme
        System.out.println("ulkeler = " + ulkeler);

        ulkeler.remove("US");
        System.out.println("ulkeler = " + ulkeler);

    }
}
