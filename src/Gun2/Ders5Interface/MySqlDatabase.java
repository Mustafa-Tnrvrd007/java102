package Gun2.Ders5Interface;

public class MySqlDatabase implements IDatabase {
    // interface implements edildi.
    @Override
    public void add() {
        System.out.println("MySql veri ekleme");
    }

    @Override
    public void delete() {
        System.out.println("MySql veri silme");

    }

    @Override
    public void update() {
        System.out.println("MySql veri guncelleme");

    }

    public void get() {
        System.out.println("MySql veri getirme");

    }

}
