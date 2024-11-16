package Gun5.Ders5Practice1;

public class Book implements Comparable<Book>{
    private String isim;
    private String yazar;
    private int sayfa;

    Book(String isim , String yazar,int sayfa){
        setIsim(isim);
        setYazar(yazar);
        setSayfa(sayfa);
    }


    public  String  getIsim(){
        return this.isim;
    }
    public void setIsim(String isim){
        this.isim= isim;
    }
    public String getYazar(){
        return this.yazar;
    }
    public void setYazar(String yazar){
        this.yazar = yazar;
    }
    public int getSayfa(){
        return this.sayfa;
    }
    public void setSayfa(int sayfa){
        this.sayfa = sayfa;
    }

    @Override
    public int compareTo(Book o) {
        return getIsim().compareTo( o.getIsim() );
        // iki ismi karşılaştırır
    }

    @Override
    public String toString() {
        return getIsim()+"\t" + getSayfa()+"\t"+ getYazar();
    }
}
