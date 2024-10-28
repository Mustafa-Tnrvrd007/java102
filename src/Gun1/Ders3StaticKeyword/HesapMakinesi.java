package Gun1.Ders3StaticKeyword;

public class HesapMakinesi {
    public static int islemSayisi = 0;
    public static  double toplama (double sayi1 ,double sayi2){
        islem();
        return sayi1 + sayi2;
    }
    public static  double cikarma (double sayi1 ,double sayi2){
        islem();
        return sayi1 - sayi2;
    }
    public static  double carpma (double sayi1 ,double sayi2){
        islem();
        return sayi1 * sayi2;
    }
    public static  double bolme (double sayi1 ,double sayi2){
        islem();
        return sayi1 / sayi2;
    }

    public static void islem(){
        islemSayisi++;
    }
}
