package com.selametsamli;

public class Main {

    public static void main(String[] args) {
        int sayi1,sayi2;
        sayi1=2;
        sayi2=3;
        System.out.println(sayi1+sayi2);

        //Tamsayılar byte,short,int ve long

        System.out.println("BYTE en küçük: "+Byte.MIN_VALUE+" En Büyük: "+ Byte.MAX_VALUE+" BIT SAYISI:"+Byte.SIZE);
        System.out.println("SHORT en küçük: "+Short.MIN_VALUE+" En Büyük: "+ Short.MAX_VALUE+" BIT SAYISI:"+Short.SIZE);
        System.out.println("Integer en küçük: "+Integer.MIN_VALUE+" En Büyük: "+ Integer.MAX_VALUE+" BIT SAYISI:"+Integer.SIZE);
        System.out.println("Long en küçük: "+Long.MIN_VALUE+" En Büyük: "+ Long.MAX_VALUE+" BIT SAYISI:"+Long.SIZE);

        int enBuyukDeger=2_147_483_645;
        System.out.println("En Büyük Sayı:"+enBuyukDeger);



    }
}
