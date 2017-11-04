package com.selametsamli;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner veriAl=new Scanner(System.in);

    int vize,final_;
    float gecmeNotu;
        System.out.print("Vize notunu giriniz: ");
        vize=veriAl.nextInt();
        System.out.print("Final notunu giriniz: ");
        final_=veriAl.nextInt();

        gecmeNotu=((float)(vize*40/100))+((float)(final_*60/100));
        System.out.println(gecmeNotu);

    }
}
