package selametsamli;

import java.time.LocalDate;

public class NotOge {

    private String baslik;
    private String notDetay;
    private LocalDate bitisTarih;

    public NotOge(String baslik, String notDetay, LocalDate bitisTarih) {
        this.baslik = baslik;
        this.notDetay = notDetay;
        this.bitisTarih = bitisTarih;
    }


    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getNotDetay() {
        return notDetay;
    }

    public void setNotDetay(String notDetay) {
        this.notDetay = notDetay;
    }

    public LocalDate getBitisTarih() {
        return bitisTarih;
    }

    public void setBitisTarih(LocalDate bitisTarih) {
        this.bitisTarih = bitisTarih;
    }

    @Override
    public String toString() {
        return baslik;
    }
}
