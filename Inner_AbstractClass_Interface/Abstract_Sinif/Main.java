package com.selametsamli;

public  class Main {

    public static void main(String[] args) {

        /*Ford f=new Ford();
        f.setCantKalinlik(10);*/



        Araba f=new Ford();//araba üret arabam forda eşit olsun
        f.setAgirlik(1500);
        f.setModel("Fiesta");
        f.setRenk("Kırmızı");

        goster(f);

        Araba h=new Toyota(); //araba sınıfından nesne üretmedik. Her iki sınıfta da olan kodu tekrar yazmamak için
        h.setAgirlik(1000);//böyle bir çılgınlık yaptık.
        h.setRenk("Siyah");
        h.setModel("Corolla");
        goster(h);


    }

    public static void goster(Araba a){
        System.out.println("Ağırlık:"+a.getAgirlik());
        System.out.println("Model:"+a.getModel());
        System.out.println("Renk:"+a.getRenk());
        System.out.println("Benzin:"+a.saatteYaktigiBenzinLitersi());

    }
}
