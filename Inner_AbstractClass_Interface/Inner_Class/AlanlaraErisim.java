package com.selametsamli;

public class AlanlaraErisim {//dış sınıf

    private String[]  cerceveSiniftakiDizi={"abc","def"};

    public static void main(String[] args){

        int[] intDizi={1,2,3};
        String[] stringDizi={"emre","hasan","ali"};

        AlanlaraErisim.StringDiziYaz stringSinifNesnesi=new AlanlaraErisim().new StringDiziYaz();
        stringSinifNesnesi.stringDiziYazdir(stringDizi);

        AlanlaraErisim.IntegerDiziYaz integerSinifNesnesi=new AlanlaraErisim().new IntegerDiziYaz();
        integerSinifNesnesi.intDiziYazdir(intDizi);

    }
    private class StringDiziYaz{

        public void stringDiziYazdir(String[] dizi){

            System.out.println(cerceveSiniftakiDizi.length);
            for (String gecici:dizi){
                System.out.println(gecici+" ");
            }
        }
    }



    protected class IntegerDiziYaz{

        public void intDiziYazdir(int[] dizi){
            for (int gecici:dizi){
                System.out.println(gecici+" ");
            }
        }
    }

}
