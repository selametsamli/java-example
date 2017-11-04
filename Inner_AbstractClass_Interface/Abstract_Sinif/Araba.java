package com.selametsamli;

public abstract class Araba {

    private int agirlik;
    private String model;
    private String renk;

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public abstract int saatteYaktigiBenzinLitersi();//Araba sınıfı nasıl üreteciğini bilmiyor.

}
