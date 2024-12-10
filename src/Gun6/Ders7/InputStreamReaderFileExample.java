package Gun6.Ders7;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 InputStreamReader Nedir?
 Bayt tabanlı bir akışı (InputStream), karakter tabanlı bir akışa (Reader) dönüştürmek için kullanılır.
 Özellikle metin tabanlı veri okumada tercih edilir.
 Karakter seti (UTF-8, ISO-8859-1, vb.) belirtilebilir.
 Kullanım Alanları
 Konsoldan veri okuma: System.in kullanılarak kullanıcıdan giriş almak.
 Dosyalardan veri okuma: Bayt tabanlı bir dosya akışını karakterlere dönüştürmek.
 Ağ iletişimi: Soket tabanlı iletişimde metin verilerini işlemek.
 Kodlama yönetimi: Farklı karakter setlerini destekler.
 */

public class InputStreamReaderFileExample {
    public static void main(String[] args) {
        String dosya = "C:\\javademos\\java102\\src\\Gun6\\Ders7\\";
        try (FileInputStream fis = new FileInputStream(dosya+"example.txt");
             InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        }
    }
}