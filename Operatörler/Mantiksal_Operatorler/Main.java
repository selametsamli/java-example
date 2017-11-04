package com.selametsamli;

public class Main {

    public static void main(String[] args) {
	// AND, OR, XOR, NOT

        boolean x=true;
        boolean y=false;
        boolean z=true;
        boolean t=false;


        System.out.println("X && Y:"+(x && y));
        System.out.println("X || Y:"+(x || y));

        System.out.println("X ^ Y:"+(x ^ y));//xor da sağ ve soldaki değerler aynı ise false olur, diğer durumlar true.
        System.out.println("X ^ Z:"+(x ^ z));

        System.out.println("!X: "+(!x));//NOT !x mevcut durumun tersini verir.


        int a=10,b=8,c=3;

        System.out.println(a-b*3);//-14
        System.out.println((a-b)*c-a);//-4

    }
}
