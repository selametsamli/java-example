package com.selametsamli;

public class Main {

    public static void main(String[] args) {

     /*   int birinciSayi=8;
        int ikinciSayi=7;

        if(birinciSayi<ikinciSayi){
            System.out.println("Birinci sayı ikinci sayıdan küçüktür.");

        }
        if(birinciSayi>ikinciSayi){
            System.out.println("Birinci sayı ikinci sayıdan büyüktür.");

        }
        if(birinciSayi!=ikinciSayi){
            System.out.println("Birinci sayı ikinci sayıya eşit değildir.");

        }
*/

    /* int yas=20;
     int dogumTarihi=1990;

     if(yas==20 && dogumTarihi==1990){

         System.out.println("Yazılanlar doğrudur başkanım.");

     }
     if(yas==30 || dogumTarihi==1990){

         System.out.println("Yazılanların biri veya ikisi de doğru.");

     }*/


  /*  int s1=15;
    int s2=15;

    if(s1<s2){
        System.out.println("s1 s2 den küçüktür.");
    }

    else if(s1>s2){
            System.out.println("s1 s2 den büyüktür");
        }
    else{
        System.out.println("s1 ve s2 eşittir.");
    }*/

   /*     //if then else yapısı
        //ifade ? sorgu1 : sorgu2. True ise sorgu1 false ise sorgu2 çalıştırılır.

        int s1=1, s2=3;
        System.out.println((s1<s2)? "s1 küçük s2":"s1 büyük s2");
        System.out.println((s1>s2)? "s1 büyük s2":"s1 küçük s2");*/

   int gunSirasi=3;
   switch (gunSirasi){

       case 1:
           System.out.println("Pazartesi");
           break;
       case 2:
           System.out.println("Salı");
           break;
       case 3:
           System.out.println("Çarşamba");
           break;//break olmasa Çarşamba ve Perşembe yazılır.
       case 4:
           System.out.println("Perşembe");
           break;
       case 5:
           System.out.println("Cuma");
           break;
       case 6:
           System.out.println("Cumartesi");
           break;
       case 7:
           System.out.println("Pazar");
           break;
       default:
           System.out.println("Böyle Bir Gün yok.");

   }


    }
}
