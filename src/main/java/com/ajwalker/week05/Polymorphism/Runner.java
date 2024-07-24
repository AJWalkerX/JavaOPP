package com.ajwalker.week05.Polymorphism;

public class Runner {
	public static void main(String[] args) {
		Kedi tekir =new Kedi("Tekir", 60,4);
		tekir.sesCikar();
		
		Kopek karaBas = new Kopek("Karabaş", 100, 10);
		karaBas.sesCikar();
		
		Kus ciciKus = new Kus("Sarı", 10, 1);
		ciciKus.sesCikar();
		
		Hayvan h1 =new Kedi("Sarman", 60,4);
		h1.sesCikar();
		
		h1 = new Kopek ("Jolly", 110, 20);
		h1.sesCikar();
		
	}
}