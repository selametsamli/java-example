package selametsamli;

public class Kare extends Sekiller{

    private double kenarUzunlugu;

    public Kare() {
        kenarUzunlugu=0;
    }
    public Kare(double kenarUzunlugu){
        this.kenarUzunlugu=kenarUzunlugu;
    }

    public double getKenarUzunlugu(){
        return kenarUzunlugu;
    }
    public void setKenarUzunlugu(){
        this.kenarUzunlugu=kenarUzunlugu;
    }

    @Override
    public double alanBul() {
        return kenarUzunlugu*kenarUzunlugu;
    }
}
