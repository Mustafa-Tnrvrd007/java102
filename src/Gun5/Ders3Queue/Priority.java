package Gun5.Ders3Queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority {
    public static void main(String[] args) {

        /*
   PriorityQueue, öğeleri öncelik sırasına göre düzenleyen bir kuyruk (queue) yapısıdır.
   Queue yapılarında olduğu gibi elemanları sıralı şekilde eklerken en yüksek önceliğe
   sahip olan elemanlar önce çıkarılır. Yani, FIFO (First-In-First-Out) prensibi yerine,
   öncelik sırasına göre bir yapıda çalışır.

        PriorityQueue’nun Özellikleri
        --Doğal Sıralama veya Özel Sıralama: PriorityQueue, öğeleri ya doğal sırasına
          (örn. sayılar için küçükten büyüğe) göre sıralar ya da özel bir Comparator
          kullanarak belirlediğiniz öncelik sırasına göre sıralar.

        --Elemanların Sıralı Çıkışı: Eklenen elemanlar sırayla çıkarılmaz; en yüksek önceliğe
        sahip eleman kuyruğun en önünde olur ve ilk olarak çıkarılır.

        --Null Değeri: PriorityQueue null değerleri desteklemez.


        PriorityQueue’da Sık Kullanılan İşlemler

        --Ekleme (add veya offer): Eleman eklemek için kullanılır. Kuyrukta doğru öncelik
        sırasına göre yerleştirilir.

        --Çıkarma (poll): Kuyruğun başındaki (en yüksek öncelikli) elemanı çıkarır.

        --Bakma (peek): Kuyruğun başındaki elemanı çıkarmaz, ancak ne olduğunu gösterir.


        PriorityQueue’nin Çalışma Mantığı

        --PriorityQueue, iç yapısında min-heap veya max-heap algoritması kullanır:

            * Min-heap: Küçük elemanlar önce çıkar. Doğal sıralama durumunda
            (örn. sayısal bir PriorityQueue), en küçük değer en öne yerleşir.

            * Max-heap: Comparator kullanarak özel bir sıralama belirtirseniz, büyük
            elemanları en önde olacak şekilde sıralayabilirsiniz.
         */

        PriorityQueue<Task> liste = new PriorityQueue<>(Comparator.comparing(Task::getPriority));

        liste.add(new Task("E posta gonder",4));
        liste.add(new Task("Toplantıya katıl",1));
        liste.add(new Task("Mudur'e sunum yap",3));
        liste.add(new Task("Sunum hazırla",2));

        System.out.println("Görevler sıralanıyor");

        Iterator<Task> itr = liste.iterator();
        while (!liste.isEmpty()) {
            Task currentTask = liste.poll(); //  en yüksek öncelikli (burada en düşük priority değerine sahip)
            //// öğeyi kuyruktan çıkarmak için kullanılır.
            System.out.println(currentTask);
        }


    }
}
