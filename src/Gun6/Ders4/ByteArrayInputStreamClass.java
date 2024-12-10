package Gun6.Ders4;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamClass {
    public static void main(String[] args) {
        byte[] byteArray = "Merhaba Java".getBytes(); // byte arrayine String tipindeki veriler
        // bayte tipine dönüştürülerek atandı

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        // stream oluşturduk . byteArray i parametre olarak aldı

        //byteArrayInputStream.read();
        //byteArrayInputStream.available();
        //byteArrayInputStream.skip();

        System.out.println("Okunan veriler:");
        int data;

        // İlk birkaç karakteri okuyalım
        for (int i = 0; i < 7; i++) {
            data = byteArrayInputStream.read();
            System.out.print((char) data);
        }
        // read() metodu iterator gibi çalışır en baştakini veya kaldığı yerden okuyup sonrakine geçer.

        // Mevcut konumu işaretleyelim
        byteArrayInputStream.mark(0); // iteratorun bulunduğu yeri işaretler
        // yani bu noktayı artık merkez nokta kabulş eder.
        // reset metodu kullanıldığında iterator bu noktayı gösterir

        System.out.println("\nKonum işaretlendi. Sonraki birkaç karakter:");
        for (int i = 0; i < 4; i++) {
            data = byteArrayInputStream.read();
            System.out.print((char) data);
        }

        // İşaretli konuma geri dönelim
        byteArrayInputStream.reset();
        System.out.println("\nReset'ten sonra tekrar işaretli konumdan okuma:");
        for (int i = 0; i <= 4; i++) {
            data = byteArrayInputStream.read();
            System.out.print((char) data);
        }
        System.out.println();


    }
}
