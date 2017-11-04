package kalitim2;

public class Ogrenci extends Personel {

    private int ogrenciNo;

    public Ogrenci() {
        setIsim("Henüz Girilmedi.");
        setSoyisim("Henüz Girilmedi.");
        setYas(0);
        ogrenciNo=0;
    }

    public Ogrenci(String isim,String soyisim,int yas,int ogrenciNo){

        setIsim(isim);
        setSoyisim(soyisim);
        setYas(yas);
        setOgrenciNo(ogrenciNo);


    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        if(ogrenciNo<0){
            this.ogrenciNo=0;
        }
        else {
            this.ogrenciNo = ogrenciNo;
        }
    }

    @Override//ezer.
    public String getKimlikBilgileri() {
        return "Kimlik Bilgileri:"+" İsmi:"+getIsim()+" Soyisim:"+getSoyisim()+" Yaş:"+getYas()+" Öğrenci No:"+ogrenciNo;
    }

    @Override
    public String toString() {
        return super.toString()+" Ögrenci No:"+ogrenciNo;
    }
}
