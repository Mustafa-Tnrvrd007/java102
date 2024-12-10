package Gun6.Ders7;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;

/**
 * OutputStreamWriter Nedir ve Ne İçin Kullanılır?
 * OutputStreamWriter, karakter tabanlı bir akışı (Writer),
 * bayt tabanlı bir akışa (OutputStream) dönüştürmek için kullanılan bir köprü sınıfıdır.
 * Bu sınıf, karakterleri belirli bir kodlama ile bayt olarak yazar. Özellikle metin
 * yazma işlemlerinde tercih edilir.
 *
 * Detaylı Özellikler
 * Karakter-Bayt Çevirisi:
 * Karakter tabanlı verileri (char, String vb.) bayt tabanlı bir forma dönüştürerek OutputStream'e yazar.
 * Kodlama Desteği:
 * Yazma sırasında özel karakter setleri (UTF-8, ISO-8859-1, vb.) kullanabilirsiniz.
 * Kullanım Alanı:
 * Dosyalara metin yazma, ağ bağlantıları veya diğer bayt tabanlı çıktı kaynakları için uygundur.
 */

public class OutputStreamWriterExample {
    public static void main(String[] args) {
        String dosya = "C:\\javademos\\java102\\src\\Gun6\\Ders7\\";
        try (FileOutputStream fos = new FileOutputStream(dosya+"output.txt");
             OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8")) {

            // Dosyaya yazılacak metin
            osw.write("Merhaba, dünya!\n");
            osw.write("Bu bir OutputStreamWriter örneğidir.");

            System.out.println("Metin başarıyla yazıldı!");

        } catch (IOException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
