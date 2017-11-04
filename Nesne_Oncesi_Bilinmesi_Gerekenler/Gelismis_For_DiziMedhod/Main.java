package com.selametsamli;

public class Main {

    public static void main(String[] args) {


        int[] sayilar = {1, 5, 4, 5};
        int[] yenidizi={5,4,23,7,5,3,2,};

        ekranaYazdir(sayilar[2]);
        elemanlarinToplaminiBul(sayilar);
        elemanlarinToplaminiBul(yenidizi);

        toplaminiBul(5,3,10,11,12);

    }

    private static void elemanlarinToplaminiBul(int[] sayilar) {
    int toplam=0;

    for(int gecici:sayilar){
        toplam+=gecici;

    }
        System.out.println("Dizi Elemanlarının Toplam Değeri:"+toplam);
    }


    private static void ekranaYazdir(int i) {

        System.out.println(i);
    }

    private static void toplaminiBul(int...sayilar){
        int toplam=0;

        for(int sayi:sayilar){

            toplam+=sayi;
        }
        System.out.println("Toplam:"+toplam);

    }
        //Gelişmiş for döngüsü örnekleri

        /*	int[] sayilar={1,2,8,9};

	for(int i=0;i<sayilar.length;i++){
        System.out.println(sayilar[i]);
    }

    for(int gecici : sayilar){
        System.out.println(gecici);

    }*/

/*      int[] dizi={1,5,7,8,9,40,54,-9};
        int toplam=0;
        for(int i :dizi){
            toplam+=i;
        }
        System.out.println("Elemanların toplamı: "+toplam);*/

        /*String[] gunler = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};

        for (String s : gunler) {
            System.out.println(s);
        }*/

}
