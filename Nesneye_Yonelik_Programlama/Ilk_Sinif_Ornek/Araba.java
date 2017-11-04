package com.selametsamli;

public class Araba {

    private int yil;
    private String renk;
    private String adi;
    private int beygirGucu;
    private boolean otomatikVitesMi;


    public void setYil(int yil){

        if (yil<=2017) {
            this.yil = yil;
        }else System.out.println("Yanlış değer.");
    }
    public int getYil(){
        return this.yil;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getBeygirGucu() {
        return beygirGucu;
    }

    public void setBeygirGucu(int beygirGucu) {
        this.beygirGucu = beygirGucu;
    }

    public boolean isOtomatikVitesMi() {
        return otomatikVitesMi;
    }

    public void setOtomatikVitesMi(boolean otomatikVitesMi) {
        this.otomatikVitesMi = otomatikVitesMi;
    }
}
