package com.ajwalker.week05.abstract_class.entities;

import com.ajwalker.week05.abstract_class.services.Personel;

public class Hizmetli extends Personel {
	String gorevAlani;
	
	public Hizmetli(String ad) {
		super(ad);
	}
	
	@Override
	public void zamIste() {
	
	}
}