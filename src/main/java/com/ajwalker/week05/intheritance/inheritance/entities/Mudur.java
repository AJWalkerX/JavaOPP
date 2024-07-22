package com.ajwalker.week05.intheritance.inheritance.entities;

public class Mudur extends Personel{
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
	public Mudur(String ad){
		super(ad);
	}
	/*public Mudur(String ad,String tel, String tc, String ceptel){
		this.ad = ad;
		this.tel = tel;
		this.tc = tc;
		this.ceptel = ceptel;
	}*/
	
}