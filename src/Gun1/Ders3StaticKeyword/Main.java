package Gun1.Ders3StaticKeyword;

public class Main {
    public static void main(String[] args) {
        Student ogr = new Student("Ayşe",13);
        ogr.selamla();
        // burda ogr nesnesi ile static olmayan değişkenelere erişim sağlayacağız
        ogr.name= " Aleyna";
        ogr.no = 46;
        ogr.selamla();

        System.out.println("\n\n##############\n");

        Student ogr1 = new Student("Ali",24);
        System.out.println("ogr sayisi = "+ogr1.ogrenciSayisi);
        // static değişkenlere istersek nesne üzerinden de erişebiliriz

        Student ogr2 = new Student("Emine",55);
        System.out.println("ogr sayisi = "+Student.ogrenciSayisi);

        Student ogr3 = new Student("Furkan",67);
        System.out.println("ogr sayisi = "+Student.ogrenciSayisi+"\n");
        Student.ogrenciSayisiYazdir();

        ///////////////////////////
        System.out.println("\n\n\n\n");

        System.out.println("7 + 8 = "+HesapMakinesi.toplama(7,8));
        System.out.println("20 - 9 = "+HesapMakinesi.cikarma(20,9));
        System.out.println("8 * 4 = "+HesapMakinesi.carpma(8,4));
        System.out.println("96 + 9 = "+HesapMakinesi.bolme(96,9));

        System.out.println("Gerçekleştirilen işlem sayisi : "+HesapMakinesi.islemSayisi);
    }
}
