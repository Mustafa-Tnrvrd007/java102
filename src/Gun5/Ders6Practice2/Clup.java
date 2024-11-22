package Gun5.Ders6Practice2;


public class Clup implements Comparable<Gun5.Ders7Practice3.Clup>{
    @Override
    public int compareTo(Gun5.Ders7Practice3.Clup takim) {
        return getName().compareTo( takim.getName() );
    }

    private String name;

    Clup(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}