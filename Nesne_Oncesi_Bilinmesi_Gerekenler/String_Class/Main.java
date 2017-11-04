package com.selametsamli;

public class Main {

    public static void main(String[] args) {
    String takim="Rizespor";
    String takim2=new String("Rizespor");

        System.out.println(takim2);
        System.out.println("Rize"+"Spor"+" "+"Takımı");
        System.out.println("Rizespor'un harf sayısı: "+takim.length());
        System.out.println("4.karakteri:"+takim.charAt(4));
        System.out.println(takim.substring(2,6)); //2 ve 6 karakteri yazdırır 3 4 5
        System.out.println(takim.indexOf("s"));//verilen karakterin görüldüğü ilk yer
        System.out.println(takim.lastIndexOf('r'));//verilen karakterin görüldüğü son yer
        System.out.println(takim.replace("R","S"));//Karakter değişimi yapar
        System.out.println(takim.toUpperCase());//hepsini büyük harfle yazar
        System.out.println(takim.toLowerCase());//hepsini küçük harfle yazar

        String yil="1953";
        System.out.println(Integer.parseInt(yil)-5);//String değeri Integer değer döndürdük.


        int yilInt=1953;
        System.out.println(String.valueOf(yilInt));//Integer olan değeri Stringe dönüştürdü.


        String s1=new String("Selamet");
        String s2=new String("Selamet");
        if (s1==s2){//referans noktalarının eşitliğine bakar.
            System.out.println("Eşitler.");
        }
        else{
            System.out.println("Eşit değiller.");
        }

        if (s1.equals(s2)){
            System.out.println("Eşitler.");
        }
        else{
            System.out.println("Eşit değiller.");
        }


    }
}
