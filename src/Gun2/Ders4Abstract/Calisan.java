package Gun2.Ders4Abstract;

public abstract class Calisan { // abstract class
    private String name;
    private String department;


    /// Kalıtım varsa constructor zorunludur.
     Calisan(String name , String department){ // constructor
        setName(name);
        setDepartment(department);
    }

    public abstract double calculateSalary(); // abstract metod

     public void showInfo(){ // normal metod
         System.out.println("isim : "+getName());
         System.out.println("Departman : "+getDepartment());
     }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;

    }

}
