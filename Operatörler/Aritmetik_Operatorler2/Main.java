package com.selametsamli;

public class Main {

    public static void main(String[] args) {

        int a=30, b=20;

        a+=b;
        System.out.println("A'nın Yeni Değeri: " + a);

        //ilişkisel karşılaştırma oparatörleri

        //==,<,>,<=,>=,!=

        int x=8, y=5;
        System.out.println(x<y);//false
        System.out.println(x>y);//True
        System.out.println(x<=y);//false

        int g=5,f=5;
        System.out.println(f==g);

        int birinciSayi=14,ikinciSayi=11;

        if (birinciSayi<ikinciSayi){

            System.out.println("Birinci sayı ikinci sayıdan küçüktür.");
        }

        if (birinciSayi>ikinciSayi){

            System.out.println("Birinci sayı ikinci sayıdan büyüktür.");
        }

        if (birinciSayi==ikinciSayi){

            System.out.println("Birinci Sayı ikinci sayıya eşittir.");
        }





    }
}
