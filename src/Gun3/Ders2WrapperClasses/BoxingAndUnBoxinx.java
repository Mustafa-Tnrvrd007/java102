package Gun3.Ders2WrapperClasses;

public class BoxingAndUnBoxinx {
    public static void main(String[] args) {
        /*
        Boxing : primitive veri tipindeki bir değişkenin non primitive nesnesine dönüşmesidir
        örnek :   int -> Integer


        UnBoxing : Non primitive nesnesinin ilkel veri tipine dönüşmesidir
        örnek :   Integer  -> int
         */

        // BOXING
        int sayi = 7;
        Integer wrapperSayi = Integer.valueOf(sayi);

        System.out.println("wrapperSayi :  " + wrapperSayi);
        wrapperSayi.toString();
        wrapperSayi.hashCode();

        /// UNBOXING
        Integer degisken = 500;

        int primitiveDegisken = degisken.intValue();
        System.out.println("primitiveDegisken = " + primitiveDegisken);

        /*
        Autoboxing ve AutoUnboxing: valueOf() ve intValue() metodlarını kullanmadan
        boxing ve unboxing yapmamızı sağlayan yontem
         */

        // AUTOBOXING
        int sayi2 = 15;
        Integer sayi3 = sayi2;
        System.out.println("Autoboxing  --- sayi3 = " + sayi3);
        // AUTOUNBOXING
        Integer sayi5 = 4256;
        int sayi6 = sayi5;
        System.out.println("Autounboxing  ------  sayi6 = " + sayi6);
    }
}
