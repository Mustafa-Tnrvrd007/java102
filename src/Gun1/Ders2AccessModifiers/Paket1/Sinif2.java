package Gun1.Ders2AccessModifiers.Paket1;

public class Sinif2 {

    public void publicMetod (){
        System.out.print("Public ");
    }
    private void privateMetod(){
        System.out.print("Private ");
    }
    protected  void protectedMetod(){
        System.out.print("Protected ");
    }
    void defaultMetod(){
        System.out.print("Default ");
    }


    public void  metod (){
        this.privateMetod();
    }
    public void sinif1Degiskenleri(){
        Sinif1 yeni = new Sinif1();

        yeni.publicSayi *= 10; // public değişkene başka sınıftan erişildi
        publicMetod();
        yeni.yazdir(yeni.publicSayi);
        /*
        yeni.privateSayi *= 10 ; // private değişkene , aynı paketteki
        privateMetod();
        başka sınıftan erişilemedi
         */
        yeni.protectedSayi *=10; // protected değişkene başka sınıftan erişildi
        protectedMetod();
        yeni.yazdir(yeni.protectedSayi);

        yeni.defaultSayi *=10; // default değişkene başka sınıftan erişildi
        defaultMetod();
        yeni.yazdir(yeni.defaultSayi);
    }
}
