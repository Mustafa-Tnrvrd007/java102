package Gun2.Ders1Encapsulation;

public class Car {
    private String color; // renk
    private String model; // model
    private double engine; // motor hacmi
    private int door; // kapı sayısı

//    Car(){ // constructor
//
//    }

    public String getColor() { // get metodu değişkeni okumaya yarar READ
        return this.color; // this ifadesi sınıfta bulunan değişkeni ifade eder
    }

    public void setColor(String color) { // set metodu değişkene yazmaya yarar WRITE
        this.color = color; // this ifadesi sınıfta bulunan değişkeni ifade eder
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return this.engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getDoor() {
        return this.door;
    }

    public void setDoor(int door) {
        if (door <= 0) {
            System.out.println("Kapı sayısını yanlış girdiniz");
        } else {
            this.door = door;
        }
    }
}
