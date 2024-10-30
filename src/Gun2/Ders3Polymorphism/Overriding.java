package Gun2.Ders3Polymorphism;
class Hayvan {
    void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor...");
    }
}

class Kedi extends Hayvan {
    @Override
    void sesCikar() {
        System.out.println("Miyav!");
    }
}

class Kopek extends Hayvan {
    @Override
    void sesCikar() {
        System.out.println("Hav!");
    }
}

public class Overriding {
    // metot overriding : metot ezme anlamına gelir.
    // alt sınıfın üst sınıftan kalıtımla aldığı metodu kendi işlevine göre
    // yeniden oluşturmasıdır.
    // metot ismi , parametreler ve metodun dönüş tipi aynı olmalıdır.
    public static void main(String[] args) {
        Hayvan h1 = new Kedi();   // Polimorfizm ile Kedi nesnesi oluşturduk
        Hayvan h2 = new Kopek();  // Polimorfizm ile Kopek nesnesi oluşturduk

        h1.sesCikar();            // Çıktı: Miyav!
        h2.sesCikar();            // Çıktı: Hav!
    }
}
