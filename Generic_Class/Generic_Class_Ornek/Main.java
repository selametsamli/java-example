package selametsamli;

public class Main {

    public static void main(String[] args) {
	    String [] strintDizi={"Selamet","Şamlı","Rize"};
	    Integer [] intDizi={1,2,3};
	    Double[] doubleDizi={1.2,2.3,3.4};
	    Character[] charDizi={'s','e','l'};

	   /* StringDiziYaz s1=new StringDiziYaz();
	    s1.yazdir(strintDizi);

	    IntegerDiziYaz i1=new IntegerDiziYaz();
	    i1.yazdir(intDizi);

	    CharDiziYaz c1=new CharDiziYaz();
	    c1.yazdir(charDizi);

	    DoubleDiziYaz d1=new DoubleDiziYaz();
	    d1.yazdir(doubleDizi);

        */

	    DiziYazdir <String> s2=new DiziYazdir<>();
	    s2.yazdir(strintDizi);
        DiziYazdir <Integer> i2=new DiziYazdir<>();
        i2.yazdir(intDizi);
        DiziYazdir <Character> c2=new DiziYazdir<>();
        c2.yazdir(charDizi);
        DiziYazdir <Double> d2=new DiziYazdir<>();
        d2.yazdir(doubleDizi);





    }
}
