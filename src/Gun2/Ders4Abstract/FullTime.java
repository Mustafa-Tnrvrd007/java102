package Gun2.Ders4Abstract;

public class FullTime extends Calisan{ // sub class

    private int monthlySalary;

    // public abstract void yemekMolasi();
    // normal sınıflarda abstract metod olusturulamaz.


    public FullTime(String name , String department , int monthlySalary){
        super(name,department);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public double calculateSalary(){ // abstaract metod override edildi.
        return monthlySalary;
    }
}
