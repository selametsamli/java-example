package selametsamli;

public class Dikdortgen extends Sekiller {

    private double en;
    private double boy;

    public Dikdortgen() {
        this.en=0;
        this.en=0;
    }

    public Dikdortgen(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }

    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        this.en = en;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    @Override
    public double alanBul() {
        return en*boy;
    }
}
