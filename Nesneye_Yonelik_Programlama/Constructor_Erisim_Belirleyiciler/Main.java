package com.selametsamli;

public class Main {

    public static void main(String[] args) {

        Dikdortgen d1=new Dikdortgen();

        d1.setBoy(5);
        d1.setBoy(10);

        System.out.println("Dikdört 1'in alanı:"+d1.alaniHesapla());

        Dikdortgen d2=new Dikdortgen();


        d2.setBoy(5);
        System.out.println("Dikdörtgen 2'nin alanı:"+d2.alaniHesapla());


        Dikdortgen d3=new Dikdortgen();
        d3.setBoy(15);

        System.out.println("Dikdörgen 3'ün alanı: "+d3.alaniHesapla());

        Dikdortgen d4=new Dikdortgen(5,9);
        System.out.println("Dikdörgen 4'ün alanı:"+d4.alaniHesapla());

        Dikdortgen d5=new Dikdortgen(9);
        d5.setEn(4);
        System.out.println("Dikdörtgen 5'in alanı:"+d5.alaniHesapla());


    }
}
