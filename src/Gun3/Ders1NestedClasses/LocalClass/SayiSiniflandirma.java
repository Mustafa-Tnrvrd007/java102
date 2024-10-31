package Gun3.Ders1NestedClasses.LocalClass;

import java.util.ArrayList;
import java.util.List;
/// Local class ' ların inner classlardan farkı bir metot veya blok içinde tanımlanmalarıdır.

public class SayiSiniflandirma {

    public void numaralariSiniflandir(List<Integer> numbers) {

        class LocalClass { /////////
            List<Integer> cift = new ArrayList<>();
            List<Integer> tek = new ArrayList<>();

            public void ayikla(List<Integer> list) {
                for (int i : list) { // foreach
                    if (i % 2 == 0) {
                        cift.add(i);
                    } else {
                        tek.add(i);
                    }
                }
            }

            public void yazdir() {
                System.out.println("Normal liste : "+numbers);
                System.out.println("Cift sayilar : " + cift);
                System.out.println("Tek sayilar : " + tek);
            }

        }
        LocalClass local = new LocalClass();
        local.ayikla(numbers);
        local.yazdir();


    }
}
