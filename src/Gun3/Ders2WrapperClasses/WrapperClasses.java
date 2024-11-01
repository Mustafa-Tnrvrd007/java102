package Gun3.Ders2WrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {
        /*
        java'da primitive değişkenleri (int , float , boolean , double ...) zaman zaman non primitive
        gibi kullanmak gerekebilir . Burda devreye Wrapper classlar girer.
        Wrapper classlar kısaca primitive değişkenlerin Obje hali diyebiliriz.

        Temel Veri Tipi	          Wrapper Sınıf
            int	                    Integer
            byte	                Byte
            short	                Short
            long	                Long
            float	                Float
            double	                Double
            char	                Character
            boolean	                Boolean
         */

        int sayi = 5; // primitive
        Integer wrapperSayi = 5; // non primitive

        wrapperSayi.toString(); // toString() nesneyi String tipine dönüştütür.

        System.out.println("wrapperSayi+sayi = " + (wrapperSayi + sayi));
        System.out.println("wrapperSayi.toString() = " + wrapperSayi.toString());
        System.out.println("wrapperSayi.toString()+sayi = " + (wrapperSayi.toString() + sayi));

        String str = "1234";
        System.out.println("str = " + str);
        System.out.println("String str+ int sayi = " + (str + sayi));

        Integer.parseInt(str); // bu yontemle String değişken int değişkene dönüştürülür

        System.out.println("Integer.parseInt(str) + sayi = " + (Integer.parseInt(str) + sayi));


    }
}
