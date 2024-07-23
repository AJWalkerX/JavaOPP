package com.ajwalker.week05.intheritance.inheritance.entities;

import com.ajwalker.week05.intheritance.inheritance.services.Personel;

public class Muhendis extends Personel {
	String uzmanlikAlani;
	String calismaSekli;
	
	
	public Muhendis(String ad, String ceptel, int maasKaySayisi) {
		super(ad, ceptel, maasKaySayisi);
	}
	
	
	public int getMaasKaySayisi() {
		return 4;
	}
	
}