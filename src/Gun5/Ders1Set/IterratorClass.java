package Gun5.Ders1Set;

import java.util.HashSet;
import java.util.Iterator;

public class IterratorClass {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello");
        hashSet.add("World");
        hashSet.add("Java");
        hashSet.add("Programing");
        hashSet.add("Set");

        /*
        Iterator, Java koleksiyonlarında (Collection) elemanlar arasında gezinmemizi
        sağlayan bir araçtır. HashSet gibi sırasız yapılar için Iterator
        kullanmak oldukça faydalıdır,çünkü her bir elemana sırayla erişim sağlar.
         */
        /*
        Iterator, Java’da Iterator<E> adlı bir arayüzdür ve üç temel metot içerir:

            -hasNext() – Gezinilecek başka eleman olup olmadığını kontrol eder.
            Eğer varsa true, yoksa false döner.

            -next() – Sonraki elemana geçer ve bu elemanı döner.

            -remove() – Son çağrılan elemanı koleksiyondan siler
            (isteğe bağlıdır, her Iterator bunu desteklemeyebilir).
         */

        Iterator<String> itr = hashSet.iterator();
        // String veri türü içeren bir  nesne Iterator nesnesi oluşturduk .
        // sonra içine hashSet iteratorunu attık.

        while (itr.hasNext()){ // iterator ile collection yapısını dolanmak
            System.out.println(itr.next());
        }
        System.out.println("\n\n ##############");

        for (String element : hashSet){ // foreach ile collection dolanmak
            System.out.println(element);
        }
    }
}
