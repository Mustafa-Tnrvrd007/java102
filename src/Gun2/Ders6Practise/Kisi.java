package Gun2.Ders6Practise;

public abstract class Kisi {
    private String isim;
    private String soyisim;
    private int id;
    private int alinanKitapSayisi;

    Kisi(String isim , String soyIsim,int id , int alinanKitapSayisi){
        setIsim(isim);
        setSoyisim(soyIsim);
        setId(id);
        setAlinanKitapSayisi(alinanKitapSayisi);
    }

    public void giris(){
        System.out.println(this.getIsim()+ " kütüphaneye girdi .");
    }
    public void cikis(){
        System.out.println(this.getIsim() + "kütüphaneden çıktı");
    }

    public abstract void calis();


    public String getIsim(){
        return this.isim;
    }
    public void setIsim(String isim){
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlinanKitapSayisi() {
        return alinanKitapSayisi;
    }

    public void setAlinanKitapSayisi(int alinanKitapSayisi) {
        this.alinanKitapSayisi = alinanKitapSayisi;
    }
}
