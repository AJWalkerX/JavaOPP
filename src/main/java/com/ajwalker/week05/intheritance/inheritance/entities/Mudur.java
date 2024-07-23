package com.ajwalker.week05.intheritance.inheritance.entities;

import com.ajwalker.week05.intheritance.inheritance.services.Yonetici;
//Yonetici Perosonel sınıfından miras aldığı için Mudur sınıfı Personelin özelliklerine de erişebilir.
public class Mudur extends Yonetici { // parent Yonetici -> parent of Yonetici is Personel
	// nesne değişkenleri:
	//nesne değişkenlerinin erişim belirleyicisi : default
	//default: aynı package içindeki classlardan erişim sağlanabilir.
	//farklı package içindeki classlardan erişilemez.
	public String mudurlukDerecesi;
	public String departman;
	//	public Mudur(){
//		super();// bu method üst sınıfın constructorını çalıştırır. -> olmasa da kendi kendini ekleyip çalıştırıyor.
//		System.out.println("müdür sınıfı boş constructer");
//	}
	public Mudur(String ad) {
		super(ad);
	}
	
	@Override
	public void calis() {
		System.out.println("Mudur gibi çalışıyor...");
	}
	
	@Override
	public int getMaasKaySayisi() {
		return 5;
	}
	
	public int getMaasKaySayisi(int deger){
		return deger;
	}

	/*public Mudur(String ad,String tel, String tc, String ceptel){
		this.ad = ad;
		this.tel = tel;
		this.tc = tc;
		this.ceptel = ceptel;
	}*/
	
}