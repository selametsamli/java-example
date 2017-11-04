package com.selametsamli;

public class IcIceSiniflar {

    private class StringDiziYaz{

        protected class IntegerDiziYaz{

            public void intDiziYazdir(int[] dizi){
                for (int gecici:dizi){
                    System.out.println(gecici+" ");
                }
            }
        }

        public void stringDiziYazdir(String[] dizi){
            for (String gecici:dizi){
                System.out.println(gecici+" ");
            }
        }



    }
    public static void main(String[] args){

        int[] sayilar={1,2,3,4,5};

        IcIceSiniflar.StringDiziYaz.IntegerDiziYaz nesne=new IcIceSiniflar().new StringDiziYaz().new IntegerDiziYaz();
        nesne.intDiziYazdir(sayilar);
    }

}
