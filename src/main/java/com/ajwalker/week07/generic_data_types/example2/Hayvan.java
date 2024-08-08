package com.ajwalker.week07.generic_data_types.example2;
// abstract sınıflarda nesne üretilemez.
// Miras alınması için kullanılan sınıflar için abtract kullanılabilir.
//abstract methodlar abstract sınıflar içinde olabilir. Abstract olmayan sınıflarda kullanılamaz.
//abstract sınıfı içerisinde hem abstract hem de abstract olmayan metodlar olabilir.
public abstract class Hayvan {
	private String ad;
	private int kilo;
	private int boy;
	
	public Hayvan(String ad, int boy, int kilo) {
		this.ad = ad;
		this.boy = boy;
		this.kilo = kilo;
	}
	// abstarct methodun gövdesi olmaz.
	//Alt sınıflar bu methodu oluşturmaya abstract ile zorlanabilir.
	public abstract void sesCikar();
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public int getBoy() {
		return boy;
	}
	
	public void setBoy(int boy) {
		this.boy = boy;
	}
	
	public int getKilo() {
		return kilo;
	}
	
	public void setKilo(int kilo) {
		this.kilo = kilo;
	}
	
	@Override
	public String toString() {
		return "Hayvan{" + "ad='" + getAd() + '\'' + ", kilo=" + getKilo() + ", boy=" + getBoy() + '}';
	}
}