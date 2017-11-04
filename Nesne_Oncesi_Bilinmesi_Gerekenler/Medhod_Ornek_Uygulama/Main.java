package com.selametsamli;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int kullaniciSecimi=0;
        int birinciSayi=0,ikinciSayi=0;

        /*while(kullaniciSecimi!=5) {
            kullaniciSecimi = menuGoster();
        }*/

        for(;;){
            kullaniciSecimi=menuGoster();

            Scanner sayi=new Scanner(System.in);
            System.out.print("Birinci Sayıyı Girin:");
            birinciSayi=sayi.nextInt();
            System.out.print("İkinci Sayıyı Girin:");
            ikinciSayi=sayi.nextInt();

            if(kullaniciSecimi==5)
                break;
            switch (kullaniciSecimi){
                case 1:{
                    System.out.println("Toplam Değeri:"+toplamiBul(birinciSayi,ikinciSayi));
                    break;}
                case 2:{
                    System.out.println("Fark Değeri:"+farkiBul(birinciSayi,ikinciSayi));
                    break;}
                case 3:{
                    System.out.println("Çarpım Değeri:"+carpimBul(birinciSayi,ikinciSayi));
                    break;}
                case 4:{
                    System.out.println("Bölüm Değeri:"+bolumBul(birinciSayi,ikinciSayi));
                    break;}
            }

        }

    }

    public static int menuGoster(){
        System.out.println("************** "+"MENU"+" **************");
        System.out.println("1-Toplamını bul");
        System.out.println("2-Farkını bul");
        System.out.println("3-Çarpımını bul");
        System.out.println("4-Bölümünü bul");
        System.out.println("5-Çıkış");

        Scanner veriAl=new Scanner(System.in);
        int secim=0;
        secim=veriAl.nextInt();

        return secim;

    }

    public static int toplamiBul(int a,int b){

        return a+b;
    }
    public static int farkiBul(int a,int b){

        return a-b;
    }
    public static int carpimBul(int a,int b){

        return a*b;
    }
    public static int bolumBul(int a,int b){

        return a/b;
    }
}
