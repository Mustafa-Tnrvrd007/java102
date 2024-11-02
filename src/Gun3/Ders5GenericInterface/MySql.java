package Gun3.Ders5GenericInterface;

public class MySql implements IDatabase<Student>{



    public String dataString(Student student)  {
        String str = "isim : "+student.getIsim() + "\tnumara : "+student.getNumara()+
                "\tmezun oldu : "+student.getMezunMu();

        return str;
    }

    @Override
    public boolean delete(Student data) {

        System.out.println("silinen veri = " + dataString(data));
        return true;
    }

    @Override
    public boolean insert(Student data) {
        System.out.println("eklenen veri = " + dataString(data));
        return true;
    }

    @Override
    public boolean update(Student data) {
        System.out.println("guncellenen veri = " + dataString(data));

        return true;
    }

    @Override
    public void select() {
        System.out.println("veri getiriliyor");
    }


}
