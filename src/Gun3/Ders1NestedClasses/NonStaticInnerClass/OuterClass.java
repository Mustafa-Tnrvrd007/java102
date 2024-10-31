package Gun3.Ders1NestedClasses.NonStaticInnerClass;

/// NON STATIC INNER CLASS

public class OuterClass { // dış sınıf

    public String degisken = "Outer class degiskeni";

    public class InnerClass{ // iç sınıf
        public String degisken = "Inner class degiskeni";

        public void run(){
            String degisken = "Inner class icindeki run metodu degiskeni";

            System.out.println(degisken); // run()
            System.out.println(this.degisken); // inner class
            System.out.println(OuterClass.this.degisken); // outer class
        }
    }

    public void run(){
        InnerClass obje = new InnerClass();
        obje.run();
    }

}
