package selametsamli;

public class Main {

    public static void main(String[] args) {

        FutbolOyuncu f1=new FutbolOyuncu("selamet");
        FutbolOyuncu f2=new FutbolOyuncu("İlteriş");

        BasketbolOyuncu b1=new BasketbolOyuncu("Enes");
        BasketbolOyuncu b2=new BasketbolOyuncu("Hayri");

        Takim<FutbolOyuncu> rs=new Takim("Rizespor Futbol Takımı ");
        Takim<FutbolOyuncu> ez=new Takim("Erzurumspor Futbol Takımı ");
        Takim<FutbolOyuncu> bjk=new Takim("Beşiktaş Futbol Takımı ");
        Takim<FutbolOyuncu> fb=new Takim("Fenerbahçe Futbol Takımı ");

        Takim<BasketbolOyuncu> anadoluEfes=new Takim("Anadolu Efes Basketbol Takımı");
        Takim<BasketbolOyuncu> pinarKarsiyaka=new Takim("Pınar Karşıyaka Basketbol Takımı");

        rs.oyuncuEkle(f1);
        rs.oyuncuEkle(f2);
        System.out.println(rs.toplamOyuncuSayisi());

        anadoluEfes.oyuncuEkle(b1);
        anadoluEfes.oyuncuEkle(b2);

        System.out.println(anadoluEfes.toplamOyuncuSayisi());

        rs.macYap(ez,5,3);
        ez.macYap(bjk,2,1);
        rs.macYap(fb,4,3);
        fb.macYap(bjk,2,2);
        rs.macYap(bjk,1,1);


        System.out.println("Rizespor Toplam Skor:"+rs.toplamTakimPuani());
        System.out.println("Erzurumspor Toplam Skor:"+ez.toplamTakimPuani());
        System.out.println("Fenerbahçe Toplam Skor:"+fb.toplamTakimPuani());
        System.out.println("Beşiktaş Toplam Skor:"+bjk.toplamTakimPuani());

        Lig<Takim<FutbolOyuncu>> futbolLigi=new Lig("Süper Lig ");//sadece futbol sınıfındaki takımları ekler
        futbolLigi.takimEkle(rs);
        futbolLigi.takimEkle(ez);
        futbolLigi.takimEkle(fb);
        futbolLigi.takimEkle(bjk);

        futbolLigi.puanTablosu();



    }
}
