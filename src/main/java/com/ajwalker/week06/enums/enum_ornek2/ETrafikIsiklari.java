package com.ajwalker.week06.enums.enum_ornek2;

public enum ETrafikIsiklari {
	KIRMIZI("DUR"),
	SARI("HAZIRLAN"),
	YESIL("GEÇ");
	
	private String durum;
	
	ETrafikIsiklari(String durum) {
		this.durum = durum;
	}
	
	public String getDurum() {
		return durum;
	}
}