package com.ajwalker.week05.intheritance.inheritance.services;

//Sınıfı final olarak tanımlarsanız o sınıftan miras alınmasını engellersiniz.
//public final class Personel{...}
public class Personel {
	public String ad;
	public String tel;
	public String tc;
	public String ceptel;
	public int yas;
	
	private int maas = 17002;
	private int maasKaySayisi = 1;
	
	// metodlar final kullanırsanız alt sınıflarda o metod override edilemez. Tekrar yazılamaz.
	//	public final int getMaasKaySayisi() {
	public int getMaasKaySayisi() {
		return maasKaySayisi;
	}
	
	public void setMaasKaySayisi(int maasKaySayisi) {
		this.maasKaySayisi = maasKaySayisi;
	}
	
	public int getMaas() {
		return maas;
	}
	
	public void setMaas(int maas) {
		this.maas = maas;
	}
	
	public Personel(String ad) {
		this.ad = ad;
		System.out.println("Personel sınıfı 1 parametreli constructor çalıştı."+ad);
	}
	
	public Personel(String ad, String ceptel, int maasKaySayisi) {
		this.ad = ad;
		this.ceptel = ceptel;
		this.maasKaySayisi = maasKaySayisi;
	}
	
	public String getInfo() {
		System.out.println("Personel getInfo metodu çalıştı.");
		return "Personel{" + "ad='" + ad + '\'' + ", tel='" + tel + '\'' + ", tc='" + tc + '\'' + ", ceptel='" + ceptel + '\'' + ", yas=" + yas + ", maasKaySayisi=" + maasKaySayisi + '}';
	}
	
	public void zamIste() {
		System.out.println("ZAM ZAM ZAM");
	}
	
	public void calis() {
		System.out.println("Çalışıyor...");
	}
	
	protected String personelProtectedMetod() {
		return "PersonelProtectedMetod";
	}
}