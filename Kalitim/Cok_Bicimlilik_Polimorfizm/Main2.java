package com.selametsamli;

public class Main2 {

    public static void main(String[] args){

        GeometrikSekil gs1=new GeometrikSekil();
        Kare k1=new Kare(7);
        Dikdortgen d1=new Dikdortgen(8,14);


        sekilAlanlariHesapla(gs1);
        sekilAlanlariHesapla(k1);
        sekilAlanlariHesapla(d1);


    }

    private static void sekilAlanlariHesapla(Object gelenSekilNesnesi) {

        if (gelenSekilNesnesi instanceof GeometrikSekil){

            GeometrikSekil gs=(GeometrikSekil)(gelenSekilNesnesi);
            System.out.println("Şekil alanı: "+gs.alanHesapla());

        }
        else if(gelenSekilNesnesi instanceof Kare){
            Kare k=(Kare)(gelenSekilNesnesi);
            System.out.println("Şekil alanı:"+k.alanHesapla());

        }
        else{
            Dikdortgen d=(Dikdortgen)gelenSekilNesnesi;
            System.out.println("Şekil alanı:"+d.alanHesapla());

        }

    }


}
