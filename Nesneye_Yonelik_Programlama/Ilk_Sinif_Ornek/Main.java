package com.selametsamli;

public class Main {

    public static void main(String[] args) {

        int sayi=53;
        String isim=new String("Selamet");

        Araba sahin=new Araba();
        sahin.setYil(1996);
        System.out.println("Şahinin yılı:"+sahin.getYil());


        Araba kartal=new Araba();
        kartal.setYil(2000);
        System.out.println("Kartalın yılı:"+kartal.getYil());

        sahin=kartal;

        System.out.println("Şahin yılı:"+sahin.getYil());

        Araba serce=new Araba();
        serce.setRenk("Kırmızı");
        serce.setAdi("Kreyzi");
        serce.setYil(1996);
        serce.setBeygirGucu(150);
    }
}
