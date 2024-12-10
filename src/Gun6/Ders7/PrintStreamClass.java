package Gun6.Ders7;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *  PrintStream, özellikle veri yazmak için kullanılan bir çıktı akış sınıfıdır.
 *  Genellikle konsola veya dosyaya yazma işlemleri için tercih edilir.
 *  System.out bir PrintStream örneğidir.
 *
 * Öne Çıkan Özellikler:
 * Metin veya diğer verileri kolayca yazabilirsiniz.
 * Otomatik olarak satır sonu eklemek için println() gibi metotlar sunar.
 * Çıktıyı bir dosyaya veya başka bir hedefe yönlendirebilirsiniz.
 * IOException fırlatmaz, bu da kullanımını basitleştirir.
 * Ancak, bir hata durumunda akışı kontrol etmek için checkError() metodunu kullanabilirsiniz.
 * Örnek Kodlar:
 */

public class PrintStreamClass {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt");
             PrintStream ps = new PrintStream(fos)) {

            ps.println("Bu metin dosyaya yazılıyor.");
            ps.close(); // Akışı kapatıyoruz

            // Kapalı akışa yazmaya çalışıyoruz
            ps.println("Bu yazı başarısız olacak!");
            if (ps.checkError()) {
                System.out.println("Akışta bir hata tespit edildi.");
            }

        } catch (Exception e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        }
    }
}
