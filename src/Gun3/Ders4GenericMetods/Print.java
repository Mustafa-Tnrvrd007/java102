package Gun3.Ders4GenericMetods;

public class Print {

    public static <Type> void arrayPrint(Type[] array){
        /*
        metodlarda generic tanımlama yaparken ilk önce generic yapı ------->  <Type> ,
        sonra metodun döndüreceği tip yazılır                       ----------->void
        generic yapı belirlendikten sonra <> işaretlerine gerek yoktur.
        tip değişkenini normal bir değişken türü gibi kullana biliriz.
        int sayi = 10;     ------>   Type sayi = 10;
        char harf = 'A' ;  ------>   Type harf = 'A';
         */

        System.out.println();
        for (Type i : array){
            System.out.println(i);
        }
        System.out.println();
    }

}
