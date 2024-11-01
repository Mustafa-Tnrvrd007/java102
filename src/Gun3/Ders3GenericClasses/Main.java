package Gun3.Ders3GenericClasses;

public class Main {
    public static void main(String[] args) {

        String str = "Hello World";
        Nullable<String> nesne = new Nullable<String>(str);
        // generic sınıf tanımlarken <> işaretleri arasına bir wrapper sınaf yazmak zorundayız
        // böylece içeriye vereceğimiz değişkenin tipini belirtmiş oluruz
        // yani bu örnekte constructora  String değer atacaksak <String>
        // int deger atacaksak <Integer> ifadesini kullanmalıyız.
        // tipler yanlış belirtilirse hata verir
        // örnek :
        // int deger = 1234;
        //Nullable<String> nesne1 = new Nullable<String>(deger);

        nesne.run();

        Integer sayi = 538;
        Nullable<Integer> obje = new Nullable<>(sayi);// 2. <> işareti boş bırakılabilinir.
        obje.run();

        ///////////////////////
        System.out.println("\n\n\n");
        ///////////////
        /*
        Generic iifadelerle birden fazla tip değişkeni kullanabiliriz.
        Bunu kullanırken sıralamaya dikkat etmek lazım .
        örnek :
        <Integer ,String > ise sıralama
        int sayi = 5; String str = "abcd";
        <str , sayi > ile constructora deger gönderilirse hata verir.
         */

        int a = 10;
        String b = "merhaba";
        double c = 3.14;

        Test<Integer,String,Double> test = new Test<>(a,b,c);

        // Test<Integer,String,Double> test = new Test<>(c,a,b);
        // tip sıralaması ile değişkenlerin sıralaması uyuşmadığı için hata verdi.
        /*
        <Integer> ----->  <c> /// <String>  ----->  <a> /// <Double> -----> <b>   olmuş oldu
         */
        test.showInfo();



    }
}
