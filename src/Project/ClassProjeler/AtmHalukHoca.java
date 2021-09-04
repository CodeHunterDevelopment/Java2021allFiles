package Project.ClassProjeler;

public class AtmHalukHoca {

	/*
	 * ATM uygulamasi yapiniz.
	 * 
	 * 1. Adim : Bankamizdaki musterilerin musteriNumarasi ve 4 haneli sifresini tutan bir HashMap olusturalim.
	 * 		     Ve bu musterileri biz ekleyelim.
	 * 			Integer, Integer
	 * 
	 * 			Musteri No  -- Sifre
	 * 			12345678	   1876
	 * 			22222222	   1234
	 * 			98765432	   1453
	 * 			55554444	   2020
	 * 
	 * 2. Adim : Bankamizdaki musterilerin hesaplarindaki para miktarini tutan bir tane HashMap olusturalim.
	 * 		     Ve bu miktarlari musteri numarasiyla birlikte ekleyelim
	 * 			Integer,Float
	 * 
	* 			Musteri No  -- Para
	 * 			12345678	   120.0
	 * 			22222222	   3000.0
	 * 			98765432	   7000.0
	 * 			55554444	   50.0
	 *  	
	 * 3. Adim : Giris ekrani olusturalim.
	 *           Musteri buradan giris yapsin.
	 * 			 Kullanici adi ve sifre isteyelim, dogru ise giris yapsin.
	 * 
	 * 4. Adim : Dogru musteri numarasi ve sifre kontrol eden methodlar yazalim.
	 * 			 musteriNumarasiDogruMu(int no)
	 * 			 	Hashmap listemizde varsa, dogru musteri numarasidi.
	 * 
	 * 			sifreDogruMu (int no, int sifre)
	 * 				HashMap'teki sifre ile uyusuyorsa dogru sifredir.
	 * 
	 * 5. Adim : Girıs yaptıktan sonra karsısına 3 tane secenek cıksın :
	 * 			 Bunları da menuGoster() methodu ile yapalım.
	 * 			 1- Para cek			// 300
	 * 			 2- Para Yukle			// 500 + 100
	 * 			 3- Toplam Paramı Gor	// 200
	 * 			 4- Cıkıs Yap
	 * 
	 * 6. Adim : Cıkıs methodu olusturalim.
	 * 			 Giris yapan musteri cikis yapmak isterse, toplamPara ve girisYapanMusteriNo'yu sifirlayalim.
	 * 			 Tekrar giris ekranina yndendirelim.
	 * 
	 * 6. Adim : Toplam parami gor methodu olusturalım. toplamParamiGor()
	 * 			
	 * 7. Adim : 1- Para cekme methodu olusturalım
	 * 			 Hesaba giris yapan musteriye hesabındaki toplam parayı gosterelim.
	 * 			 Kullanicidan cekmek istedigi tutari ogrenelim.
	 * 			 Hesabinda yeterli para varsa, para ceksin yoksa uyarı verelim.
	 * 			 Cektigi tutarı, toplam parasından duselim ve kaydedelim.
	 *			 Baska islem yapmak isteyip istemedigini soralim, isterse yaptiralim, yoksa cikis islemi gerceklestirelim.
	 * 		  
	 * 8. Adim : 1- Para Yukleme Methodu Olusturalim
	 * 			 Hesaba giris yapan musteriye hesabindaki toplam parayi gsterelim.
	 * 			 Kullanicidan yuklemek istedigi tutari ogrenelim.
	 * 			 Yukledigi tutari, toplam parasina ekleyelim ve gsterelim.
	 * 			 Baska islem yapmak isteyip istemedigini soralim, isterse yaptiralim, yoksa cikis islemi gerceklestirelim.
	 * 
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
