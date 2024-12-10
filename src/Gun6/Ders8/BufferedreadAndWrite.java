package Gun6.Ders8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * BufferedReader Sınıfı
 * BufferedReader, metin dosyalarından satır satır veya tamponlu
 * şekilde karakter okuma işlemini kolaylaştırır.
 *
 * Özellikler
 * Tamponlama: Birden fazla karakteri bellekte tamponlar, böylece okuma işlemi hızlanır.
 * Satır Okuma: readLine() metodu, satır sonuna kadar olan veriyi alır.
 * Kaynaklar: Herhangi bir Reader (örneğin FileReader) ile çalışabilir.
 *
 *
 * BufferedWriter Sınıfı
 * BufferedWriter, bir dosyaya tamponlu şekilde karakter yazma işlemini kolaylaştırır.
 *
 * Özellikler
 * Tamponlama: Veriyi bellekte tamponlayarak daha az sayıda disk yazma işlemi gerçekleştirir.
 * Satır Ekleme: newLine() metodu ile platforma uygun bir satır sonu karakteri ekler.
 * Kaynaklar: Herhangi bir Writer (örneğin FileWriter) ile çalışabilir.
 *
 *
 *
 */

public class BufferedreadAndWrite {
    public static void main(String[] args) {
        String dosya = "C:\\javademos\\java102\\src\\Gun6\\Ders8\\";



        try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosya+"bufFile.txt"))) {
            bw.write("Beni yoran bu zaman\n" +
                    "Paranoyalarım gelir zaman zaman\n" +
                    "Beni yoran bu adam\n" +
                    "Öldürür beni zaman zaman\n" +
                    "Söyle, kimdir bu yabancı?\n" +
                    "Zaten çevremizdeki herkes yalancı\n" +
                    "Kaybettim kendimi, çoktan aklımı\n" +
                    "Beni bulursan haber et\n" +
                    "Ağlarım, ne bu tantana, kıyamet?\n" +
                    "Der bana, \"Bu dünya neye, neye, neye alamet?\"");
            bw.newLine(); // Yeni satıra geç
            bw.write("##############");
            System.out.println("Dosya başarıyla yazıldı!");
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }


        // Bufferedread
        try (BufferedReader br = new BufferedReader(new FileReader(dosya+"bufFile.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                //readLine() metodu, satır sonuna (\n) kadar olan veriyi okur.
                //Dönen null değeri, dosyanın sonuna ulaşıldığını gösterir.
                System.out.println(line); // Satırı yazdır
            }


        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }

    }
}
