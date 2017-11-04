package com.selametsamli;

public class CemberDaire {

    private double yaricap;
    public final double PI=3.14;//final değiştirilemez
    private static int olusturulanNesneSayisi;//static:herhangi bir nesne tanımı yapmadan da kullanılabilir.
                                            // ve tüm nesnelerin aynı anda görebileceği değişkenlerdir.


    public CemberDaire(){

        System.out.println("Çemberdaire nesnesi oluşturuluyor.");
        olusturulanNesneSayisi++;
    }

    public static int getOlusturulanNesneSayisi(){

        return olusturulanNesneSayisi;
    }

    public void setYariCap(double yaricap){
        if(yaricap>=1) {
            this.yaricap = yaricap;
        }else{
            this.yaricap=1;
        }

    }

    public double getYaricap(){

        return  this.yaricap;
    }

    public double cevreHesapla(){
        return 2*PI*yaricap;
    }
    public double alanHesapla(){
        return PI*yaricap*yaricap;
    }


}
