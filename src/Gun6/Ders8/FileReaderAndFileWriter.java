package Gun6.Ders8;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * FileReader Sınıfı
 * FileReader, bir dosyadan karakter tabanlı veri okumak için kullanılır.
 * Bayt tabanlı veri değil, metin dosyalarını okumaya yöneliktir.
 *
 * Kullanımı
 * Bir dosyanın içeriğini satır satır veya tüm karakterleri okuyarak işler.
 * Varsayılan olarak platformun varsayılan karakter setini kullanır.
 *
 * FileWriter Sınıfı
 * FileWriter, bir dosyaya karakter tabanlı veri yazmak için kullanılır.
 *
 * Kullanımı
 * Yeni bir dosya oluşturur veya mevcut dosyanın üzerine yazar.
 * Mevcut dosyanın sonuna ekleme yapmak için true parametresiyle açılabilir.
 */
public class FileReaderAndFileWriter {
    public static void main(String[] args) {
        /// File Writer
        String dosya = "C:\\javademos\\java102\\src\\Gun6\\Ders8\\";
        String data = "Gelse bile son günüm\n" +
                "Koluna alsa ölüm\n" +
                "Gözlerimin önünde\n" +
                "Seninle geçen günüm\n" +
                "Senden sonra kalbimi\n" +
                "Sevgilere kapadım\n" +
                "Ben seninle o günü\n" +
                "Bin yıl gibi yaşadım\n" +
                "Son arzun nedir diye\n" +
                "Gelip de bana sorsalar\n" +
                "Gözlerime bakıp da\n" +
                "Her şeyi anlasalar";

        try {
            FileWriter output = new FileWriter(dosya+"file.txt");
            output.write(data);

            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

        // File Reader
        try {
            FileReader input = new FileReader(dosya+"file.txt");

            int data1 = input.read();
            while (data1 != -1) {
                System.out.print((char) data1);
                data1 = input.read();
            }

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        System.out.println();



    }
}
