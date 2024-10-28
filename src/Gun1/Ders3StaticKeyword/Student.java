package Gun1.Ders3StaticKeyword;

public class Student {

    // non - static veriables
    public String name;
    public int no;
    /*
    Burdaki name ve no değişkenleri Objeye ait değişkenlerdir.
    Yani Student sınıfından bir nesne oluşturmadan bu değişkenlere erişemeyiz.
    Aynı şey metodlar için de geçerli
     */

    public static int ogrenciSayisi = 0;   // static veriable

    public Student(String name , int no){
        this.name = name;
        this.no = no;
        ogrenciSayisi ++;   // static değişken arttırıldı
    }
    public void selamla(){ // non - static metods
        System.out.println("Merhaba ben "+this.name+" , numaram : " +this.no);
    }

    public static void ogrenciSayisiYazdir(){
        System.out.println("Toplam "+ogrenciSayisi+" tane ogrenci var.");
        /*
        System.out.println(this.name);
        // static metodlarda non static değişkenler veya metodlar kullanılmaz
        // hata verir çünkü static metod ve değişkenler program başlamadan hafızada yer kaplar
        // hafızada yer tuttukları için ve non-static değişkenler ve metodlar
        // null yani boş olduğu için hata verir
         */
    }
}
