package Gun6.Ders3;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream sınıfı, dosyalara veri yazmak için kullanılır.
 */
public class FileOutputStreamExample {
    public static void main(String[] args) {
        FileOutputStream fos = null;

        try {
            // Dosyayı açma veya oluşturma
            // Metod: FileOutputStream(String name) constructor'ı
            //  Belirtilen dosyayı açar veya dosya yoksa oluşturur.
            //  Eğer dosya zaten varsa üzerine yazar.( içini boşaltır )
            // true parametresi , dosyanın üzerine yazmayı engelleyip , dosyanın sonuna yazmamızı sağlar.
            String dosyaYolu = "C:\\javademos\\java102\\src\\Gun6\\Ders3\\ornek_output.txt";
            fos = new FileOutputStream(dosyaYolu,true);

            // Dosyaya yazma
            // Metod: write(int b)
            // Açıklama: Verilen bir byte veriyi dosyaya yazar.
            fos.write(65); // ASCII değeri 65 olan 'A' karakterini dosyaya yazar.

            // Metod: write(byte[] b)
            // Açıklama: Belirtilen byte dizisini dosyaya yazar.
            String veri = "ADSasdsdfklnxcklvjkjasdfhoıhuoıfhuıwe";
            byte[] byteDizi = veri.getBytes(); // String'i byte dizisine çevirerek dosyaya yazar.
            fos.write(byteDizi);

            System.out.println("Veri dosyaya başarıyla yazıldı.");

        } catch (IOException e) {
            // Hata Yakalama: IO işlemleri sırasında
            System.out.println("Bir hata oluştu.");
            e.printStackTrace();
        } finally {
            // Kaynakları kapatma
            // Metod: close()
            // FileOutputStream'i kapatır ve sistem kaynaklarını serbest bırakır.
            if (fos != null) {
                try {
                    fos.close();
                    System.out.println("FileOutputStream kapatıldı.");
                } catch (IOException e) {
                    System.out.println("FileOutputStream kapatılamadı.");
                    e.printStackTrace();
                }
            }
        }
    }
}
