package com.selametsamli;

public class Main {

    public static void main(String[] args) {

        /*int sayi=1;

        while(sayi<=10){

            System.out.println("Şuanki sayi: "+sayi);
            sayi++;
        }

        int s=1, toplam=0;
        while(s<=10){

            toplam+=s;
            s++;
        }
        System.out.println("1 den 10 a kadar olan sayıların toplamı: "+toplam);*/

       /* int sayi=1;
        do{
            System.out.println("Sayı: "+sayi);
            sayi++;
        }
        while(sayi<=10);*/

       for(int i=0;i<10;i+=4){
           System.out.println("Sayı: "+i);
       }
       for(int a=5,b=6; a*b<100;a++,b+=3){
           System.out.println("a nın ilk değeri: "+a);
           System.out.println("b nin ilk değeri: "+b);
           System.out.println("a*b değeri: "+a*b);

       }





    }
}
