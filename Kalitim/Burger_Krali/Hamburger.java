package com.selametsamli;

public class Hamburger {

    private String ismi;
    private String ekmekCesidi;
    private String etCesidi;
    private double ucreti;

    private String ilaveUrunAdi1;
    private double ilaveUrunUcreti1;

    private String ilaveUrunAdi2;
    private double ilaveUrunUcreti2;

    private String ilaveUrunAdi3;
    private double ilaveUrunUcreti3;

    private String ilaveUrunAdi4;
    private double ilaveUrunUcreti4;

    public void ekleIlaveUrun1(String ad,double ucret){

        this.ilaveUrunAdi1=ad;
        this.ilaveUrunUcreti1=ucret;
    }

    public void ekleIlaveUrun2(String ad,double ucret){

        this.ilaveUrunAdi2=ad;
        this.ilaveUrunUcreti2=ucret;
    }

    public void ekleIlaveUrun3(String ad,double ucret){

        this.ilaveUrunAdi3=ad;
        this.ilaveUrunUcreti3=ucret;
    }

    public void ekleIlaveUrun4(String ad,double ucret){

        this.ilaveUrunAdi4=ad;
        this.ilaveUrunUcreti4=ucret;
    }

    public Hamburger(String ismi, String ekmekCesidi, String etCesidi, double ucreti) {
        this.ismi = ismi;
        this.ekmekCesidi = ekmekCesidi;
        this.etCesidi = etCesidi;
        this.ucreti = ucreti;
    }

    public String getIsmi() {
        return ismi;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    public String getEkmekCesidi() {
        return ekmekCesidi;
    }

    public void setEkmekCesidi(String ekmekCesidi) {
        this.ekmekCesidi = ekmekCesidi;
    }

    public String getEtCesidi() {
        return etCesidi;
    }

    public void setEtCesidi(String etCesidi) {
        this.etCesidi = etCesidi;
    }

    public double getUcreti() {
        return ucreti;
    }

    public void setUcreti(double ucreti) {
        this.ucreti = ucreti;
    }

    public double hamburgerBilgileri(){

        double toplamUcret=this.ucreti;
        System.out.println("Hamburger adı:"+this.ismi
                        +"\nEkmek Türü:"
                        +this.ekmekCesidi
                        +"\nEt Türü:"
                        +this.etCesidi
                        +"\nFiyat:"+this.ucreti);
        if(this.ilaveUrunAdi1!=null){
            toplamUcret+=this.ilaveUrunUcreti1;
            System.out.println("İlave Ürün:"+this.ilaveUrunAdi1+" Ücreti:"+this.ilaveUrunUcreti1);
        }
        if(this.ilaveUrunAdi2!=null){
            toplamUcret+=this.ilaveUrunUcreti2;
            System.out.println("İlave Ürün:"+this.ilaveUrunAdi2+" Ücreti:"+this.ilaveUrunUcreti2);
        }
        if(this.ilaveUrunAdi3!=null){
            toplamUcret+=this.ilaveUrunUcreti3;
            System.out.println("İlave Ürün:"+this.ilaveUrunAdi3+" Ücreti:"+this.ilaveUrunUcreti3);
        }
        if(this.ilaveUrunAdi4!=null){
            toplamUcret+=this.ilaveUrunUcreti4;
            System.out.println("İlave Ürün:"+this.ilaveUrunAdi4+" Ücreti:"+this.ilaveUrunUcreti4);
        }

        return toplamUcret;
    }

}
