package Gun6.Ders2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream sınıfı, dosyalardan veri okumak için kullanılır.
 * Verileri byte cinsinden kullanır.
 */
public class FileInputStreamExample {
    public static void main(String[] args) {
        FileInputStream fis = null;
        // Dosyayı okumadan once onu olusturmak gerek
        File file = new File("C:\\javademos\\java102\\src\\Gun6\\Ders2\\ornek.txt");
        try {
            file.createNewFile();
            System.out.println("Dosya oluşturuldu: " + file.getName());
        } catch (Exception e) {
            System.out.println("Dosya zaten mevcut.");
        }

        try {

            // Dosyayı açma
            // Metod: FileInputStream(String name) constructor'ı
            // Belirtilen dosyayı okumak için bir FileInputStream nesnesi oluşturur.
            // Eğer dosya bulunamazsa FileNotFoundException fırlatır.
            fis = new FileInputStream("C:\\javademos\\java102\\src\\Gun6\\Ders2\\ornek.txt");

            // Dosyadan okuma
            // Metod: read()
            // Dosyadan bir byte okur ve int türünde döner.
            // Eğer dosyanın sonuna ulaşılırsa -1 döner.
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content); // Byte'ı karaktere çevirerek ekrana yazdırır.
            }

        } catch (FileNotFoundException e) {
            // Hata Yakalama: Dosya bulunamadığında
            System.out.println("Dosya bulunamadı.");
            e.printStackTrace();
        } catch (IOException e) {
            // Hata Yakalama: IO işlemleri sırasında
            System.out.println("Bir hata oluştu.");
            e.printStackTrace();
        } finally {
            // Kaynakları kapatma
            // Metod: close()
            // FileInputStream'i kapatır ve sistem kaynaklarını serbest bırakır.
            if (fis != null) {
                try {
                    fis.close();
                    System.out.println("FileInputStream kapatıldı.");
                } catch (IOException e) {
                    System.out.println("FileInputStream kapatılamadı.");
                    e.printStackTrace();
                }
            }
        }
    }
}
