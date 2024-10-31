package Gun3.Ders1NestedClasses.LocalClass;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SayiSiniflandirma siniflandir = new SayiSiniflandirma();

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        siniflandir.numaralariSiniflandir(list);

    }
}
