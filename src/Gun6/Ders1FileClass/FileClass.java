package Gun6.Ders1FileClass;
import java.io.File;
import java.io.IOException;

/**
 * File sınıfı ile yeni bir dosya veya dizin/klasör oluşturulabilir.
 * Bu olusturulan dosyalarla işlem yapılabilir
 */
public class FileClass {
    public static void main(String[] args) {

        // File sınıfı ile bu şekilde dosya oluşturulur. File constructoru string veri alır.
        // Bu veri dosyanın adı veya yoludur.
        // File file = new File("ornek.txt);

        File file = new File("C:\\javademos\\java102\\src\\Gun6\\Ders1FileClass/ornek.txt");

        try {
            // Dosya oluşturma
            // Metod: createNewFile()
            // Bu metod, belirtilen ad ve yol ile bir dosya oluşturur.
                // Eğer dosya zaten varsa false döner.
            // Dönen Değer: boolean (true - dosya başarıyla oluşturuldu, false - dosya zaten mevcut)

            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu: " + file.getName());
            } else {
                System.out.println("Dosya zaten mevcut.");
            }

            // Klasör oluşturma
            // Metod: mkdir()
            // Belirtilen ad ve yol ile bir klasör oluşturur.
                // Eğer klasör zaten varsa veya yol hatalıysa false döner.
            // Dönen Değer: boolean (true - klasör başarıyla oluşturuldu, false - oluşturulamadı)
            File klasor = new File("C:\\javademos\\java102\\src\\Gun6\\Ders1FileClass/YeniKlasor");
            if (klasor.mkdir()) {
                System.out.println("Klasör oluşturuldu.");
            }


            // Klasör içeriğini listeleme
            // Metod: list()
            // Bir klasörün içindeki dosya ve alt klasörlerin isimlerini String dizisi olarak döndürür.
            // Dönen Değer: String[] (içerik isimleri), null (klasör boşsa veya hata oluşursa)
            String[] icerik = klasor.list();
            if (icerik != null) {
                for (String isim : icerik) {
                    System.out.println(isim);
                }
            }

            // Dosya silme
            // Metod: delete()
            // Dosya veya klasörü siler. Silme işlemi başarısız olursa false döner.
            // Dönen Değer: boolean (true - başarıyla silindi, false - silinemedi)
//            if (file.delete()) {
//                System.out.println("Dosya silindi: " + file.getName());
//            }

        } catch (IOException e) {
            // Hata Yakalama
            // Açıklama: Dosya işlemleri sırasında oluşabilecek IO hatalarını yakalar ve detaylı bilgi verir.
            System.out.println("Bir hata oluştu.");
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
}
