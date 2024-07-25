package com.ajwalker.week05.Interface.usage;

public interface ITermometre {
//	Interface abstract methods cannot have body
	//Interfacelerde tüm methodlar abstract methoddur. abstract keyword olmasına gerek yok.
	//O yüzden metodların gövdesi olmaz
//	public int sicaklikOlc(){
//		return 5;
//	}
	
	//Serializable gibi içi boş olan interfacelere Marker Interface denir.

	int sicaklikOlc();
	
	// default keyword ile birlikte gövdeli metodlar yazılabilir.
	default int sicaklikOlcDerece(){
		return 60;
	}
	
	// static ile de gövdeli medolar yazılabilir.
	static String adiniYaz(){
		return "ad";
	}
	
	//sadece bu sınıf içerisinden erişilebilir.
	private int hesapla(int sayi){
		return sayi*2;
	}
	
	/*
	* 1 sınıf 1 sınıftan extend edilebilir.
	* 1 sınıf birden çok interfaceden imlemente edilebilir.
	* 1 interface 1 interfaceden extend edilir.
	* */
}