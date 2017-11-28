package selametsamli;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

public class NotData {

    private static NotData instance=new NotData();
    private static String dosyaAdi="notlarListesi.txt";
    private DateTimeFormatter formatter;

    private ArrayList<NotOge> notListesi;

    private NotData(){//Constructor
        formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    public static NotData getInstance(){

        return instance;
    }

    public ArrayList<NotOge> getNotListesi() {
        return notListesi;
    }

    public void setNotListesi(ArrayList<NotOge> notListesi) {
        this.notListesi = notListesi;
    }
    public void notlariDosyadanGetir() throws IOException {

        notListesi=new ArrayList<>();

        Path dosyaYolu= Paths.get(dosyaAdi);
        BufferedReader br= Files.newBufferedReader(dosyaYolu);

        String ifade;

        try {
            while ((ifade = br.readLine()) != null) {

                String[] notParcalari = ifade.split("\t");
                String baslik = notParcalari[0];
                String detay = notParcalari[1];
                String bitisTarihi = notParcalari[2];

                LocalDate tarih = LocalDate.parse(bitisTarihi, formatter);

                NotOge dosyadanOkunanNotSatiri = new NotOge(baslik, detay, tarih);
                notListesi.add(dosyadanOkunanNotSatiri);

            }

        }finally {
            {
                if(br!=null){
                    br.close();
                }
            }
        }

    }

    public void notlariDosyayaYaz() throws IOException {

        Path dosyaYolu=Paths.get(dosyaAdi);
        BufferedWriter bw=Files.newBufferedWriter(dosyaYolu);
        try {
            Iterator<NotOge> iterator = notListesi.iterator();
            while (iterator.hasNext()) {

                NotOge oAnkiNotOgesi = iterator.next();
                bw.write(String.format("%s\t%s\t%s", oAnkiNotOgesi.getBaslik(), oAnkiNotOgesi.getNotDetay(),
                        oAnkiNotOgesi.getBitisTarih().format(formatter)));

                bw.newLine();

            }
        }finally {
            if (bw!=null){
                bw.close();
            }
        }

    }
    public void yeniNotEkle(NotOge yeniNot){
        notListesi.add(yeniNot);
    }

}
