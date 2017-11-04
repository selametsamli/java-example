package com.selametsamli;

public class Kare implements Karsilastir{
    private double kenarUzunlugu;

    public Kare(){
        kenarUzunlugu=0;
    }
    public Kare(double kenar){
        this.kenarUzunlugu=kenar;
    }
    public double getKenarUzunlugu() {
        return kenarUzunlugu;
    }

    public void setKenarUzunlugu(double kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }

    public double alanHesapla(){

        return kenarUzunlugu*kenarUzunlugu;
    }

    @Override
    public String karsilastir(Object nesne) {
        Kare k2= (Kare) nesne;
        if (this.alanHesapla()>k2.alanHesapla()){

            return "Asıl nesnenin alanı parametredeki nesne alanından büyüktür";

        }
        else if(this.alanHesapla()<k2.alanHesapla()){
            return "Asıl nesnenin alanı parametredeki nesne alanından küçüktür";

        }
        else{

            return "Alanlar Eşittir";
        }
    }
}
