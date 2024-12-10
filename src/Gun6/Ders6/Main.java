package Gun6.Ders6;

import java.io.*;

/**
 * BufferedInputStream Nedir?
 * BufferedInputStream, bir veri akışından (InputStream) okuma işlemlerini hızlandırmak
 * için bir tampon (buffer) kullanır.
 * Tampon, diskten sık sık okuma yapmayı engelleyerek performansı artırır.
 * Veriler, tampon belleğe bir kez yüklenir ve daha sonra bu tampon üzerinden işlenir.
 *
 * BufferedInputStream Özellikleri :
 * Bir dosyadan veya ağdan byte byte okumak yerine, bir blok veri okur.
 * Temel sınıfı FilterInputStream'dir ve veri akışlarını sarmak (wrap etmek) için kullanılır.
 *
 * BufferedOutputStream Nedir?
 * BufferedOutputStream, bir veri akışına (OutputStream) yazma işlemlerini
 * hızlandırmak için bir tampon kullanır.
 * Veriler doğrudan hedefe (ör. bir dosya) yazılmaz; önce tampon belleğe yazılır ve
 * tampon dolduğunda hedefe aktarılır.
 *
 * BufferedOutputStream Özellikleri :
 * Her yazma işlemi için disk veya ağ üzerinde işlem yapmaktan kaçınır.
 * Verileri toplar ve bir defada yazarak I/O performansını artırır.
 *
 * BufferedInputStream ve BufferedOutputStream Avantajları
 * Daha Hızlı Performans: Sık sık disk veya ağ erişimi yapmaktan kaçınarak performansı artırır.
 * Verimli İşlem: Blok halinde veri okuma ve yazma.
 * Esnek Kullanım: Çeşitli veri kaynakları ve hedefleriyle çalışabilir.
 */

public class Main {
    public static void main(String[] args) {
        String dosya = "C:\\javademos\\java102\\src\\Gun6\\Ders6\\";
        try {
//            File file = new File(dosya+"source.txt");
//            file.createNewFile();
            FileInputStream inputFile = new FileInputStream(dosya+"source.txt");
            BufferedInputStream bis = new BufferedInputStream(inputFile);

            FileOutputStream outputFile = new FileOutputStream(dosya+"destination.txt",true);
            BufferedOutputStream bos = new BufferedOutputStream(outputFile);

            int data=0;
            while ((data = bis.read())  != -1) {

                System.out.println("bir karakter kopyalandı : "+ data);
                bos.write(data);
            }
            bos.flush(); // Yazma işlemini tamamlar
            // ön belleğe alınan byte elemanları dosyaya aktarır.

            System.out.println("Dosya başarıyla kopyalandı.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
