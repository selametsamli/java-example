package com.selametsamli;

public class Ogrenci {
    private int ogrNo;
    private String isim;
    public static int ogrenciSayisi=0;//nesne değişkeni değil sınıf değişkeni olur

    public Ogrenci(int ogrNo, String isim) {
        this.ogrNo = ogrNo;
        this.isim = isim;
        ogrenciSayisi++;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public static void selamVer(){
        System.out.println("Merhaba Static Olmayan Methoddan");

    }
}
