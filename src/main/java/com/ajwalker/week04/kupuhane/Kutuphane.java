package com.ajwalker.week04.kupuhane;

import java.time.Instant;
import java.util.Arrays;
import java.util.Locale;

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
	private Instant localDate;
	
	//Constructor
	
	public Kutuphane() {
		kitaplar = new Kitap[KITAP_KAPASITE];
		uyeler = new Uye[UYE_KAPASITE];
		oduncListesi = new Odunc[ODUNC_KAPASITE];
	}
	//kitapEkle
	public boolean kitapEkle(Kitap eklenecekKitap){
		if (kitapSayisi <KITAP_KAPASITE){
			int varOlanKitapIndex = kitapVarMi(eklenecekKitap);
			if (varOlanKitapIndex != -1){
				//Daha önceden eklenmiş bir kitap varsa;
				kitaplar[varOlanKitapIndex].setAdet(kitaplar[varOlanKitapIndex].getAdet()+1);
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
	public int kitapVarMi(Kitap eklenecekKitap){
		for (int i = 0; i< kitapIndex; i++){
			if (kitaplar[i].getISBN().equals(eklenecekKitap.getISBN())){
				return i;
			}
		}
		return -1;
	}
	//KitaplariListele
	public void kitaplariListele(){
		if (kitapIndex == 0){
			System.out.println("Kütüphane Boş");
		}
		else{
			System.out.println("----------------Kutuphane Listesi--------------------");
			for (int i = 0; i < kitapIndex; i++){
				System.out.println(kitaplar[i]);
			}
		}
		System.out.println("----------------------------------------------------------------");
	}
	//uyeEkle
	public  boolean uyeEkle(Uye eklenecekUye){
		if (uyeSayisi < UYE_KAPASITE){
			//Uye eklencek
			if (uyeMi(eklenecekUye)){
				System.out.println(eklenecekUye.getAd()+" adlı kişi daha önce bu TC ile üye olduğu için kayıt " +
						                   "edilemiyor");
				return false;
			}
			else {
				uyeler[uyeSayisi] = eklenecekUye;
				uyeSayisi++;
				System.out.println(eklenecekUye.getAd()+" adlı başarıyla eklendi.");
				return true;
			}
		}
		else{
			System.out.println("Kütüphane üyelikleri dolu! Yeni uye eklenemiyor!");
			return false;
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
		if (kitapIndex == 0){
			System.out.println("Uye Bulunmamaktadır!");
		}
		else{
			System.out.println("----------------Kutuphane Uye Listesi--------------------");
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
		Odunc yeniOdunc = new Odunc(oduncVerilecekKitap, localDate.now().toString(),oduncAlacakUye);
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
	
	/*Methodlar:
	* kitapSil, kitapAra(ISBN),
	*uyeSil, uyeAra(tcno)
	**/
	
	//Getter & Setter
	public int getGecikmePuan() {
		return gecikmePuan;
	}
	
	public void setGecikmePuan(int gecikmePuan) {
		this.gecikmePuan = gecikmePuan;
	}
	
	public int getKitapSayisi() {
		return kitapSayisi;
	}
	
	public void setKitapSayisi(int kitapSayisi) {
		this.kitapSayisi = kitapSayisi;
	}
	
	public Odunc[] getOduncListesi() {
		return oduncListesi;
	}
	
	public void setOduncListesi(Odunc[] oduncListesi) {
		this.oduncListesi = oduncListesi;
	}
	
	public Kitap[] getKitaplar() {
		return kitaplar;
	}
	
	public void setKitaplar(Kitap[] kitaplar) {
		this.kitaplar = kitaplar;
	}
	
	public int getOduncSayisi() {
		return oduncSayisi;
	}
	
	public void setOduncSayisi(int oduncSayisi) {
		this.oduncSayisi = oduncSayisi;
	}
	
	public int getOduncSuresi() {
		return oduncSuresi;
	}
	
	public void setOduncSuresi(int oduncSuresi) {
		this.oduncSuresi = oduncSuresi;
	}
	
	public Uye[] getUyeler() {
		return uyeler;
	}
	
	public void setUyeler(Uye[] uyeler) {
		this.uyeler = uyeler;
	}
	//toString
	
	
	@Override
	public String toString() {
		return "Kutuphane{" + "gecikmePuan=" + getGecikmePuan() + ", uyeler=" + Arrays.toString(getUyeler()) + ", " +
				"oduncListesi=" + Arrays.toString(getOduncListesi()) + ", kitaplar=" + Arrays.toString(getKitaplar()) + ", kitapSayisi=" + getKitapSayisi() + ", oduncSayisi=" + getOduncSayisi() + ", oduncSuresi=" + getOduncSuresi() + '}';
	}
}