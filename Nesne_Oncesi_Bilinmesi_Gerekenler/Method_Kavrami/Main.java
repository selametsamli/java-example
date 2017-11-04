package com.selametsamli;

public class Main {

    public static void main(String[] args) {
    menuGoster();
    toplaminiBul(9,3);
    int fark=farkiniBul(3,9);
        System.out.println("Farkı:"+fark);



    }
    public static void menuGoster(){
        System.out.println("1- iki sayının toplamını bul");
        System.out.println("2- iki sayının farkını bul");
        System.out.println("3- iki sayının çarpımı bul");
        System.out.println("4- iki sayının bölümü bul");

    }
    public static void toplaminiBul(int a,int b){
        int toplam=a+b;
        System.out.println("Sayıların toplamı:"+toplam);

    }
    public static int farkiniBul(int a,int b){
        return Math.abs(a-b);


    }

}
