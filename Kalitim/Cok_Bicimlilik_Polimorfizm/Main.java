package com.selametsamli;

public class Main {

    public static void main(String[] args) {

        GeometrikSekil gs1=new GeometrikSekil();
        Kare k1=new Kare(9);
        Dikdortgen d1=new Dikdortgen(6,11);
        sekilAlanlari(gs1);
        sekilAlanlari(k1);
        sekilAlanlari(d1);

    }

    public static void sekilAlanlari(GeometrikSekil sekil){
        System.out.println("Alan bilgisi: "+sekil.alanHesapla());

    }
}
