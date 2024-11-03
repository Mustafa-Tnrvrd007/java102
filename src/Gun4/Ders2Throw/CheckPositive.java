package Gun4.Ders2Throw;

public class CheckPositive {
    public static void run(int number) throws Exception{
        // metod içinde hata fırlatılıyorsa bunu throws ile metodu kullanacak kişiye bildirilir.
        // metodu kullanacak kişi bu metodu try-catch blokları içinde kullanmalıdır
        if (number < 0) {
            throw new Exception("Sayı negatif olamaz: " + number);
            // metodda throw ile yeni bir exception olusturulur
        }
        System.out.println("Sayı geçerli: " + number);
    }
}
