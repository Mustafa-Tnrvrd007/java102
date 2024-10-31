package Gun2.Ders5Interface;

public class Oracle implements IDatabase {

    @Override
    public void add() {
        System.out.println("Oracle veri ekleme");
    }

    @Override
    public void delete() {
        System.out.println("Oracle veri silme");

    }

    @Override
    public void update() {
        System.out.println("Oracle veri guncelleme");

    }

    @Override
    public void get() {
        System.out.println("Oracle veri getirme");

    }
}
