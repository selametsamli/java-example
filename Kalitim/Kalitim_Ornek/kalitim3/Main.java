package kalitim3;

public class Main {

    public static void main(String[] args){

    Personel p1=new Personel("Selamet","Şamlı",21);
    System.out.println(p1.getKimlikBilgileri());
    Ogrenci ogr1=new Ogrenci("Selamet","Şamlı",21,1453);
    System.out.println(ogr1.getKimlikBilgileri());

    }
}
