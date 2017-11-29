package selametsamli;

public class Main2 {

    public static void main(String[] args) {

        int[] sayilar=new int[3];
        sayilar[0]=1;
        sayilar[1]=2;
        sayilar[2]=3;
        istisna1(sayilar);
        System.out.println("Main methodun sonu");



    }

    private static void istisna1(int[] sayilar) {

        try {
            istisna2(sayilar);
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("hata istisna 1 de yakalandı");

        }
        System.out.println("istisna 1 sonlandı");

    }

    private static void istisna2(int[] sayilar) {

        System.out.println("istisna 2 başladı");

        System.out.println("Sayı:"+sayilar[0]);
        System.out.println("Sayı:"+sayilar[1]);
        System.out.println("Sayı:"+sayilar[2]);
        System.out.println("Sayı:"+sayilar[3]);

        System.out.println("istisna 2 sonu");

    }

}
