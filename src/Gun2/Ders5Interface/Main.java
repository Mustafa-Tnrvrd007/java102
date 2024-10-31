package Gun2.Ders5Interface;

public class Main {

    public static void main(String[] args) {
        DatabaseManager manager = new DatabaseManager();
        MySqlDatabase mySql = new MySqlDatabase();
        MongoDB mongo = new MongoDB();

        manager.addDatabase(mySql);
        manager.deleteDatabase(mySql);

        manager.addDatabase(mongo);
        manager.deleteDatabase(mongo);

        ////

        Oracle oracle = new Oracle();

        manager.addDatabase(oracle);
        manager.updateDatabase(oracle);
        manager.getDatabase(oracle);
        manager.deleteDatabase(oracle);

    }


}
