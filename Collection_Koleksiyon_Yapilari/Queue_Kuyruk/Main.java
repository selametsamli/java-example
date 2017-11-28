package selametsamli;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> sayilar=new LinkedList<>();

        sayilar.add(1);
        sayilar.offer(5);
        sayilar.add(3);
        sayilar.offer(4);
        sayilar.add(2);
        sayilar.offer(6);

        System.out.println(sayilar);


        System.out.println(sayilar.remove());
        System.out.println(sayilar);

        System.out.println(sayilar.poll());
        System.out.println(sayilar);
        /*System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
*/
        System.out.println(sayilar.peek());
        System.out.println(sayilar.element());

    }
}
