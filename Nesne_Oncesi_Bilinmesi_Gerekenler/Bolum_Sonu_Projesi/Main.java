package com.selametsamli;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
	    //1- 3 farklı isim tutan bir String dizisi tanımlayın
        //2- 3 farklı soyisim tutan bir String dizi tanımlayın
        //3- birlestir() isimli bir method oluştururn ve bu method bu isim ve soyisimleri birleştirsin ve herbirine
        //rastgeler 50 ye kadar bir yaş değeri atasın
        //4- Bu method birleştirdiğiniz isimleri bir arrayList içinde tutsun ve bunu geriye döndürsün.
        //5- yazdir() methodu bu dönene arrayListi gelişmi for döngüsü ile yazdırsın.

        String[] ad={"Selamet","Enes","İlteriş"};
        String[] soyad={"Şamlı","Koç","Keskin"};
        ArrayList<String>birleştirilmisIsimler=birlestir(ad,soyad);
       // System.out.println(birleştirilmisIsimler.size());

        yazdir(birleştirilmisIsimler);

    }

    public static ArrayList<String> birlestir(String[] isim, String[] soyisim){

        ArrayList<String> tumIsimler=new ArrayList<>();
        String [] bilgi=new String[3];

        for (int i=0;i<isim.length;i++){
            int rastgeleYas=(int)(Math.random()*50);
            String birlestirilenIsim=isim[i]+ " "+soyisim[i]+" "+rastgeleYas;
           // System.out.println("Sonuç: "+birlestirilenIsim);
            tumIsimler.add(birlestirilenIsim);
        }
        return tumIsimler;
    }
    public static void yazdir(ArrayList<String> birlestirilmisIsimler){
        for (String gecici:birlestirilmisIsimler){

             System.out.println(gecici);
        }


    }



}
