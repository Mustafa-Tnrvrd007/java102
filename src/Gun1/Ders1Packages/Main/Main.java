package Gun1.Ders1Packages.Main;

import Gun1.Ders1Packages.HesapMakinesi.DortIslem;
// burda kullanacağımız paketi projeye dahil ettik

public class Main {

    public  static void main (String[] args){
        DortIslem islem = new DortIslem();
        System.out.println("2 + 3 : " +islem.topla(2,3) );
        System.out.println("5 - 1 : " +islem.cikar(5,1) );
        System.out.println("4 * 7 : " +islem.carp(4,7) );
        System.out.println("48 / 2 : " +islem.bol(48,2) );
    }
}
