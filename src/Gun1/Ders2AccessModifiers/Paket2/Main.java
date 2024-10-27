package Gun1.Ders2AccessModifiers.Paket2;

import Gun1.Ders2AccessModifiers.Paket1.Sinif1;
import Gun1.Ders2AccessModifiers.Paket1.Sinif2;

public class Main {
    /// java da sınıflar public olmak zorundadır.
    /// aynı şekilde main metodu da.
    public static void main(String[] args) {
        Sinif1 sinif1 = new Sinif1();
        Sinif2 sinif2 = new Sinif2();

        sinif2.sinif1Degiskenleri();
        //////////////////////////////////
        System.out.println("\n\nPublic değişken");
        sinif1.publicSayi = 0; // public değişkene başka paketten erişildi
        sinif1.yazdir(sinif1.publicSayi);

        /*
        System.out.println("\n private değişken");
        sinif1.privateSayi = 0;

        // başka paketten private değişkene erişim sağlanamadı
         */
        /*
        System.out.println("\n protected  değişken");
        sinif1.protectedSayi = 0;

        // başka paketten protected değişkene erişim sağlanamadı
         */
        /*
        System.out.println("\n default  değişken");
        sinif1.defaultSayi = 0;

        // başka paketten default değişkene erişim sağlanamadı
         */

        /////////////////////////////////////
        System.out.println("\n\n Metodlar ");
        sinif2.publicMetod();
        // sinif2.privateMetod(); // başka paketten private metoda erişim sağlanamadi
        // sinif2.protectedMetod(); // başka paketten private metoda erişim sağlanamadi
        // sinif2.defaultMetod(); // başka paketten private metoda erişim sağlanamadi
    }
}
