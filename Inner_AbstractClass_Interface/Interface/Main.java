package com.selametsamli;

public class Main {

    public static void main(String[] args) {
	// Java çoklu kalıtama izin vermiyor. bu gibi ihtiyaçlar için interface kavramı ortaya çıkar.
        Kare k1=new Kare(10);
        Kare k2=new Kare(7);

        System.out.println("Kare alan karşılaştırması:"+k1.karsilastir(k2));

        Personel p1=new Personel(25);
        Personel p2 =new Personel(15);
        System.out.println("Personellerin yaş karşılaştırması:"+p1.karsilastir(p2));
        nesneleriKarsilastir(k1,k2);
        nesneleriKarsilastir(p1,p2);


    }

    public static void nesneleriKarsilastir(Karsilastir k1, Karsilastir k2){

        System.out.println("Karşılaştırma:"+k1.karsilastir(k2));
    }
}
