package com.selametsamli;

public class Main {

    public static void main(String[] args) {
        /*for (int i=0;i<10;i++){
            if(i==5)
                break;
            System.out.println(i);

        }*/


       /* etiket:
        for(int i=0;i<10;i++){

            for(int j=0;j<5;j++){
                if(j==2)
                    break etiket; //etiket kısmındaki fordan çıkış yapar
                System.out.println("i: "+ i +" j: "+j);
            }

        }*/



       /*for(int i=0;i<10;i++){
           if(i==5)//i nin 5 olduğu durumu bırakıp 6 dan devam eder 1,2,3,4,6,7,8,9
               continue;
           System.out.println(i);

       }*/

       /* etiket:
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 5; j++) {
                if (j == 2)
                    continue etiket; //etiket kısmındaki fordan çıkış yapar
                System.out.println("i: " + i + " j: " + j);
            }
        }*/


       for(int i=0;i<10;i++){
           if(i==6)
               return; //döngüden değil main methodundan çıktı.
           System.out.println(i);

       }



    }
}
