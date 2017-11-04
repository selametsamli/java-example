package selametsamli;

public class Main {

    public static void main(String[] args) {


        String[] isimlerDizisi={"Selamet","Hamdi","Fatma"};

        class StringDiziYaz{
        void stringDiziYazdir(String[]isimler){
                for(String gecici:isimler){
                    System.out.println(gecici);
                }
        }
    }

        StringDiziYaz nesne=new StringDiziYaz();
        nesne.stringDiziYazdir(isimlerDizisi);


    }



}
