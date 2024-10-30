package Gun2.Ders4Abstract;


public class Main {
    public static void main(String[] args) {

        //Calisan personel = new Calisan ("Ahmet", "Lojistik");
        // abstract classlardan nesne oluşturulamaz

        Calisan full = new FullTime("Ali","Yazilim",56000);
        // üst sınıfın referansından alt sınıf nesnesi oluşturabiliyoruz.

        full.showInfo();
        System.out.println(full.getName()+"'nin maasi : "+full.calculateSalary());

        //////////////////
        System.out.println("\n\n");
        ////////////
        Calisan part = new PartTime("Irem","Insan Kaynaklari",550,60);
        part.showInfo();
        System.out.println(part.getName()+"'nin maasi : "+part.calculateSalary());


    }
}
