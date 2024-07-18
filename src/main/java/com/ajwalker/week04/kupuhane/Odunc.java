package com.ajwalker.week04.kupuhane;

/*
* Sınıf Adı: Odunc
oduncNo
uye
kitap
oduncAlmaTarihi
teslimTarihi*/
public class Odunc {
	private static int oduncIndex;
	
	//Nesne değişkenleri
	private int oduncNo;
	private Uye uye;
	private Kitap kitap;
	private String oduncAlmaTarihi;
	private String teslimTarihi;
	
	//Constructor
	
	public Odunc() {
	}
	
	public Odunc(Kitap kitap, String oduncAlmaTarihi, Uye uye) {
		this.kitap = kitap;
		this.oduncAlmaTarihi = oduncAlmaTarihi;
		this.oduncNo = ++oduncIndex;
		this.uye = uye;
	}
	//Getter & Setter
	
	public Kitap getKitap() {
		return kitap;
	}
	
	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}
	
	public String getOduncAlmaTarihi() {
		return oduncAlmaTarihi;
	}
	
	public void setOduncAlmaTarihi(String oduncAlmaTarihi) {
		this.oduncAlmaTarihi = oduncAlmaTarihi;
	}
	
	public int getOduncNo() {
		return oduncNo;
	}
	
	public void setOduncNo(int oduncNo) {
		this.oduncNo = oduncNo;
	}
	
	public String getTeslimTarihi() {
		return teslimTarihi;
	}
	
	public void setTeslimTarihi(String teslimTarihi) {
		this.teslimTarihi = teslimTarihi;
	}
	
	public Uye getUye() {
		return uye;
	}
	
	public void setUye(Uye uye) {
		this.uye = uye;
	}
	//ToString
	
	@Override
	public String toString() {
		return "Odunc{" + "kitap=" + getKitap() + ", oduncNo=" + getOduncNo() + ", uye=" + getUye() + ", oduncAlmaTarihi='" + getOduncAlmaTarihi() + '\'' + ", teslimTarihi='" + getTeslimTarihi() + '\'' + '}';
	}
}