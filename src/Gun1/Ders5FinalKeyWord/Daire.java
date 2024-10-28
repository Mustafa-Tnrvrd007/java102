package Gun1.Ders5FinalKeyWord;

// public class Daire extends Cisim{
// final sınıflar extends edilemez
public class Daire extends Cember{
    public int yariCap;
    public static final double PI_SAYISI = 3.14;

    public Daire(int yariCap){
        this.yariCap = yariCap;
        // PI_SAYISI = 3.0;
        /*
        Final değişkenlere sadece 1 kere atama yapılır ve değeri değiştirilemez.
        Atama işlemi ya değişken oluşturulduğunda ya da constructorun içinde yapılır.
         */
    }

    public double alan (double r){

        return PI_SAYISI*(r*r);
    }
//    @Override
//    public final double cevre(double pi , double r){
//        return 2*pi*r;
//    }
    // final ile tanımlanmış metodlar override edilemez

}
