package Gun2.Ders6Practise;

public class Gorevli extends Kisi implements IProcess{

    Gorevli(String isim , String soyIsim ,int id,int alinanKitapSayisi){
        super(isim,soyIsim,id,alinanKitapSayisi);

    }

    @Override
    public void calis (){
        System.out.println(this.getIsim() + " kütüphane işlerini yapıyor.");
    }

    public void kitaplariDuzenle(){
        System.out.println(this.getIsim()+" kitapları düzenliyor");

    }


    @Override
    public boolean oduncAlinabilirMi(Kisi kisi, Kitap kitap) {
        if (kisi.getAlinanKitapSayisi()>=3){
            System.out.println(kisi.getIsim() + " zaten 3 kitaba sahip yeni bir kitap alabilmesi için" +
                    "Once kitap iade etmesi lazım");
            return false;
        } else if (kitap.getOduncAlinabilir() == false) {
            System.out.println("Sorgulanan kitap Odunc alinmis ");
            return  false;
        }
        else {
            return true;
        }
    }

    @Override
    public void oduncVer(Kisi kisi, Kitap kitap) {
        if (oduncAlinabilirMi(kisi,kitap) == true){
            kisi.setAlinanKitapSayisi(kisi.getAlinanKitapSayisi()+1);
            kitap.setOduncAlinabilir(false);
            System.out.println(kitap.getKitapAdi()+" isimli kitap , "+
                    kisi.getIsim()+ " isimli ogrenciye odunc verilmistir");
        }else {
            System.out.println("Malesef kitabı veremiyoruz.");
        }
    }

    @Override
    public void iadeAl(Kisi kisi, Kitap kitap) {
        kisi.setAlinanKitapSayisi(kisi.getAlinanKitapSayisi()-1);
        kitap.setOduncAlinabilir(true);
        System.out.println(kisi.getIsim()+" isimli ogrenciden "+ kitap.getKitapAdi()+
                " isimli kitap iade alinmistir");
    }
}
