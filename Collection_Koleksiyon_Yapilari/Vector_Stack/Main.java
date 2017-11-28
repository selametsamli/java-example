package selametsamli;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
//
//        Vector<Integer> sayilar=new Vector<>();
//
//        sayilar.add(1);
//        sayilar.add(2);
//        sayilar.add(3);
//        sayilar.add(4);
//
//        System.out.println(sayilar.firstElement());
//        System.out.println(sayilar.lastElement());
//        System.out.println("-----------------------------");
//        for (int i:sayilar){
//            System.out.println(i);
//        }
//        System.out.println("-----------------------------");
//
//        Enumeration<Integer> e=sayilar.elements();
//        while (e.hasMoreElements()){
//            System.out.println(e.nextElement());
//        }


        Stack<Integer>  sayilarYigini=new Stack<>();
        sayilarYigini.push(1);
        sayilarYigini.push(2);
        sayilarYigini.push(3);
        sayilarYigini.push(4);
        sayilarYigini.push(5);

        System.out.println(sayilarYigini.toString());
        System.out.println("----------------------------");

       /* Enumeration<Integer> e=sayilarYigini.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }*/

        System.out.println("Yığının son elemanı "+sayilarYigini.peek());
        System.out.println(sayilarYigini.toString());
        System.out.println("Yığının son elemanı "+sayilarYigini.pop());

        System.out.println(sayilarYigini.toString());


    }
}
