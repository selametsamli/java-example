package selametsamli;

public class Main {

    public static void main(String[] args) {

        String [] strintDizi={"Selamet","Şamlı","Rize"};
        Integer [] intDizi={1,2,3};
        Double[] doubleDizi={1.2,2.3,3.4};
        Character[] charDizi={'s','e','l'};

        yazdir(strintDizi);
        yazdir(intDizi);
        yazdir(doubleDizi);
        yazdir(charDizi);

    }

    public static <Genel> void yazdir(Genel[] dizi){

        for (Genel gecici:dizi){
            System.out.println(gecici+"");
        }

    }


}
