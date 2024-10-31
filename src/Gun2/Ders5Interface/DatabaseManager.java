package Gun2.Ders5Interface;

public class DatabaseManager {
    public void addDatabase(IDatabase database){
        database.add();
    }
    public void deleteDatabase(IDatabase database ){
        database.delete();
    }
    public void updateDatabase (IDatabase database ){
        database.update();
    }
    public void getDatabase (IDatabase database){
        database.get();
    }
}
