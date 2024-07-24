package com.ajwalker.week05.abstract_class.entities;

import com.ajwalker.week05.abstract_class.services.Yonetici;

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
	public void zamIste() {
		System.out.println("Mudur çok zam hak ediyor..");
	}
	
}