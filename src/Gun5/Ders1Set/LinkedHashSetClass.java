package Gun5.Ders1Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public static void main(String[] args) {


        LinkedHashSet<Integer> lHSet = new LinkedHashSet<>();
        /*
        HashSet yapısından tek farkı veriler sıralı olarak tutulur.
        Hangi sırada girersek op sırada veri alırız
         */

        lHSet.add(20);
        lHSet.add(10);
        lHSet.add(20);
        lHSet.add(30);
        lHSet.add(30);
        lHSet.add(40);

        Iterator<Integer> itr = lHSet.iterator();

        while (itr.hasNext()){
            System.out.println( itr.next());
        }

    }
}
