package com.selametsamli;

public class Main {

    public static void main(String[] args) {
        //=,+,-,/,%

        int a=10;
        int b=20;
        System.out.println(a);
        System.out.println(a+b);

        int toplam=a+b;
        System.out.println(toplam);

        int fark=a-b;
        System.out.println(fark);

        float bolme=(float) a/ (float) b;
        System.out.println(bolme);

        int carpma=a*b;
        System.out.println(carpma);

        int c=17;
        int d=7;

        int mod=c%d;
        System.out.println(mod);


        //arttırma - eksiltme

        int s1=15;
        s1=s1+1;
        s1+=1;
        s1++;
        a=++s1;
        a=s1++;

        System.out.println(s1++);//s1 in o anki değerini yazar ve sonra 1 arttırır.
        System.out.println(s1);


    }
}
