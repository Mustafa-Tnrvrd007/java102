package Gun5.Ders5Practice1;

import java.util.Comparator;

public class SayfaSirasi implements Comparator<Book> {

    @Override
    public int compare(Book k1, Book k2) {
        return Integer.compare(k1.getSayfa(),k2.getSayfa());
        // iki nesnenin sayfa sayısını karşılaştırır
    }
}
