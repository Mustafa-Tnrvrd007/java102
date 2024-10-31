package Gun2.Ders5Interface;

public class MongoDB implements IDatabase{
    @Override
    public void add(){
        System.out.println("MongoDB veri ekleme");
    }
    @Override
    public void delete(){
        System.out.println("MongoDB veri silme");
    }
    @Override
    public void update(){
        System.out.println("MongoDb veri guncelleme");
    }
    @Override
    public void get(){
        System.out.println("MongoDB veri getirme");
    }
}
