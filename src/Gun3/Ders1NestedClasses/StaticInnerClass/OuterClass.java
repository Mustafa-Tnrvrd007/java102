package Gun3.Ders1NestedClasses.StaticInnerClass;

/// STATIC INNER CLASS

public class OuterClass { // dış sınıf

    public String degisken = "Outer class degiskeni";

    public static class InnerClass{ // static iç sınıf
        // static class olduğu için static degiskenlere ve static metodlara ulaşabilir
        public static String degisken = "Inner class degiskeni";

        public static void run(){
            String degisken = "Inner class icindeki run metodu degiskeni";

            System.out.println(degisken); // run()
            System.out.println(InnerClass.degisken); // inner class degiskeni
            // System.out.println(OuterClass.this.degisken); // outer class

        }
    }

    public void run(){
       OuterClass.InnerClass obje = new OuterClass.InnerClass();
        obje.run();
    }

}
