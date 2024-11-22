package Gun5.Ders6Practice2;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Takımlari giriniz bitirmek için \"finish\" giriniz");

        String girilenTakim = "";
        ArrayList<Clup> takimListe = new ArrayList<>();
        HashSet<Clup> setTakimList = new HashSet<>();
        // int ligSuresi; //////////

        while (true) { // takıml
            girilenTakim = scan.nextLine();
            if (girilenTakim.equalsIgnoreCase("finish")) {
                break;
            }
            setTakimList.add(new Clup(girilenTakim));
        }
        takimListe.addAll(setTakimList); // set yapısını arrayliste attık indexlenebilir olması için

        Fikstur fikstur = new Fikstur(takimListe);
        fikstur.eslestir();


    }
}
