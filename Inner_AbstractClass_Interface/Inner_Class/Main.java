package com.selametsamli;

public class Main {

    public static void main(String[] args) {
	    String[] stringDizi={"Emre","Hasan","Ali"};
        Main.StringDiziYaz nesne=new Main().new StringDiziYaz();
        nesne.diziYaz(stringDizi);



    }
    protected class StringDiziYaz{

    public void diziYaz(String[] dizi){
        for (String gecici:dizi){
            System.out.println(gecici+" ");
            }
        }
    }
}
