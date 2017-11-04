package com.selametsamli;

public class Personel implements Karsilastir {

    private int yas;

    public Personel(){
        yas=0;
    }
    public Personel(int yas){
        this.yas=yas;
    }
    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }


    @Override
    public String karsilastir(Object nesne) {
        Personel p2=(Personel) nesne;
        if(this.yas>p2.yas){
            return "Asıl nesnedeki personel yaşı parametredeki personel  yaşından büyüktür";
        }

        else if(this.yas<p2.yas){

            return "Asıl nesnedeki personel yaşı parametredeki personel  yaşından küçüktür";
        }

        else{
            return "Yaslar Eşittir";
        }
    }
}
