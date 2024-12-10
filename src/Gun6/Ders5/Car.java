package Gun6.Ders5;

import java.io.Serializable;

public class Car implements Serializable {
    // Serializable işlemi ile bu sınıftan oluşturulan nesneler
    // stream ile dosyalara , ağlara aktarılabilecek

    private String marka;
    private String model;

    Car(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Marka : " +getMarka() + "\tModel : "+getModel();
    }

    public String getMarka() {
        return this.marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
