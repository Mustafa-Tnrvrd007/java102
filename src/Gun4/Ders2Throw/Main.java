package Gun4.Ders2Throw;

public class Main {
    public static void main(String[] args) {
        int sayi = -15;
        try {
            CheckPositive.run(-15); // Burada hata oluşacak
        } catch (Exception e) {
            System.out.println("Hata yakalandı: " + e.getMessage());
        }
    }
}
