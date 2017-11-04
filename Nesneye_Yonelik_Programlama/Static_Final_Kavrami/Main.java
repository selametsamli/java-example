package com.selametsamli;


public class Main {

    public static void main(String[] args) {
        System.out.println("Oluşturulan cemberDaire nesne sayısı:"+CemberDaire.getOlusturulanNesneSayisi());

        CemberDaire d1=new CemberDaire();
        d1.setYariCap(6);
        System.out.println("Oluşturulan cemberDaire nesne sayısı:"+CemberDaire.getOlusturulanNesneSayisi());

        CemberDaire d2=new CemberDaire();
        System.out.println("Nesne üzerinden tüm sayı:"+d2.getOlusturulanNesneSayisi());
        CemberDaire d3=new CemberDaire();
        System.out.println("Oluşturulan cemberDaire nesne sayısı:"+CemberDaire.getOlusturulanNesneSayisi());



        CemberDaire d4=new CemberDaire();
        d4.setYariCap(10);
        System.out.println("d4 ün çevresi:"+d4.cevreHesapla());
        System.out.println("d4'ün alanı:"+d4.alanHesapla());
        }
}
