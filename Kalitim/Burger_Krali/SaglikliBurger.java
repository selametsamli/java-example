package com.selametsamli;

public class SaglikliBurger extends Hamburger{

    public SaglikliBurger(String etCesidi, double ucreti) {
        super("Sağlıklı Burger", "Kepekli Ekmek", etCesidi, ucreti);


    }

    private String ilaveSaglikliUrunAdi1;
    private double ilaveSaglikliUrunUcreti1;

    private String ilaveSaglikliUrunAdi2;
    private double ilaveSaglikliUrunUcreti2;

    public void ekleSaglikliUrun1(String ad,double fiyat){
        this.ilaveSaglikliUrunAdi1=ad;
        this.ilaveSaglikliUrunUcreti1=fiyat;

    }

    public void ekleSaglikliUrun2(String ad,double fiyat){
        this.ilaveSaglikliUrunAdi2=ad;
        this.ilaveSaglikliUrunUcreti2=fiyat;

    }

    @Override
    public double hamburgerBilgileri() {
        double toplamUcret=super.hamburgerBilgileri();

        if(this.ilaveSaglikliUrunAdi1!=null){
            toplamUcret+=ilaveSaglikliUrunUcreti1;
            System.out.println("İlave sağlıklı Burger 1:"+this.ilaveSaglikliUrunAdi1+" Ücreti:"+this.ilaveSaglikliUrunUcreti1);
        }

        if(this.ilaveSaglikliUrunAdi2!=null){
            toplamUcret+=ilaveSaglikliUrunUcreti1;
            System.out.println("İlave sağlıklı Burger 1:"+this.ilaveSaglikliUrunAdi2+" Ücreti:"+this.ilaveSaglikliUrunUcreti2);
        }
        return toplamUcret;
    }
}
