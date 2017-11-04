package com.selametsamli;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    int sayi1,sayi2,sayi3;
    float ortalama;

        Scanner veriAl=new Scanner(System.in);

        System.out.print("Lütfen sayı1 değerini girin: ");
        sayi1=veriAl.nextInt();
        System.out.print("Lütfen sayı2 değerini girin: ");
        sayi2=veriAl.nextInt();
        System.out.print("Lütfen sayı3 değerini girin: ");
        sayi3=veriAl.nextInt();

        ortalama=(float)(sayi1+sayi2+sayi3)/3;
        System.out.println(ortalama);

    }
}
