package Gun1.Ders4StaticBlocks;

public class StaticDeneme {
    public int degisken ;
    public StaticDeneme(int degisken){ // constructor
        this.degisken = degisken;
        System.out.println("Constructor çalıştı");
        // bu sınıftan nesne oluşturulacağı zaman çalışır.
    }
    { // isimsiz kod blogu
        System.out.println("Isimsiz kod blogu calisti");
        // static blok çalıştıktan sonra çalışır.
        // consructor'dan önce çalışır.
        // bulunduğu sınıf her kullanıldığında  çalışır.
    }
    static { // static kod blogu
        System.out.println("Static kod blogu calisti");
        // constructor' dan önce static blok çalışır
        // isimsiz blok'dan önce de çağrılır yani ilk static blok çalışır
        // ama sadece 1 kere çalışır
    }

    public static void main(String[] args) { // main metodu
        // bulunduğu sınıfta static blok yoksa ilk main metodu çalışır.
        System.out.println("Main metodu çalıştı ");
        StaticDeneme temp1 = new StaticDeneme(10);
        System.out.println("\n\ntemp1\n");
        StaticDeneme temp2 = new StaticDeneme(9);
        System.out.println("\n\ntemp2\n");
        StaticDeneme temp3 = new StaticDeneme(8);
        System.out.println("\n\ntemp3\n");
    }
}
