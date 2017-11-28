package selametsamli;

import java.util.Collections;
import java.util.PriorityQueue;

public class OncelikliKuyruk {


    public static void main(String[] args) {

        PriorityQueue<Integer> oncelikliKuyruk=new PriorityQueue<>();
        oncelikliKuyruk.add(2);
        oncelikliKuyruk.add(1);//en küçük değer önceliklidir kuyruğa küçükten büyüğe doğru ekler
        oncelikliKuyruk.add(4);
        oncelikliKuyruk.add(3);
        System.out.println(oncelikliKuyruk);
        System.out.println("------------");
        PriorityQueue<String> q=new PriorityQueue<>(Collections.reverseOrder());//sıralamayı tersten yaptık
        q.add("Emre");
        q.add("Hayri");
        q.offer("Ayşe");
        q.offer("Selamet");
        System.out.println(q);


        PriorityQueue<Ogrenci> ogrenciler=new PriorityQueue<>();
        Ogrenci ogr1=new Ogrenci(100,80);
        ogrenciler.add(ogr1);

        ogrenciler.add(new Ogrenci(105,95));
        ogrenciler.add(new Ogrenci(11,93));

        ogrenciler.add(new Ogrenci(53,44));


        while (!ogrenciler.isEmpty()){

            System.out.println(ogrenciler.poll());

        }
    }

}
