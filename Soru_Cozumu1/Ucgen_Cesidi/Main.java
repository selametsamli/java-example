package com.selametsamli;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner veriAl=new Scanner(System.in);

        int kenar1,kenar2,kenar3;

        System.out.print("Birinci kenarı girin:  ");
        kenar1=veriAl.nextInt();
        System.out.print("İkinci kenarı girin: ");
        kenar2=veriAl.nextInt();
        System.out.print("Üçüncü kenarı girin: ");
        kenar3=veriAl.nextInt();

        if(kenar1==kenar2 && kenar1==kenar3)
            System.out.println("Üçgenin çeşidi: Eşkenar Üçgen");
        else if(kenar1==kenar2 && kenar1!=kenar3)
            System.out.println("Üçgen çeşidi: İkizkenar Üçgen");
        else
            System.out.println("Üçgen çeşidi: Çeşitkenar Üçgen");

    }
}
