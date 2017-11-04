package com.selametsamli;


public class Main {

    public static void main(String[] args) {
	// veritipi[][] diziAdi=new veritipi [satırsayısı][sutunsayısı]


       /* int[][] sayilar=new int[2][3];

        sayilar[0][0]=1;
        sayilar[0][1]=2;
       // sayilar[2][1]=3; //ArrayIndexOutOfBoundsException hatası oluşur.

       /* sayilar[1][1]=2;


        int[][] n={{1,2},{3,4},{5,6}};

        System.out.println(n[1][1]);*/


        //5 satır ve 4 sutundan oluşan bir diziye rastgele(1-100) sayıları atayan uygulama;

       /* int [][]tablo=new int[5][4];

        for(int satir=0;satir<tablo.length;satir++){
            for(int sutun=0;sutun<tablo[satir].length;sutun++){
                tablo[satir][sutun]=(int)(Math.random()*100);

            }

        }

        for(int satir=0;satir<tablo.length;satir++){
            for(int sutun=0;sutun<tablo[satir].length;sutun++){
                System.out.print(tablo[satir][sutun]+" ");

            }
            System.out.println();
        }
            */


       //Dizilerin Kopyalanması.


        int dizi1[]={1,2,3,4,7};
        int dizi2[]=new int[dizi1.length];

        System.out.println("Klasik for ile kopyalama. ");
        for (int i=0;i<dizi1.length;i++){

            dizi2[i]=dizi1[i];
        }
        for(int i:dizi2){
            System.out.println(i);
        }

        //arraycopy kullanımı
        //System.arraycopy(dizi1,başlangıç,dizi2,başlangıc,uzunluk)

        System.out.println("Arraycopy medhodu ile kopyalama:");
        int[] dizi3=new int[dizi1.length];
        System.arraycopy(dizi1,0,dizi3,0,dizi1.length);


        for (int gecici:dizi3){
            System.out.println(gecici);
        }

    }
}
