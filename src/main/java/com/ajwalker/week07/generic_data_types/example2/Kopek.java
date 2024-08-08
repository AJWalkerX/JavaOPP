package com.ajwalker.week07.generic_data_types.example2;

public class Kopek extends Hayvan implements IHavlayabilir{
	
	public Kopek(String ad, int boy, int kilo) {
		super(ad, boy, kilo);
	}
	
	@Override
	public void sesCikar() {
	
	}

//	public void sesCikar() {
//		super.sesCikar();
//		System.out.println(getAd()+ " Hav lan hav!");
//	}
}