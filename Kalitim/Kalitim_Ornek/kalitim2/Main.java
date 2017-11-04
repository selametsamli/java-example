package kalitim2;

public class Main {

    public static void main(String[] args){

        Personel ali=new Personel("Ali","Tıss",53);
        System.out.println(ali.getKimlikBilgileri());

        Ogrenci selamet=new Ogrenci("Selamet","Şamlı",21,1453);
        System.out.println(selamet.getKimlikBilgileri());
        System.out.println(ali.toString());
        System.out.println(selamet.toString());


    }
}
