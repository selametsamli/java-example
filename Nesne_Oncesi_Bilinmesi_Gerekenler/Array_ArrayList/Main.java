package com.selametsamli;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    int[] dizi1={3,5,8,4,1,9,52,6};

    Arrays.sort(dizi1);//Dizi elemanlarını küçükten büyüğe sıralar

    for (int i:dizi1){
        System.out.println(i);
    }

    //dizileri karşılaştır.
        System.out.println("Dizi1 ve dizi2 karşılaştırıldı eşit olmadığı için geriye false döndürüldü");
        int[] dizi2={3,5,8,4,1,9,52,6};//Arrays.equals dizi1 ile dizi 2 yi karşılaştırır eşit ise true döndürür.
        System.out.println(Arrays.equals(dizi1,dizi2));


        ArrayList<Integer> liste=new ArrayList<Integer>();

        liste.add(5);//eleman ekler
        liste.add(9);
        liste.add(2);
        liste.add(3);

        ArrayList<Float> liste2=new ArrayList<>();
        liste2.add(6f);

        liste.remove(1);//indexi verilen elemanı çıkartır

        for (int i:liste){
            System.out.println(i);
        }

        liste2.clear();//listedeki tüm elemanları siler

        liste.indexOf(2);//listede iki varsa onun indexini yoksa -1 döndürür.

        System.out.println(liste.indexOf(5));

        System.out.println(liste.indexOf(3));

        System.out.println(liste.indexOf(14));


        System.out.println(liste.size());//dizideki eleman sayısını gösterir.


    }
}
