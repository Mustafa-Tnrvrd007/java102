package Gun2.Ders2Inheritance.Ders;

public class Main {
    public static void main(String[] args) {
        Employee calisan = new Employee("Aysun","Bilisim",35000);
        // calisan.showInfos();
        Manager yonetici = new Manager("Deniz","Bilisim",55000,10);
        yonetici.showInfos();
        yonetici.raiseSalary(1500);

    }
}
