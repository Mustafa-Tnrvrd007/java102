package Gun4.Ders1TryCatch;

public class Main {
    public static void main(String[] args) {
        /*
        try bloğuna yazılan kodlar çalıştırılırken bir hata oluşursa,
        bu hata catch bloğu tarafından yakalanır.
        Böylece program, hatayı kontrol altına alarak belirtilen kodları çalıştırmaya devam edebilir.
         */
        try {
            // Hata oluşabilecek kod buraya yazılır
            int result = 10 / 0; // Bu satırda ArithmeticException oluşur
            System.out.println("Sonuç: " + result);
        } catch (ArithmeticException e) {
            // Hata durumunda yapılacak işlemler buraya yazılır
            System.out.println("Bir hata oluştu: " + e.getMessage());
        }


        /*
        Bir try bloğunda birden fazla türde hata oluşabilir.
        Bu nedenle, farklı türde hataları yakalamak için birden fazla catch bloğu kullanılabilir.
         */
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizi sınırlarının dışında bir elemana erişmeye çalıştınız.");
        } catch (ArithmeticException e) {
            System.out.println("Aritmetik bir hata oluştu: " + e.getMessage());
        }

        /*
        try-catch yapısında isteğe bağlı olarak kullanılan finally bloğu,
         hata oluşup oluşmadığına bakılmaksızın her durumda çalışır.
         */
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        } finally {
            System.out.println("Bu kısım her durumda çalışır.");
        }

        /*
        Bir catch bloğunda, yakalanan hatanın detaylarını almak için
        Exception nesnesini kullanabilirsiniz. getMessage() ile hata mesajını alabilir,
         printStackTrace() ile hatanın oluştuğu satırları görebilirsiniz.
         */
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Hata mesajı: " + e.getMessage());
            e.printStackTrace(); // Hata izleme bilgisi
        }

    }
}
