package Gun2.Ders6Practise;

public class Kitap {
    private String kitapAdi;
    private String yazarAdi;
    private int isbn;
    private boolean oduncAlinabilir;

    Kitap(String kitapAdi , String yazarAdi , int isbn,boolean oduncAlinabilir){
        setKitapAdi(kitapAdi);
        setYazarAdi(yazarAdi);
        setIsbn(isbn);
        setOduncAlinabilir(oduncAlinabilir);
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean getOduncAlinabilir() {
        return oduncAlinabilir;
    }

    public void setOduncAlinabilir(boolean oduncAlinabilir) {
        this.oduncAlinabilir = oduncAlinabilir;
    }
}
