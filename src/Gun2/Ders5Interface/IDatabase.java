package Gun2.Ders5Interface;

public interface IDatabase {
    // interface'ler diğer sınıflar için bir şablon niteliğindedir.
    // içinde ( gövdesiz / abstract ) metodlar veya final değişkenler bulunur.


    public abstract void add(); // abstract metod
    public abstract void delete();
    public  void update(); // gövdesiz metod
    public  void get();


}
