package selametsamli;

public class Ogrenci implements Comparable<Ogrenci> {
    private int ogrNo;
    private int ogrNot;

    public Ogrenci(int ogrNo, int ogrNot) {
        this.ogrNo = ogrNo;
        this.ogrNot = ogrNot;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }

    public int getOgrNot() {
        return ogrNot;
    }

    public void setOgrNot(int ogrNot) {
        this.ogrNot = ogrNot;
    }

    @Override
    public String toString() {
        return "öğrenci no:"+this.ogrNo+" Öğrenci not:"+this.ogrNot;
    }

    @Override
    public int compareTo(Ogrenci o) {
        if(this.ogrNot==o.ogrNot){
            return 0;
        }else if(this.ogrNot>o.ogrNot){
            return 1;
        }else if(this.ogrNot<o.ogrNot){
            return -1;
        }
        return 0;
    }
}
