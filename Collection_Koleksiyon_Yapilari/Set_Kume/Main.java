package selametsamli;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

            String [] isimler={"Emre","Ali","Ayşe","Bahar","Hasan","Ali","Ayşe"};

        HashSet<String > isimlerKumesi=new HashSet<>();
        for (String s:isimler){
            isimlerKumesi.add(s);
            if (isimlerKumesi.add(s)){
                System.out.println(s+" Kümeye eklendi.");
            }else{
                System.out.println(s+ " kümeye eklenemedi");
            }
        }
        System.out.println("Gelişmiş for döngüsü ile elemanları yazıdırıyoruz");
        System.out.println();
        for (String s: isimlerKumesi){
            System.out.println(s);
        }
        System.out.println("Iterator ile elemanları yazıdırıyoruz");
        System.out.println();

        Iterator<String> i=isimlerKumesi.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println();
        i=isimlerKumesi.iterator();
        while(i.hasNext()){
            if (i.next().equals("Emre")){
                i.remove();
            }
        }
        for (String s: isimlerKumesi){
            System.out.println(s);

    }
}
}
