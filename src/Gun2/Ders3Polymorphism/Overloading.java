package Gun2.Ders3Polymorphism;

class Matematik {
    int topla(int a, int b) {
        return a + b;
    }

    double topla(double a, double b) {
        return a + b;
    }

    int topla(int a, int b, int c) {
        return a + b + c;
    }
}

public class Overloading {
    // metot overloading : metot aşırı yükleme anlamına gelir.
    // Java da aynı isimde ancak parametre sayıları veya türleri farklı birden fazla
    // metot oluşturulabilir. Buna Metot overloading denir.
    public static void main(String[] args) {
        Matematik m = new Matematik();
        System.out.println(m.topla(3, 5)); // Çıktı: 8
        System.out.println(m.topla(2.5, 3.5)); // Çıktı: 6.0
        System.out.println(m.topla(1, 2, 3)); // Çıktı: 6
    }
}
