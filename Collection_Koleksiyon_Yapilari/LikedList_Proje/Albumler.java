package selametsamli;

import java.util.ArrayList;
import java.util.LinkedList;

public class Albumler {

    private String albumAdi;
    private String sarkiciAdi;
    private ArrayList<Sarki> sarkilar;

    public Albumler(String albumAdi, String sarkiciAdi) {
        this.albumAdi = albumAdi;
        this.sarkiciAdi = sarkiciAdi;
        sarkilar = new ArrayList<>();
    }


    public boolean sarkiEkle(String sarkiciAdi, double sarkiSuresi) {
        if (sarkiBul(sarkiciAdi) == null) {
            Sarki s = new Sarki(sarkiciAdi, sarkiSuresi);
            this.sarkilar.add(s);
            //this.sarkilar.add(new Sarki(sarkiciAdi,sarkiSuresi));
            return true;
        } else {
            System.out.println("Şarkı zaten albümde yer alıyor.");
            return false;
        }

    }

    private Sarki sarkiBul(String sarkiciAdi) {
        for (Sarki oankiSarki : sarkilar) {
            if (oankiSarki.getSarkiAdi().equals(sarkiciAdi)) {
                return oankiSarki;
            }
        }
        return null;
    }

    public boolean oynatmaListesineEkle(String sarkiAdi, LinkedList<Sarki> oynatmaListesi) {

        Sarki eklenecekSarki = sarkiBul(sarkiAdi);//Almbümde olup olmadığının kontrolü yapılır.

        if (eklenecekSarki != null) {
            oynatmaListesi.add(eklenecekSarki);
            return true;
        } else {
            System.out.println(sarkiAdi + " Bir albümde kayıtlı değil.");
            return false;
        }

    }

    public boolean oynatmaListesineEkle(int sarkiNumarasi, LinkedList<Sarki> oynatmaListesi) {

        int index = sarkiNumarasi - 1;

        if ((index >= 0) && (index <= this.sarkilar.size())) {

            oynatmaListesi.add(this.sarkilar.get(index));
            return true;

        } else {
            System.out.println("Bu albümde belirtilen şarkı yok");
        }

        return false;
    }


}


