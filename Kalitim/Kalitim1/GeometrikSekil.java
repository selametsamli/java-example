package com.selametsamli;

public class GeometrikSekil {

    private int en;
    private int boy;

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    @Override
    public String toString() { //oluşturulan methodu String ile göstermeye yarar.
        return "En bilgisi :"+this.en+"Boy bilgisi:"+this.boy;
    }





}
