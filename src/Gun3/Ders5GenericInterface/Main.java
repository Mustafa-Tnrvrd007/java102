package Gun3.Ders5GenericInterface;

public class Main {
    public static void main(String[] args) {

        Student ogr1 = new Student("Ali",931,false);
        Student ogr2= new Student("Mehmet",123,true);
        Student ogr3 = new Student("Ayşe",544,false);
        MySql sql = new MySql();

        sql.insert(ogr1);
        sql .update(ogr2);
        sql.delete(ogr3);

    }
}
