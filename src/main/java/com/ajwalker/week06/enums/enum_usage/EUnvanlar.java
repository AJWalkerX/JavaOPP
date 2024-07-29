package com.ajwalker.week06.enums.enum_usage;
/*
* Berlirli tipten, belirli sayıda ve sırada nesneyi tutan yapı.
* Buradaki tüm alanlar public static ve final'dır.
* İçindeki nesne değişkenleri private olmalidır.
* enumlarda extends ile kalıtım alınamaz.
* enumlarda implements ile interface kullanılabilir.
*/
public enum EUnvanlar {
	MUHENDIS("Mühendis",1),
	MUHASEBECI("Muhasebeci",2),
	HIZMETLI("Hizmetli",3),
	MUDUR("Müdür",4);
	
	private String adi;
	private int no;
	
	EUnvanlar(String adi, int no) {
		this.adi = adi;
		this.no = no;
	}
	
	public String getAdi() {
		return adi;
	}
	
	public int getNo() {
		return no;
	}
}