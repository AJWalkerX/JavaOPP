package com.ajwalker.week04.kupuhane;

import java.util.Arrays;

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
	//Nesne değişkenleri
	private Uye[] uyeler;
	private Odunc[] oduncListesi;

	private int kitapSayisi;
	private int oduncSayisi;
	private int oduncSuresi;
	private int gecikmePuan;
	
	//Constructor
	
	public Kutuphane() {
	}
	
	public Kutuphane(int gecikmePuan, int kitapSayisi, int oduncSayisi, int oduncSuresi, Odunc[] oduncListesi, Uye[] uyeler) {
		this.gecikmePuan = gecikmePuan;
		this.kitapSayisi = kitapSayisi;
		this.oduncSayisi = oduncSayisi;
		this.oduncSuresi = oduncSuresi;
		this.oduncListesi = oduncListesi;
		this.uyeler = uyeler;
	}
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
		return "Kutuphane{" + "gecikmePuan=" + getGecikmePuan() + ", uyeler=" + Arrays.toString(getUyeler()) + ", oduncListesi=" + Arrays.toString(getOduncListesi()) + ", kitapSayisi=" + getKitapSayisi() + ", oduncSayisi=" + getOduncSayisi() + ", oduncSuresi=" + getOduncSuresi() + '}';
	}
}