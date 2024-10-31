package Gun2.Ders6Practise;

public class Ogrenci extends Kisi{

    Ogrenci(String isim , String soyIsim , int id , int alinanKitapSayisi){
        super(isim,soyIsim,id, alinanKitapSayisi);
    }
    @Override
    public void calis(){
        System.out.println(this.getIsim() + " ders calisiyor.");
    }

    public void dersCalis(){
        System.out.println(this.getIsim() + " ders calisiyor.");
    }

}
