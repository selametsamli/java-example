package selametsamli;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lig<T extends Takim> {
    private String isim;
    private ArrayList<T> tumTakimlar=new ArrayList<>();

    public Lig(String isim){
        this.isim=isim;

    }

    public boolean takimEkle(T yeniTakim){
        if (tumTakimlar.contains(yeniTakim)){//içeriyorsa
            return false;
        }
        tumTakimlar.add(yeniTakim);
        return true;


    }
    public void puanTablosu(){

        Collections.sort(tumTakimlar,Collections.reverseOrder());

        for (T gecici:tumTakimlar){
            System.out.println(gecici.getIsim()+" : "+gecici.toplamTakimPuani());
        }
    }

}
