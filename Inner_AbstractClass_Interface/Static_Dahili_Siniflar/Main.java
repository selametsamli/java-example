package com.selametsamli;

public class Main {

    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci(143,"Selamet");
        System.out.println(Ogrenci.ogrenciSayisi);
        Ogrenci ogr2=new Ogrenci(141,"Ahmet");
        System.out.println(Ogrenci.ogrenciSayisi);

        Ogrenci ogr3=new Ogrenci(142,"Hamdi");
        System.out.println(Ogrenci.ogrenciSayisi);

        Ogrenci.selamVer();

       /* Math m=new Math();
        m.......//yazmadan
        Math.PI//yazarız*/


    }
}
