package selametsamli;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LikedListOrnek {

    public static void main(String[] args) {

        LinkedList<String> gezilecekYerler=new LinkedList<>();
       /* gezilecekYerler.add("Ankara");
        gezilecekYerler.add("İstanbul");
        gezilecekYerler.add("Rize");
        gezilecekYerler.add("İzmir");
        gezilecekYerler.add("Konya");
        gezilecekYerler.add("Antalya");*/

        siraliEkle(gezilecekYerler,"Ankara");
        siraliEkle(gezilecekYerler,"İstanbul");
        siraliEkle(gezilecekYerler,"Rize");
        siraliEkle(gezilecekYerler,"İzmir");
        siraliEkle(gezilecekYerler,"Bursa");
        siraliEkle(gezilecekYerler,"Antalya");

        yerleriYazdir(gezilecekYerler);

       // gezilecekYerler.add(2,"Bursa");

       // yerleriYazdir(gezilecekYerler);

}
    private static void yerleriYazdir(LinkedList<String> gezilecekYerler){
        ListIterator<String> stringListIterator=gezilecekYerler.listIterator();

        while (stringListIterator.hasNext()){
            System.out.println("Şuan ki yer: "+stringListIterator.next());
        }
        System.out.println("===============================");
    }

    private static boolean siraliEkle(LinkedList<String> gezilecekYerler,String yeniSehir){
        ListIterator<String> stringListIterator=gezilecekYerler.listIterator();

        while(stringListIterator.hasNext()){

            int karsilastir=stringListIterator.next().compareTo(yeniSehir);
            if (karsilastir==0){
                System.out.println(yeniSehir+" zaten listede");
                return false;
            }else if(karsilastir>0){
                stringListIterator.previous();
                stringListIterator.add(yeniSehir);
                return true;
            }else if(karsilastir<0){

            }

        }
        //listeye ilk eleman eklenirken
        stringListIterator.add(yeniSehir);
        return true;
    }
}
