package Gun6.Ders5;

import java.io.*;

/**
 * Serialization Nedir?
 * Serialization, bir Java nesnesini byte stream (bayt akışı) haline dönüştürme işlemidir.
 * Bu işlem, nesnenin durumu (state) korunarak bir dosyaya, veritabanına veya ağ üzerinden
 * başka bir yere kaydedilmesini sağlar.
 *
 * Neden Kullanılır?
 * Veri Depolama: Nesnelerin durumunu bir dosyaya kaydetmek ve daha sonra tekrar kullanmak için.
 * Ağ Üzerinde İletim: Nesneleri bir sistemden diğerine göndermek için.
 * Persistence (Kalıcılık): Geçici nesnelerin bir sonraki çalıştırmada yeniden kullanılabilmesi için.
 *
 * 
 * Serialization İşlemi
 * Bir nesneyi serialize etmek için şu işlemler yapılır:
 *
 * Nesne Serializable Arayüzünü Uygulamalı: Bu arayüzü uygulamak, JVM'e nesnenin
 * serialize edilebilir olduğunu söyler.
 *
 * ObjectOutputStream Kullanılır: Nesneyi bayt akışına dönüştürmek için.
 *
 * Veri Depolamak İçin FileOutputStream Kullanılır: Bayt akışını bir dosyaya yazmak için.
 *
 *
 * Deserialization İşlemi
 * Deserialization, byte stream'i alarak orijinal Java nesnesine dönüştürme işlemidir:
 *
 * ObjectInputStream Kullanılır: Bayt akışını nesneye çevirmek için.
 * FileInputStream Kullanılır: Kaydedilen bayt akışını okumak için.
 */

public class Main {
    public static void main(String[] args) {
        // Serialize edilecek nesne
        Car c1 = new Car("Audi", "A6");
        String dosya = "C:\\javademos\\java102\\src\\Gun6\\Ders5\\araba.txt";

        // Serialization
        // (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("araba.txt")))
        try {
            FileOutputStream outputFile = new FileOutputStream(dosya);
            // file output oluşturuldu , dosyaya yazmak için
            ObjectOutputStream outputStream = new ObjectOutputStream(outputFile);
            // objectOutput Stream oluşturuldu ve file output stream i parametre olarak aldı
            outputStream.writeObject(c1); // nesne dosyaya yazdırıldı
            System.out.println("Nesne serialize edildi: " + c1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Deserialization
        // (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("araba.txt")))
        try  {
            FileInputStream inputFile = new FileInputStream(dosya);
            // input file stream oluşturuldu
            ObjectInputStream inputStream = new ObjectInputStream(inputFile);
            // object input stream oluşturuldu ve input file stream parametre olarak alındı
            Car deserializedPerson = (Car) inputStream.readObject();
            // yeni bir Car nesnesine dosyanın içindeki ilk Car nesnesi atandı
            System.out.println("Deserialized edilen nesne: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
