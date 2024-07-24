package com.ajwalker.week05.Polymorphism;

public class RunnerBakici {
	public static void main(String[] args) {
		Kedi tekir =new Kedi("Tekir", 60,4);
		
		Kopek karaBas = new Kopek("Karabaş", 100, 10);
		Kus boncuk = new Kus("boncuk", 1,1);
		
		Bakici bakici = new Bakici();
		bakici.hayvanKonustur(tekir, 3);
		bakici.hayvanKonustur(karaBas, 5);
		bakici.hayvanKonustur(boncuk, 2);
	}
}