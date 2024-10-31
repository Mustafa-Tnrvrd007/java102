package Gun3.Ders1NestedClasses.AnonymusClass;

interface  ISelamVer{
    public void selamla();
}

public class Main {

    public static void main(String[] args) {

        ISelamVer nesne = new ISelamVer(){
            @Override
            public void selamla(){
                System.out.println("Hello World");
            }
        };

        nesne.selamla();
    }
}
