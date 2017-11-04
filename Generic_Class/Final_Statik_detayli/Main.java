package selametsamli;

public class Main {

    public static void main(String[] args) {

        Ogrenci ogr1=new Ogrenci("Selamet");
        System.out.println(Ogrenci.toplamOgrenciSayisi);

        Ogrenci ogr2=new Ogrenci("Hayri");
        System.out.println(Ogrenci.toplamOgrenciSayisi);

        Password p1=new Password(8);
        p1.sifreSakla();

        p1.girisYap(10);
        p1.girisYap(-11);
        p1.girisYap(8);

        Deneme d1=new Deneme();

    }
}
