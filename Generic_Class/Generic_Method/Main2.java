package selametsamli;

public class Main2 {

    public static void main(String[] args){

        Kare k1=new Kare(6);
        Kare k2=new Kare(15);
        Kare buyukOlanKare=alanKarsilastir(k1,k2);
        System.out.println(buyukOlanKare.alanBul());
        Dikdortgen d1=new Dikdortgen(4,9);
        Dikdortgen d2=new Dikdortgen(15,5);
        Dikdortgen buyukOlanDikdortgen=alanKarsilastir(d1,d2);
        System.out.println(buyukOlanDikdortgen.alanBul());

        Kare gecici=genericAlanKarsilastir(k1,k2);
        System.out.println(gecici.alanBul());

    }

    public static <Genel extends Sekiller> Genel  genericAlanKarsilastir(Genel g1,Genel g2){

        if(g1.alanBul()>g2.alanBul()){

            return g1;
        }else{
            return g2;
        }


    }

    public static Kare alanKarsilastir(Kare k1,Kare k2){

        if(k1.alanBul()>k2.alanBul()){

            return k1;
        }else{
            return k2;
        }


    }
    public static Dikdortgen alanKarsilastir(Dikdortgen d1,Dikdortgen d2){

        if(d1.alanBul()>d2.alanBul()){

            return d1;
        }else{
            return d2;
        }
    }

}
