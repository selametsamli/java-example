package selametsamli;

public class Ogrenci {
    private String isim;
    public static int toplamOgrenciSayisi=0;
    private final int ogrenciNo;


    public Ogrenci(String isim) {
        this.isim = isim;
        toplamOgrenciSayisi++;
        ogrenciNo=toplamOgrenciSayisi;
        System.out.println(isim+" adlı öğrenci oluşturuldu. Öğrenci No:"+ogrenciNo);

    }
}
