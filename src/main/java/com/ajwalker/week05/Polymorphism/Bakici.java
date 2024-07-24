package com.ajwalker.week05.Polymorphism;

public class Bakici {
	public void hayvanKonustur(Hayvan hayvan, int konusmaSayisi){
		System.out.println("----- hayvan konuşturuldu. ----");
		for (int i = 0; i<konusmaSayisi; i++){
			hayvan.sesCikar();
		}
	}
}