package Gun2.Ders4Abstract;

public class PartTime extends Calisan { // sub class

    private double hourlyWage;
    private double workingHours;

    PartTime(String name, String department, double hourlyWage, double workingHours) {
        super(name, department);
        this.hourlyWage = hourlyWage;
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() { // abstarct metod override edildi
        return  hourlyWage*workingHours;
    }
}
