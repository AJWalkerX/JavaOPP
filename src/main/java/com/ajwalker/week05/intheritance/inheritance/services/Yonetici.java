package com.ajwalker.week05.intheritance.inheritance.services;

public class Yonetici extends Personel { // Personelin özelliklerine erişebilir.
	/*public static void main(String[] args) {
		Personel personel1=new Personel("Zafer");
		personel1.personelProtectedMetod();
	}*/
	
	public String yoneticiOzelligi;
	
	public Yonetici(String ad) {
		super(ad);
	}
	
	public void yoneticiMetodu() {
		System.out.println("Yönetici metodu çalıştı.");
	}
	
	//@Override
	public String getInfo() {
		System.out.println("Yonetici getInfo metodu çalıştı.");
		return "Yonetici{" + "yoneticiOzelligi='" + yoneticiOzelligi;
	}
	
}