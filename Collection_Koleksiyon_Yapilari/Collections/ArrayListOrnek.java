package selametsamli;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOrnek {
    public static void main(String[] args) {

        String[] isimler = {"Selamet", "Enes", "İlteriş", "Hayri", "Fikret Abi", "Hayrullah"};
        String[] soyisimler = {"selamete", "Enes", "İlteriş", "nuriye", "ayşegül"};

        ArrayList<String> isimListesi = new ArrayList<>();
        ArrayList<String> soyisimListesi = new ArrayList<>();


        for (String s : isimler) {
            isimListesi.add(s);
        }
        for (String s : soyisimler) {
            soyisimListesi.add(s);
        }
        /*
        isimListesi.retainAll(soyisimListesi);

        for (String s:isimListesi){
            System.out.print(s+" ");
        }
        System.out.println(isimListesi.size());
        */

       /* Iterator<String> iterator=isimListesi.listIterator(); //iteratör oluşturulur.

        while (iterator.hasNext()){//listede gezilecek var isi
            if (soyisimListesi.contains(iterator.next())){
                iterator.remove();
            }
        }
        for (String s:isimListesi){
            System.out.print(s+" ");
        }

    }*/
      /* for (String s:isimler){
           if (soyisimListesi.contains(s)){
               isimListesi.remove(s);
           }
       }*/



    }
}
