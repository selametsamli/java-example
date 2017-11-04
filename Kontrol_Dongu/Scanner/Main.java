package com.selametsamli;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


       /* System.out.println("Lütfen Adınızı Girin:");
        String isim="";
        Scanner tara=new Scanner(System.in);

        isim=tara.nextLine();

        System.out.println("Girilen isim: "+isim);


        //next:klavyeden girilen ifadenin ilk kelimesini alır
        //findInLine(".".charAt(0)) Klavyeden girilen ifadeyi belirtilen karaktere böler
        //nextInt: klavyeden girilen değeri int çevirir.

        System.out.println("Lütfen Tekrar giriniz.");
        isim=tara.next();
        System.out.println("Girilen: "+isim);
        */

        int sayi1,sayi2,sayi3;
        String enBuyuk,enKucuk;


        Scanner veriAl=new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz: ");
        sayi1=veriAl.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        sayi2=veriAl.nextInt();
        System.out.print("Üçüncü Sayıyı Giriniz: ");
        sayi3=veriAl.nextInt();

        if(sayi1<sayi2 && sayi1<sayi3){
            enKucuk="Girilen sayıların en küçüğü sayı1 : "+sayi1;

            if(sayi2<sayi3) {
                enBuyuk = "Girilen sayıların en büyüğü sayı3 " + sayi3;
            }else{
                enBuyuk="Girilen sayıların en küyüğü sayı3 "+ sayi2;
            }
        }
        else if(sayi2<sayi1 && sayi2<sayi3) {
            enKucuk="Girilen sayıların en küçüğü sayı2 "+sayi2;
            if (sayi1<sayi3) {
                enBuyuk="Girilen sayıların en büyüğü sayı3 "+sayi3;

            }else{
                enBuyuk="Girilen sayıların en büyüğü sayı1 "+sayi1;
            }
        }
        else{
            enKucuk="Girilen sayıların en küçüğü sayı3 "+sayi3;
            if(sayi1<sayi2){
                enBuyuk="Girilen sayıların en büyüğü sayı1 "+sayi1;

            }
            else{
                enBuyuk="Girilen sayıların en büyüğü sayı2 "+sayi2;
            }


        }

        System.out.println(enBuyuk);
        System.out.println(enKucuk);




    }
}
