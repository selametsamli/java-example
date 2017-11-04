package com.selametsamli;

public class Main {

    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.abs(-1453));//Mutlak değeri verir.
        System.out.println(Math.ceil(8.4));//Verilen sayıyı bir üst sayıya yuvarlar.
        System.out.println(Math.floor(8.3));//Verilen sayıyı kendisine yuvarlar
        System.out.println(Math.pow(2,4));//Verilen Sayıların Kuvvetini hesaplar

        System.out.println(Math.sqrt(16));//Karekök hesaplar
        System.out.println(Math.max(17,16));//en Büyüğü döndürür.
        System.out.println(Math.min(18,12));// En küçüğü döndürür.
        System.out.println(Math.random()*50);//0-50 arası rastgele sayı üretir.


        int x=5;
        double alan;

        alan=Math.pow(5,2);
        System.out.println("Üçgenin Alanı: "+ alan);

        int sayi1,sayi2;

        sayi1=(int)(Math.random()*50);
        sayi2=(int)(Math.random()*50);
        System.out.println("Büyük olan: "+Math.max(sayi1,sayi2));
        System.out.println("Küçük olan: "+Math.min(sayi1,sayi2));






    }
}
