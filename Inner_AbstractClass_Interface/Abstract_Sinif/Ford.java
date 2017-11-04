package com.selametsamli;

public class Ford extends Araba {
    private int cantKalinlik;

    public int getCantKalinlik() {
        return cantKalinlik;
    }

    public void setCantKalinlik(int cantKalinlik) {
        this.cantKalinlik = cantKalinlik;
    }

    @Override
    public int saatteYaktigiBenzinLitersi() {
        return getAgirlik()*2;
    }
}
