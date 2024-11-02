package Gun3.Ders6GenericBoundedTypes;

public class HesapMakinesi <Type extends Number>{
    /*
    <Type extends Number> ifadesi bir bounded Type'dir. Yani sınırlandırılmış tip
    <Type> olsaydı String , Character veya herhangi bir obje Type ' nin yerini alabilirdi

    <Type extends Number> ifadesi Type nin Number sınıfından kalıtım alması anlamına geliyor.
    Boylece Type sadece Number sınıfının alt sınıflarını alabilir. Integer , Float, Double
     */
    public Type sayi1;
    public Type sayi2;

    public double topla(Type sayi1 , Type sayi2){
        double sonuc = sayi1.doubleValue()+ sayi2.doubleValue();
        System.out.println(sayi1+" + "+sayi2+" = " + sonuc);
        return sonuc;
    }
    public double cikar(Type sayi1 , Type sayi2){
        double sonuc = sayi1.doubleValue() - sayi2.doubleValue();
        System.out.println(sayi1+" - "+sayi2+" = " + sonuc);
        return sonuc;
    }
    public double carp(Type sayi1 , Type sayi2){
        double sonuc = sayi1.doubleValue() * sayi2.doubleValue();
        System.out.println(sayi1+" * "+sayi2+" = " + sonuc);
        return sonuc;
    }
    public double bol(Type sayi1 , Type sayi2){
        double sonuc = sayi1.doubleValue() / sayi2.doubleValue();
        System.out.println(sayi1+" / "+sayi2+" = " + sonuc);
        return sonuc;
    }
}
