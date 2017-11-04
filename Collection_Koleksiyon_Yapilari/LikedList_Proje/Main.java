package selametsamli;

import java.util.*;

public class Main {

    private static ArrayList<Albumler> tumAlbumler=new ArrayList<>();

    public static void main(String[] args) {
	Albumler teomaninAlbumu=new Albumler("On Yedi","Teoman");
	teomaninAlbumu.sarkiEkle("Hayalperest",4.10);
	teomaninAlbumu.sarkiEkle("Gemiler",3.50);
	teomaninAlbumu.sarkiEkle("İki Yabancı",2.43);
	teomaninAlbumu.sarkiEkle("Soluk Soluğa",1.93);

	tumAlbumler.add(teomaninAlbumu);

	Albumler yildizTilbeAlbumu=new Albumler("Anca Gidersin","Yıldız Tilbe");
	yildizTilbeAlbumu.sarkiEkle("Bin Dereden Su Getirsen",3.40);
	yildizTilbeAlbumu.sarkiEkle("Delikanlım",2.40);
	yildizTilbeAlbumu.sarkiEkle("Vazgeçtim",5.30);
	yildizTilbeAlbumu.sarkiEkle("Ama Evlisin",1.20);

	tumAlbumler.add(yildizTilbeAlbumu);

	LinkedList<Sarki> oynatmaListesi=new LinkedList<>();

	//teomanın albümü: tumAlbumler.get(0);
		// Yıldız Tilbe albümü: tumAlbumler.get(1);

	tumAlbumler.get(0).oynatmaListesineEkle("Hayalperest",oynatmaListesi);
	tumAlbumler.get(0).oynatmaListesineEkle("İki Yabancı",oynatmaListesi);
	//tumAlbumler.get(0).oynatmaListesineEkle("Bu Şarkı Yok",oynatmaListesi);
	tumAlbumler.get(0).oynatmaListesineEkle("Soluk Soluğa",oynatmaListesi);

	tumAlbumler.get(1).oynatmaListesineEkle(1,oynatmaListesi);
	tumAlbumler.get(1).oynatmaListesineEkle(3,oynatmaListesi);
	tumAlbumler.get(1).oynatmaListesineEkle(4,oynatmaListesi);
	//	tumAlbumler.get(1).oynatmaListesineEkle(9,oynatmaListesi);

			oynatma(oynatmaListesi);



	}

	private static void oynatma(LinkedList<Sarki> oynatmaListesi) {

		Scanner tara=new Scanner(System.in);
		boolean cikis=false;
		boolean ileriyeDogruMuGidiliyor=true;

		ListIterator<Sarki> iterator=oynatmaListesi.listIterator();
		if (oynatmaListesi.size()==0){
			System.out.println("Listeye henüz şarkı eklenmemiş.");
			return;
		}else{
			System.out.println("Şuan çalan şarkı: "+iterator.next().toString());
		}


    	menuGoster();

		while (!cikis){
			int	kullaniciSecimi=tara.nextInt();
			switch (kullaniciSecimi){

				case 0:
					System.out.println("Uygulamadan Çıkılıyor.");
					cikis=true;
					break;
				case 1:
					if (!ileriyeDogruMuGidiliyor){
						if (iterator.hasNext()){
							iterator.next();
						}
						ileriyeDogruMuGidiliyor=true;
					}
					if (iterator.hasNext()){
						System.out.println("Şuan çalan şarkı: "+iterator.next());
					}else{
						System.out.println("Listenin sonuna geldiniz.");
					}
					break;
				case 2:
					if(ileriyeDogruMuGidiliyor){
						if (iterator.hasPrevious()) {
							iterator.previous();
						}
						ileriyeDogruMuGidiliyor=false;
					}
					if (iterator.hasPrevious()){
						System.out.println("Şuan çalan şarkı: "+ iterator.previous());
					}else{
						System.out.println("Listenin başına geldiniz.");
					}
					break;
				case 3:
					if (ileriyeDogruMuGidiliyor){
						if (iterator.hasPrevious()){
							System.out.println("Tekrarlanan şarkı : "+iterator.previous());
							ileriyeDogruMuGidiliyor=false;
						}else{
							System.out.println("Listenin başındasınız....");
						}

					}else{
						if (iterator.hasNext()){
							System.out.println("Tekrarlanan Şarkı : "+iterator.next());
							ileriyeDogruMuGidiliyor=true;
						}else{
							System.out.println("Listenin Sonudayız");
						}
					}
					break;
				case 4:
					oynatmaListesiniGoster(oynatmaListesi);
					break;
				case 5:
					menuGoster();
					break;
			}
		}


	}

	private static void oynatmaListesiniGoster(LinkedList<Sarki> oynatmaListesi) {

		Iterator<Sarki> iterator=oynatmaListesi.iterator();
		System.out.println("=========================");
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}

	private static void menuGoster(){
		System.out.println("Seçimin yapınız");
		System.out.println("0 - Çıkış");
		System.out.println("1 - Bir sonraki şarkı");
		System.out.println("2 - Bir önceki şarkı");
		System.out.println("3 - Şarkıyı yeniden başlat");
		System.out.println("4 - Oynatma listesindeki tüm şarkılar");
		System.out.println("5 - Menüyü göster");

	}
}
