package Gun3.Ders3GenericClasses;

public class Nullable <T> { // Generic sınıf ifadesi
    /*
    Nullable <T> ---> bir generic sınıf ifadesidir.
    <T> ifadesi T degerinin bir wrapper class belirteceğini gösterir. {Integer , String , Double ....}
    T ifadesini bir değişken tiplerini tutan değişken olarak düşünebiliriz.
    Yani bu sınıf içinde değişken tipi belirtmek yerine T ifadesini kullanabiliriz.

    Örnek:
    Integer sayi = 10 ;  ------>     T sayi = 10;
    String metin  = "Heloo" ------>    T metin = "Helloo";

    boylece int değerler için ayrı String değerler için ayrı sınıflar yazmak zorunda kalmayız.

     */

    private T degisken;

    public Nullable(T degisken ){
        this.degisken= degisken;
    }

    public T getDegisken(){
        return this.degisken;
    }
    public void setDegisken (T degisken){
        this.degisken = degisken;
    }

    public boolean isNull(){

        //return getDegisken() ==  null ?  true :  false;
        return getDegisken() == null;
    }

    public void run (){
        if (isNull()){
            System.out.println("Bu degisken null");
        }else {
            System.out.println("degisken  degeri = " + getDegisken()+" \t\tdegisken tipi  : "+
                    getDegisken().getClass().getSimpleName());
        }
    }


}
