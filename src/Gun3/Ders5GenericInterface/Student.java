package Gun3.Ders5GenericInterface;

public class Student {


    private String isim;
    private Integer numara;
    private Boolean mezunMu;

    public Student( String isim , int numara, boolean mezunMu) {
        this.numara = numara;
        this.mezunMu = mezunMu;
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Boolean getMezunMu() {
        return mezunMu;
    }

    public void setMezunMu(Boolean mezunMu) {
        this.mezunMu = mezunMu;
    }

    public Integer getNumara() {
        return numara;
    }

    public void setNumara(Integer numara) {
        this.numara = numara;
    }
}
