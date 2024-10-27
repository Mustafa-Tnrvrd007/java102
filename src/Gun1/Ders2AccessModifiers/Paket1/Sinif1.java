package Gun1.Ders2AccessModifiers.Paket1;

public class Sinif1 {

    public int publicSayi = 1; // public değişken
    private  int privateSayi = 2; // private değişken
    protected  int protectedSayi = 3; // protected değişken
    int defaultSayi = 4; // default değişken

    public  void yazdir (int sayi){ // public metod
        // public değişkene bulunduğu sınıf içinden erişildi
        System.out.println("Değişken : "+sayi);
    }


}
