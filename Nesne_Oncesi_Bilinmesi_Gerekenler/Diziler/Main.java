package com.selametsamli;

public class Main {

    public static void main(String[] args) {

	// veritipi[] diziAdı=new veripi[eleman sayısı];

        int[] sayilar=new int[5];
        sayilar[0]=10;
        sayilar[1]=5;
        sayilar[4]=15;

        //sayilar[5]=1453; ArrayIndexOutOfBoundsExceptionsHatası ver


        for(int i=0;i<sayilar.length;i++)
            System.out.println(sayilar[i]);

        int[] yeniDizi={10,20,30,40,50,60,70};
        for (int j=0;j<yeniDizi.length;j++)
            System.out.println("Index değeri:"+j+" Değeri:"+sayilar[j]);


    }
}
