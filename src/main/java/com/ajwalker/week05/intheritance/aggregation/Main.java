package com.ajwalker.week05.intheritance.aggregation;

public class Main {
	public static void main(String[] args) {
		Motor motor = new Motor("Benzinli");
		Araba araba = new Araba("BMW", motor);
		
		araba.arabaBilgisi();
	}
}