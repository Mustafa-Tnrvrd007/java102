package Gun6.Ders4;

import java.io.ByteArrayOutputStream;
/*
write(int b): Tek bir byte yazar.
write(byte[] b, int off, int len): Byte dizisinden belirli bir bölümü yazar.
toByteArray(): Tampondaki tüm veriyi bir byte dizisi olarak döner.
size(): Yazılan toplam byte sayısını döner.
reset(): Tampondaki tüm verileri siler ve sıfırlar.
 */

public class ByteArrayOutputStreamClass {
    public static void main(String[] args) {
        // ByteArrayOutputStream oluştur
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        try {
            // Verileri yaz
            outputStream.write(77); // 'M' harfi
            outputStream.write(101); // 'e' harfi
            outputStream.write(114); // 'r' harfi

            // Byte dizisini alın ve String'e çevirin
            byte[] byteArray = outputStream.toByteArray();
            String outputString = new String(byteArray);

            System.out.println("Yazılan veri: " + outputString);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
