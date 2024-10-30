package Gun2.Ders2Inheritance;

public class Manager extends Employee{
    // Manager sınıfı Employee sınıfından kalıtım (miras) alıyor.
    private int numOfEmployee;

    public Manager(String name , String department , int salary , int numOfEmployee){
        // alt sınıf constructorunda ust sınıfın özelliklerine yer vermek zorundadır.
        super(name,department,salary); // ust sınıfın constructoruna bilgi gönderiliyor.
        setNumOfEmployee(numOfEmployee);

    }

    public void raiseSalary( int amount){
        System.out.println("Calisanlara "+amount + " tl zam yapildi.");
    }

    /*
    Override yontemi üst sınıftaki bi metodu alt sınıf için değiştirmek amacıyla kullanılır.
    Ornekteki gibi Manager classı için showInfos metodunu yeniden tasarladık
    değişiklikler yaptık.
     */
    @Override
    public void showInfos(){
//        System.out.println("Bilgiler ... ");
//        System.out.println("isim : "+getName());
//        System.out.println("department : "+getDepartment());
//        System.out.println("maas : "+getSalary());
        super.showInfos();
        System.out.println("calisan sayisi: "+getNumOfEmployee());
    }




    public int  getNumOfEmployee(){
        return this.numOfEmployee;
    }
    public void setNumOfEmployee( int numOfEmPloyee){
        this.numOfEmployee =numOfEmPloyee;
    }
}
