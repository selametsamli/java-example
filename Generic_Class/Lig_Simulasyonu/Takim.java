package selametsamli;
import java.util.ArrayList;

public class  Takim <T extends Oyuncu>  implements Comparable<Takim<T>>{

    private String takimAdi;
    int oynadigiMacSayisi=0;
    int kazandigiMacSayisi=0;
    int kaybettigiMacSayisi=0;
    int beraberlikMacSayisi=0;

    private ArrayList<T> oyuncular=new ArrayList<>();

    public Takim(String isim){
        this.takimAdi=isim;

    }
    public String getIsim(){
        return takimAdi;
    }

    public boolean oyuncuEkle(T yeniOyuncu){
        if(oyuncular.contains(yeniOyuncu)){
            System.out.println(yeniOyuncu.getIsim()+"Zaten takıma kayıtlı");
            return false;
        }
        oyuncular.add(yeniOyuncu);
        System.out.println(yeniOyuncu.getIsim()+" takıma Eklendi");
        return true;
    }

    public int toplamOyuncuSayisi(){

        return oyuncular.size();//oyuncu sayısını geriye döndür
    }

    public void macYap(Takim<T> rakipTakim,int benimSkorum,int rakibinSkoru){
        String mesaj="";
        if (benimSkorum>rakibinSkoru){
            mesaj="kazandı ";
            kazandigiMacSayisi++;
        }else if(benimSkorum<rakibinSkoru){
            mesaj="kaybetti ";
            kaybettigiMacSayisi++;
        }else {
            mesaj="berabere kaldı ";
            beraberlikMacSayisi++;
        }
        oynadigiMacSayisi++;

        if (rakipTakim!=null){//rakibin maç kaybettiği veya kazandığı durumda ekliyoruz.
            System.out.println(this.getIsim()+mesaj+rakipTakim.getIsim());
            rakipTakim.macYap(null,rakibinSkoru,benimSkorum);
        }
    }

    public int toplamTakimPuani(){
        return (kazandigiMacSayisi*3)+beraberlikMacSayisi;
    }


    @Override
    public int compareTo(Takim<T> o) {
        if (this.toplamTakimPuani() > o.toplamTakimPuani()){
            return 1;
        }else if(this.toplamTakimPuani()<o.toplamTakimPuani()){
            return -1;
        }else return 0;
    }
}
