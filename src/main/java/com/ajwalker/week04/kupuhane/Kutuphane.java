package com.ajwalker.week04.kupuhane;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
* kitaplar
uyeler
oduncListesi

kitapSayisi
uyeSayisi
oduncSayisi

oduncSuresi
gecikmeGunBasinaDusulecekPuan
*/
public class Kutuphane {
	//Sınıf değişkeni
	private static final int KITAP_KAPASITE = 200;
	private static final int UYE_KAPASITE = 50;
	private static final int ODUNC_KAPASITE = 50;
	private static final int ODUNC_SURESI = 15; //15 gün
	private static final int PUAN_CEZASI = 1; //
	
	//Nesne değişkenleri
	private Uye[] uyeler;
	private Odunc[] oduncListesi;
	private Kitap[] kitaplar;

	private int kitapSayisi;
	private int kitapIndex;
	
	private int uyeSayisi;
	
	private int oduncSayisi;
	private int oduncSuresi;
	private int gecikmePuan;
	
	//Constructor
	public Kutuphane() {
		kitaplar = new Kitap[KITAP_KAPASITE];
		uyeler = new Uye[UYE_KAPASITE];
		oduncListesi = new Odunc[ODUNC_KAPASITE];
	}
	//kitapEkle
	public boolean kitapEkle(Kitap eklenecekKitap){
		if (kitapSayisi <KITAP_KAPASITE){
			int varOlanKitapIndex = kitapBul(eklenecekKitap);
			if (varOlanKitapIndex != -1){
				//Daha önceden eklenmiş bir kitap varsa;
				kitaplar[varOlanKitapIndex].setAdet(kitaplar[varOlanKitapIndex].getAdet()+1);
				kitaplar[varOlanKitapIndex].setStok(kitaplar[varOlanKitapIndex].getStok()+1);
				kitapSayisi++;
				System.out.println(eklenecekKitap.getAd()+ " adlı kitabın adet degeri 1 artırıldı.");
			}
			else{
				//Daha önceden eklenmiş bir kitap yoksa;
				kitaplar[kitapIndex] = eklenecekKitap;
				kitapSayisi++;
				kitapIndex++;
				System.out.println(eklenecekKitap.getAd()+" adlı kitap ilk defa eklendi!");
			}
			return true;
		}
		else{
			//Yeni kitap kapasiteden dolayı eklenemedi.
			System.out.println("Kütüphane dolu, yeni kitap eklenemiyor!");
			return false;
		}
	}
	/*
	@param eklenecekKitap
	@return aradığımız ISBN'li kitap dizide bulunuyorsa bulunduğu index değeri geri dönecek, aradığımız ISBN dizide
	bulunamazsa -1 dönecek.
	* */
	public int kitapBul(Kitap eklenecekKitap) {
		for (int i = 0; i< kitapIndex; i++){
			if (kitaplar[i].getISBN().equals(eklenecekKitap.getISBN())){
				return i;
			}
		}
		return -1;
	}
	//KitaplariListele
	public void kitaplariListele(){
		System.out.println("----------------Kutuphane Listesi--------------------");
		if (kitapIndex == 0){
			System.out.println("Kütüphane Boş");
		}
		else{
			for (int i = 0; i < kitapIndex; i++){
				System.out.println(kitaplar[i]);
			}
		}
		System.out.println("----------------------------------------------------------------");
	}
	//uyeEkle
	public  void uyeEkle(Uye eklenecekUye){
		if (uyeSayisi < UYE_KAPASITE){
			//Uye eklencek
			if (uyeMi(eklenecekUye)){
				System.out.println(eklenecekUye.getAd()+" adlı kişi daha önce bu TC ile üye olduğu için kayıt " +
						                   "edilemiyor");
			}
			else {
				uyeler[uyeSayisi] = eklenecekUye;
				uyeSayisi++;
				System.out.println(eklenecekUye.getAd()+" adlı başarıyla eklendi.");
			}
		}
		else{
			System.out.println("Kütüphane üyelikleri dolu! Yeni uye eklenemiyor!");
		}
	}
	public boolean uyeMi(Uye eklenecekUye){
		for (int i = 0; i < uyeSayisi; i++){
			if (uyeler[i].getTc().equals(eklenecekUye.getTc())){
				return true;
			}
		}
		return false;
	}
	//UyeListele
	public void uyeListele(){
		System.out.println("---------------- Uye Listesi--------------------");
		if (uyeSayisi == 0){
			System.out.println("Uye Bulunmamaktadır!");
		}
		else{
			
			for (int i = 0; i < uyeSayisi; i++){
				System.out.println(uyeler[i]);
			}
		}
		System.out.println("----------------------------------------------------------------");
	}
	//OduncVer: Kitap,Uye
	//ISBN numarasında kitabı bulmalıyız. Varsa indexini dönmeliyiz. kitapBul(String ISBN)
	//TC numarasında üyeyi bulmalıyız. Varsa indexini dönmeliyiz. uyeBul(String tcNo)
	//Kitap adeti 0'dan büyük mü?
	//üyenin oduncAldigiKitapSayisi 2'den küçük mü?
	//odunc kapasitesi uygun mu ?
	//-- eğer uygunsa;
		// odunc nesnesi iligili bilgilerle oluşturulacak ve diziye kaydedilecek.
		//odunc sayisi 1 artırılacak, odunc verilen kitabın adedi 1 azaltılacak.
		//odunc alan uyenin oduncAldığı kitap sayısı 1 artırılacak.
	public void oduncVer(String ISBN, String tcNo){
		int bulunanKitapIndex = kitapBul(ISBN);
		int bulunanUyeIndex = uyeBul(tcNo);
		if (bulunanUyeIndex == -1 ||bulunanKitapIndex == -1){
			System.out.println("Kitap veya üye bulunamadı!");
			return;
		}
		//System.out.println(bulunanKitapIndex+ " "+ bulunanUyeIndex);
		Kitap oduncVerilecekKitap = kitaplar[bulunanKitapIndex];
		Uye oduncAlacakUye = uyeler[bulunanUyeIndex];
		
		if (oduncVerilecekKitap.getAdet() <=0){
			System.out.println("Bu kitap mevcut değil. Ödünç verilemez.");
			return;
		}
		if (oduncAlacakUye.getOduncAldigiKitapSayisi() >=2){
			System.out.println(oduncAlacakUye.getAd()+" 2 tane kitap ödünç almış. Daha fazla ödünç kitap alamaz!");
			return;
		}
		if (oduncSayisi >= ODUNC_KAPASITE){
			System.out.println("Ödünç listesi dolu!");
			return;
		}
		Odunc yeniOdunc = new Odunc(oduncVerilecekKitap, LocalDate.now().toString(), oduncAlacakUye);
		oduncListesi[oduncSayisi] = yeniOdunc;
		oduncSayisi++;
		oduncVerilecekKitap.setAdet(oduncVerilecekKitap.getAdet()-1);
		oduncAlacakUye.setOduncAldigiKitapSayisi(oduncAlacakUye.getOduncAldigiKitapSayisi()+1);
		System.out.println(oduncAlacakUye.getAd()+" adlı üyeye "
		+ oduncVerilecekKitap.getAd() + " adlı kitap ödünç verildi.");
		
		System.out.println("Üyenin odunc aldığı kitap sayisi: "+ oduncAlacakUye.getOduncAldigiKitapSayisi());
		System.out.println("Kalan kitap adedi: "+ oduncVerilecekKitap.getAdet());
	}
	public int kitapBul(String ISBN){
		for (int i = 0; i<kitapIndex; i++){
			if (kitaplar[i].getISBN().equals(ISBN)){
				return i;
			}
		}
		return -1; // kitap dizide bulunmazsa -1 döner.
	}
	public int uyeBul(String tcNo){
		for (int i = 0; i < uyeSayisi; i++){
			if (uyeler[i].getTc().equals(tcNo)) {
				return i;
			}
		}
		return -1;// uye dizide bulunmazsa -1 döner.
	}
	
	//oduncListele
	public void oduncListele() {
		System.out.println("----------------Odunc Listesi--------------------");
		if (oduncSayisi == 0) {
			System.out.println("Uye Bulunmamaktadır!");
		}
		else {
			for (int i = 0; i < oduncSayisi; i++) {
				System.out.println(oduncListesi[i]);
			}
		}
		System.out.println("----------------------------------------------------------------");
	}
	
	//teslimAl
	public void teslimAl(int oduncNo) {
		if (oduncNo <= 0 || oduncNo > oduncSayisi || oduncListesi[oduncNo - 1] == null) {
			System.out.println("Ödünç no geçersiz");
			return;
		}
		Odunc odunc = oduncListesi[oduncNo - 1];
		
		if (odunc.getTeslimTarihi() != null) {
			System.out.println("Bu kitap zaten teslim alınmış. İşleme devam edilemiyor!");
			return;
		}
		//Teslim tarihi set etme
		LocalDate teslimTarihi = LocalDate.now();
		odunc.setTeslimTarihi(teslimTarihi.toString());
		
		//Teslim edilen kitabın adedini arttır.
		Kitap teslimEdilenKitap = odunc.getKitap();
		teslimEdilenKitap.setAdet(teslimEdilenKitap.getAdet() + 1);
		
		//Üyenin odunc aldığı kitap sayısını bir azalt
		Uye kitapTeslimEdenUye = odunc.getUye();
		kitapTeslimEdenUye.setOduncAldigiKitapSayisi(kitapTeslimEdenUye.getOduncAldigiKitapSayisi() - 1);
		
		//Kitabın üyede kalma süresi:
		LocalDate oduncAlmaTarihi = LocalDate.parse(odunc.getOduncAlmaTarihi());
		long uyedeKalmaSuresi = ChronoUnit.DAYS.between(oduncAlmaTarihi, teslimTarihi);
		
		//üye puanlama sistemi
		if (uyedeKalmaSuresi > ODUNC_SURESI) {
			long gecikmeSuresi = uyedeKalmaSuresi - ODUNC_SURESI;
			int dusurelecekPuan = (int) (gecikmeSuresi * PUAN_CEZASI);
			kitapTeslimEdenUye.setPuan(kitapTeslimEdenUye.getPuan() - dusurelecekPuan);
			System.out.println("TESLİM SURESİ: " + gecikmeSuresi + " GÜN GECİKMİŞTİR. ÜYEDEN " + dusurelecekPuan + " " +
					                   "PUAN " + "DÜŞMÜŞTÜR. UYENİN YENİ PUANI: " + kitapTeslimEdenUye.getPuan());
		}
		System.out.println("Teslim eden: " + kitapTeslimEdenUye.getAd() + " Teslim edilen kitap: " + teslimEdilenKitap.getAd());
		//Eğer üye normal tarihinde teslim ederse, 1 puan artırabiliriz.
		//toplam puan 150 olursa teslim süresi 2 katına çıkarılabilir.
		//toplam puan 200 olursa alabileceği kitap sayısı 2 katına çıkar.
	}
	
	//kitapSil
	// 1.stokta 2 kitap varken 1 tanesi ödünçte ise o silinebilir. Fakat 1 ise ödünç listesinde olan kitap silinemez
	// 2. eğer kitap stok adedi 1'den fazla ise hem stok hemde adet bilgisi 1 azalmalı
	// 3. eğer kitap stok adedi 1 tane ise kiitabı array'den silemeyiz.
	public void kitapSil(String ISBN) {
		int silinecekKitapIndex = kitapBul(ISBN);
		if (silinecekKitapIndex == -1) {
			System.out.println("Geçersiz ISBN numarası! Kitap yok!");
			return;
		}
		
		Kitap silecekKitap = kitaplar[silinecekKitapIndex];
		
		if (silecekKitap.getAdet() == 0) {
			System.out.println("Ödünç verilen kitap silinemez");
			return;
		}
		if (silecekKitap.getStok() == 1){
			if (silinecekKitapIndex == kitapIndex-1){
				System.out.println(silecekKitap.getAd()+" adlı kitap silindi!");
				kitaplar[kitapSayisi-1] = null;
				kitapSayisi--;
				kitapIndex--;
				return;
			}
			for (int i = silinecekKitapIndex; i<kitapIndex; i++){
				kitaplar[i] = kitaplar[i+1];
			}
			kitaplar[kitapIndex-1] = null;
			kitapSayisi--;
			kitapIndex--;
			System.out.println(silecekKitap.getAd()+" adlı kitap silindi!");
			return;
		}
		if (silecekKitap.getStok()> 1){
			silecekKitap.setStok(silecekKitap.getStok()-1);
			silecekKitap.setAdet(silecekKitap.getAdet()-1);
			System.out.println(silecekKitap.getAd()+ " isimli kitap adedi 1 azaltıldı.");
		}
		
	}
	//uyeSil()
	// ilk önce girilen tcno uye arrayinde var mı ?
	// Yoksa : tc no yanılış yada uye yok; Varsa: uyenin bilgilerini getir.
	//-> uye üzerinde kitap var mı?
	// Varsa: üye silinemez; Yoksa : üye silinebilir?
	public void uyeSil(String tcNo){
		boolean silindiMi = false;
		int silinecekUyeIndex = uyeBul(tcNo);
		if (silinecekUyeIndex == -1){
			System.out.println("Böyle bir üye kayıtlı değildir!");
			return;
		}
		Uye silinecekUye = uyeler[silinecekUyeIndex]; // odunc varsa o kitabı bul!
		int oduncSayisi = silinecekUye.getOduncAldigiKitapSayisi();
		if (oduncSayisi > 0){
			System.out.println("Üyede kitap var teslim alınamadan silinemez!");
			//TODO:(Belki) Hangi kitap o üyede onun mesajını ver.
			return;
		}
		if(silinecekUyeIndex == uyeSayisi-1){
			uyeler[uyeSayisi-1] = null;
			uyeSayisi--;
			silindiMi = true;
			return;
		}
		for (int i = silinecekUyeIndex; i < uyeSayisi; i++){
			uyeler[i] = uyeler[i+1];
		}
		uyeler[uyeSayisi-1] = null;
		uyeSayisi--;
		silindiMi = true;
		if (silindiMi){
			System.out.println(silinecekUye.getAd()+" adlı üye sistemden silinmiştir!"); // çalışmıyorsa başa al.
		}
	}
	//kitapAra(kitapAdı) geriye Kitap[] dönsün
	//kitabı adı var mı ?  Yoksa : kitap adı yanlış girildi veya kitap yok!
	//Varsa: kitap indexini ver ve kitap indexi ile kitap bilgilerini yazdır.
	//TODO: (opsiyonel): kitap odunc verildiyse kimde olduğunu yazsın!
	public Kitap kitapAra(String kitapAdi){
		boolean kitapVarMi = false;
		int bulunanKitapIndex = -1;
		for (int i = 0; i <kitapIndex; i++){
			if (kitapAdi.equalsIgnoreCase(kitaplar[i].getAd())){
				kitapVarMi = true;
				bulunanKitapIndex = i;
				break;
			}
		}
		if (kitapVarMi){
			Kitap bulunanKitap = kitaplar[bulunanKitapIndex];
			System.out.println(bulunanKitap);
			return  bulunanKitap;
		}
		System.out.println("Aradığınız kitap yok yada bulunamadı!");
		return null;
	}
	//	uyeAra(uyeAD, uyeSoyad) geriye Uye[]
	// TODO: (Opsiyonel)-> kütüphane kartı sistemi oluşturup kart numarasından da uye ara.
	// UyeAra(uyeAd) -> üye adı varsa üyeyi dön!
	// UyeAra(uyeAd, uyeSoyad) -> üye adı ve soyadı varsa o üyeyi getir.
	public void uyeAra(String uyeAdi){
		boolean uyeVarMi = false;
		for (int i = 0; i < uyeSayisi; i++){
			if (uyeAdi.equalsIgnoreCase(uyeler[i].getAd())){
				System.out.println(uyeler[i]);
				uyeVarMi = true;
			}
		}
		if (!uyeVarMi){
			System.out.println("Uye ismi yanlış yada yok!");
		}
	}
	public Uye uyeAra(String uyeAdi, String uyeSoyadi){
		int[] uyeIndexleri = uyeIsimIndexGetir(uyeAdi);
		if (uyeIndexleri == null){
			return null;
		}
		for (int uyeIndex: uyeIndexleri){
			if (uyeSoyadi.equalsIgnoreCase(uyeler[uyeIndex].getSoyAd())){
				System.out.println(uyeler[uyeIndex]);
				return uyeler[uyeIndex];
			}
		}
		System.out.println("Böyle bir kullanıcı bulunamadı! İsim yada soyisim yanlış!");
		return null;
		
	}
	public int[] uyeIsimIndexGetir(String uyeAdi){
		int counter = 0;
		boolean uyeVarMi = false;
		for (int i = 0; i < uyeSayisi; i++){
			if (uyeAdi.equalsIgnoreCase(uyeler[i].getAd())){
				counter++;
				uyeVarMi = true;
			}
		}
		if (!uyeVarMi){
			System.out.println("Uye ismi yanlış yada yok!");
			return null;
		}
		int [] uyeIndexleri = new int[counter];
		counter = 0;
		for (int i = 0; i < uyeSayisi; i++){
			if (uyeAdi.equalsIgnoreCase(uyeler[i].getAd())){
				uyeIndexleri[counter] = i;
				counter++;
			}
		}
		return uyeIndexleri;
	}
	//uyeninOduncAldığıTümKitaplar(isim, soyisim);
	//uyeAra(isim, soyisim)->'den gelen kullanıcıları al.
	//bu kullanıcıyı odunc arrayi içerisinde ara.
	//kullanıcı bu array'de Yoksa: Bu kullanıcı kitap odunc almadı!
	//Varsa: bu kullanıcıların eşleştiği odunc listesinden kitap adlarını ve tarihleri ile listele
	public void uyeninOduncAldigiTumKitaplar(String isim, String soyIsim){
		Uye arananUye = uyeAra(isim, soyIsim);
		if (arananUye == null){
			System.out.println("Böyle bir kullanıcı yok!");
			return;
		}
		String arananUyeTC = arananUye.getTc();
		
		int[]oduncIndexleri = uyeninOduncAldigiTumKitaplarIndex(arananUyeTC);
		if (oduncIndexleri == null){
			System.out.println(arananUye.getAd()+" isimli uye daha önce hiç oduc kitap almadı!");
			return;
		}
		
		System.out.println(arananUye.getAd()+ " isimli üye toplam " + oduncIndexleri.length + " adet kitap ödünç " +
				                   "almıştır.");
		System.out.println("Odunc aldığı kitaplar: ");
		int counter = 1;
		for(int oduncIndex : oduncIndexleri){
			System.out.println(counter +"."+oduncListesi[oduncIndex].getKitap().getAd());
			counter++;
		}
		
	}
	public int[] uyeninOduncAldigiTumKitaplarIndex(String tcNo){
		int counter = 0;
		for (int i = 0; i < oduncSayisi; i++){
			if (tcNo.equals(oduncListesi[i].getUye().getTc())){
				counter++;
			}
		}
		if(counter == 0){
			return null;
		}
		int[] oduncIndexleri = new int[counter];
		counter = 0;
		for (int i = 0; i < oduncSayisi; i++){
			if (tcNo.equals(oduncListesi[i].getUye().getTc())){
				oduncIndexleri[counter] = i;
				counter++;
			}
		}
		return oduncIndexleri;
	}
	//uyedekiKitaplar()
	// once uyeyi bulucaz uye varsa: uyenin odunc aldığı kitap sayısına bakıcaz.
	//odunc aldığı kitap sayısı 0 ise uyede kitap yok.
	//0 değilse uyedeki kitapların isimlerini bu ve yazdır.
	public void uyedekiKitaplar(String tcNo){
		int arananUyeIndex = uyeBul(tcNo);
		if ( arananUyeIndex == -1){
			System.out.println("Böyle bir kullanıcı yok!");
			return;
		}
		int[] uyeninOduncIndexleri = uyeninOduncAldigiTumKitaplarIndex(tcNo);
		if (uyeninOduncIndexleri == null){
			System.out.println("Bu üye daha önce kitap ödünç almadı!");
			return;
		}
		if (uyeler[arananUyeIndex].getOduncAldigiKitapSayisi() == 0){
			System.out.println("Üye ödünç aldığı tüm kitapları teslim etmiştir.");
			return;
		}
		String kitapAdi;
		System.out.println(uyeler[arananUyeIndex].getAd()+" adlı üyede olan kitaplar:");
		for (int uyeOduncIndex: uyeninOduncIndexleri){
			if (oduncListesi[uyeOduncIndex].getTeslimTarihi() == null){
				kitapAdi = oduncListesi[uyeOduncIndex].getKitap().getAd();
				System.out.println("-"+ kitapAdi);
			}
		}
		
	}


//Metodlar:
	/*
	.
	
	uyeAra(uyeAD, uyeSoyad) geriye Uye[] -> kütüphane kartı
	 ,
	uyedekiKitaplar, uyeninOduncAldığıTümKitaplar
	 */
}