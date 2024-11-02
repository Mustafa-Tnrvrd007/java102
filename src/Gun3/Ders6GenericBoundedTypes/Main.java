package Gun3.Ders6GenericBoundedTypes;

public class Main {
    public static void main(String[] args) {

        HesapMakinesi hesap = new HesapMakinesi();
        hesap.topla(2,3); // int , int

        // hesap.topla("55",12);
        /*
        <Type extends Number> ifadesinden dolayı hata verdi , çünkü "55" ifadesi bir String ve
        number sınıfının alt sınıfı değildir.
         */

        hesap.cikar(15,7.1); // int , double

        hesap.carp(7, 0xA); // int , hexadecimal
        hesap.bol(86,3.12345678); // int , double
    }
}
