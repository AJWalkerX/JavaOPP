package com.ajwalker.week07.generic_data_types.example2;

public class Kedi extends Hayvan {
	
	public Kedi(String ad, int boy, int kilo) {
		super(ad, boy, kilo);
	}
	
	@Override
	public void sesCikar() {
		System.out.println("miyav, iiiiiyavvv");
	}
	
	public void temizle(){
		System.out.println(getAd()+ " kendini temizliyor... şlup şlup");
	}
}