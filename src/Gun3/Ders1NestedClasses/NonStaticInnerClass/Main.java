package Gun3.Ders1NestedClasses.NonStaticInnerClass;

/// NON STATIC INNER CLASS


public class Main {
    public static void main(String[] args) {

        OuterClass nesne = new OuterClass(); // dış sınıf nesnesi

        // nesne.run();

        OuterClass.InnerClass  obje = nesne.new InnerClass();
        // dış sınıf nesnesi kullanarak iç sınıf nesnesi oluşturma yontemi


        obje.run();

    }
}
