package selametsamli;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int girilen;
        int sayac =1;
        int enKucuk,enBuyuk,fark;
        Scanner veriAl = new Scanner(System.in);
        ArrayList<Integer> girilenlerArrayList = new ArrayList<>();
        ArrayList<Integer> enKucukDegerArrayList = new ArrayList<>();
        ArrayList<Integer> enBuyukDegerArrayList = new ArrayList<>();


        System.out.print("Dort Basamakli Sayi Giriniz: ");

        girilen=veriAl.nextInt();

        if (dortBasamakliMi(girilen)==false) //sayı 4 basamaklı değilse
            System.out.println("Hatali Giris Yaptiniz.");

        while (girilen!=0){

            while(true){
                if (girilen==0)
                    break;
                int a=girilen%10;
                girilenlerArrayList.add(a);
                enKucukDegerArrayList.add(a);
                enBuyukDegerArrayList.add(a);
                girilen/=10;
            }
            Collections.reverse(girilenlerArrayList); //Girilen sayının her bir elemanını sıralıyoruz

            Collections.sort(enKucukDegerArrayList); // Küçükten Büyüğe sıralıyoruz.

            Collections.sort(enBuyukDegerArrayList); // En büyüğü bulmak için önce küçükten büyüğe sıralıyoruz daha sonra ters çevirip
            Collections.reverse(enBuyukDegerArrayList); //en Büyük sayımızı buluyoruz.

            enBuyuk = arrayListIntegerCevir(enBuyukDegerArrayList); //yazdığımız fonk yardımı ile dizi elemanlarını
            enKucuk = arrayListIntegerCevir(enKucukDegerArrayList); //integer yapıp bir değişkene atıyoruz

            fark = enBuyuk-enKucuk;
            if(fark ==6174) {

                System.out.println(sayac+"- En Büyük = "+enBuyuk+"  En Küçük= "+enKucuk+" Fark = "+fark);
                System.out.println(sayac+". Denemede Buldunuz Kaprekar Sabitine Ulaştınız.");

                break;
        }
        else {
                System.out.println(sayac+"- En Büyük = "+enBuyuk+"  En Küçük= "+enKucuk+" Fark = "+fark);
                girilen=fark;
                girilenlerArrayList.clear(); //ArrayListlerimizi tekrardan kullanabilmek için içerisindeki
                enBuyukDegerArrayList.clear(); //elemanları siliyoruz.
                enKucukDegerArrayList.clear();
                sayac++;
            }
     }
    }

    public static boolean dortBasamakliMi(int veri){
       int sayac=0;

        while(veri != 0) {
            veri /= 10;
            ++sayac;
        }
        if (sayac==4)
            return true;
        else
            return false;

    }

    public static int arrayListIntegerCevir(ArrayList<Integer> arrayList){

        /*Önce dizi elemanlarını teker teker String'e çevirip toplama işlemini yapıyoruz bu şekilde arrayList
        * içerisindeki değerleri birleştirip değişkene atıyoruz. Daha sonra int türüne çevirip döndürüyoruz.*/
        String sayi="";
        int intSayi;

        for (int i=0;i<arrayList.size();i++){
            sayi+=arrayList.get(i).toString(); //string türüne cast
        }
        intSayi=Integer.parseInt(sayi); //int türüne cast
        return intSayi;
    }

}