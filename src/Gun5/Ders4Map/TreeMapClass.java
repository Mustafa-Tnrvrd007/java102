package Gun5.Ders4Map;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {

        /*
    TreeMap, anahtarları sıralı tutar ve doğal sıraya veya belirtilen bir sıralamaya göre düzenler.
    Bu sıralama özelliği, diğer Map türlerinden (HashMap veya LinkedHashMap) farklı olarak,
    elemanların her zaman sıralı olarak kalmasını sağlar.

    TreeMap'in Temel Özellikleri
      -- Sıralı Saklama: TreeMap, anahtarları doğal sıralama düzenine veya özel
         bir karşılaştırıcıya göre sıralı tutar.

      -- Binary Search Tree Yapısı: TreeMap, bir Red-Black Tree (kırmızı-siyah ağaç)
         yapısı kullanır, bu yüzden sıralı erişim sağlar.

      -- Erişim ve Manipülasyon Hızı: TreeMap, O(log n) zaman karmaşıklığına sahiptir;
          anahtarlara hızlıca erişilebilir.
      -- Null Anahtar Desteği Yoktur: TreeMap, null anahtar kabul etmez;
          ancak null değerleri kabul eder.
         */

        // Bir TreeMap oluştur
        TreeMap<String, Integer> studentGrades = new TreeMap<>();

        // Değer ekleme (put metodu)
        studentGrades.put("Ahmet", 85);
        studentGrades.put("Ayşe", 90);
        studentGrades.put("Mehmet", 75);
        studentGrades.put("Zeynep", 88);

        // TreeMap'i yazdırdığımızda, doğal sıralama düzenine göre sıralanmış olduğunu göreceğiz
        System.out.println("Sıralı Öğrenci Notları: " + studentGrades);

        // Belirli bir anahtar ile değere erişim (get metodu)
        System.out.println("Ayşe'nin Notu: " + studentGrades.get("Ayşe"));

        // İlk anahtarı almak (firstKey metodu)
        System.out.println("En düşük anahtar: " + studentGrades.firstKey());

        // Son anahtarı almak (lastKey metodu)
        System.out.println("En yüksek anahtar: " + studentGrades.lastKey());

        // Belirli bir anahtardan küçük olan anahtarları almak (headMap metodu)
        System.out.println("Mehmet'ten önceki öğrenciler: " + studentGrades.headMap("Mehmet"));

        // Belirli bir aralıkta olan anahtarları almak (subMap metodu)
        System.out.println("Ahmet ile Zeynep arasındaki öğrenciler: " +
                studentGrades.subMap("Ahmet", "Zeynep"));

        System.out.println("studentGrades.reversed() = " + studentGrades.reversed());


    }
}
