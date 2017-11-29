package selametsamli;

public class Main {

    public static void main(String[] args) {

        int[] sayilar=new int[3];
        sayilar[0]=1;
        sayilar[1]=2;
        sayilar[2]=3;
        istisna1(sayilar);
        System.out.println("Main methodun sonu");


    }

    private static void istisna1(int[] sayilar) {

        istisna2(sayilar);
        System.out.println("istisna 1'desin şuan");

    }

    private static void istisna2(int[] sayilar) {

        System.out.println("istisna 2 methodu başladı");
             try{
            System.out.println("Sayı:"+sayilar[0]);
            System.out.println("Sayı:"+sayilar[1]);
            System.out.println("Sayı:"+sayilar[2]);
            System.out.println("Sayı:"+sayilar[3]);
        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Hata istisna 2 de yakalandı");

        }
        System.out.println("İstisna 2 methodu bitti");


    }
}
