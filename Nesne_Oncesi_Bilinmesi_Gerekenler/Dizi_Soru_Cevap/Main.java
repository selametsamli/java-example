package com.selametsamli;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*// Soru1: 10 elemanlı bir diziye eleman olarak dizi indexlerinin karelerini atayan bir uygulama yazını<.
        int[] sayilar=new int[10];

        for(int i=0;i<sayilar.length;i++){
            sayilar[i]=i*i;
            System.out.println("Index :"+i+" değeri:"+sayilar[i]);
        }

        */

	/*//Soru2: Kullanıcıdan alınan 5 sayıyı diziye atayan ve en sonunda alınan değerleri ekrana bastıran utgulamayı yazınız.

        int girilenSayi=0;
        Scanner veriAl=new Scanner(System.in);
        int[] dizi=new int[5];
        for(int i=0;i<dizi.length;i++){
            System.out.print("Lütfen Bir Sayı Giriniz:");
            girilenSayi=veriAl.nextInt();
            dizi[i]=girilenSayi;
        }
        for(int i=0;i<dizi.length;i++)
            System.out.println("Girilen "+(i+1)+"."+" Sayı:"+dizi[i]);
*/

	/*//Soru 3:Kullanıcı yılın hangi ayı olduğunu belirten rakamı girince ay değerini yazdırın
        //eğer 1 ile 12 dışında bir ifade girerse hata versin

        String[] aylar={"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
        int girilenAyDegeri;

        Scanner veriAl=new Scanner(System.in);
        System.out.print("Lütfen Değer Giriniz (1-12):");
        girilenAyDegeri=veriAl.nextInt();
        if(girilenAyDegeri<=12 && girilenAyDegeri>=1){
            System.out.println("Girdiğiniz ay değeri:"+aylar[girilenAyDegeri-1]);
        }
        else{
            System.err.println("Hatalı giriş yaptınız.");
        }
*/

    //Soru 4: boyutu dışarıdan girilen bir dizinin, elemanlarının değerlerini toplayan uygulamayı yapınız.
        int diziElemanSayisi,toplam=0;
        Scanner veriAl=new Scanner(System.in);
        System.out.print("Kaç Elemanlı Dizi Gerekiyor:");
        diziElemanSayisi=veriAl.nextInt();

        int[] dizi=new int[diziElemanSayisi];
        for(int i=0;i<dizi.length;i++){
            System.out.print("Bir sayı giriniz:");
            dizi[i]=veriAl.nextInt();
            toplam+=dizi[i];
        }

        System.out.println("Toplam Değerimiz:"+toplam);

    }
}
