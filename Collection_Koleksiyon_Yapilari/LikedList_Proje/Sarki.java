package selametsamli;

public class Sarki {

    private String sarkiAdi;
    private double sarkiSuresi;

    public Sarki(String sarkiAdi, double sarkiSuresi) {
        this.sarkiAdi = sarkiAdi;
        this.sarkiSuresi = sarkiSuresi;
    }

    public String getSarkiAdi() {
        return sarkiAdi;
    }

    @Override
    public String toString() {
        return this.sarkiAdi+" : "+this.sarkiSuresi;
    }
}
