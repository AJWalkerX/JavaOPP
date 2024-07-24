package com.ajwalker.week05.abstract_class.entities;

import com.ajwalker.week05.abstract_class.services.Personel;

public class Muhendis extends Personel {
	String uzmanlikAlani;
	String calismaSekli;
	
	
	public Muhendis(String ad) {
		super(ad);
	}
	
	@Override
	public void zamIste() {
		System.out.println("Muhendis zam istiyor...");
	}
	
	
}