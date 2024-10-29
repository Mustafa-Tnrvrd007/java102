package Gun2.Ders1Encapsulation;

public class Main {
    public static void main(String[] args) {
        Car araba = new Car();
        araba.setColor("Mavi");
        araba.setModel("Passat");
        araba.setEngine(1.8);
        araba.setDoor(4);

        System.out.println(araba.getColor());
        System.out.println(araba.getModel());
        System.out.println(araba.getEngine());
        System.out.println(araba.getDoor());

        araba.setDoor(-3);// bir arabanın kapı sayısı -3 olamaz . Bu koddaki anlamsızlıktır
        // encapsulation sistemdeki anlamsızlıkları çözmek için kullanılır
        System.out.println(araba.getDoor());


    }

}
