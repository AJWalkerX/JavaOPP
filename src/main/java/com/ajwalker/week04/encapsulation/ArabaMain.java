package com.ajwalker.week04.encapsulation;

import org.w3c.dom.ls.LSOutput;

public class ArabaMain {
	public static void main(String[] args) {
		Araba araba = new Araba();
		Motor motor1 = new Motor();
		
		motor1.setMotorHacmi(100);
		motor1.setBeygir(200);
		motor1.setTork(10);
		motor1.setSasiNo("DSAKa123");
		
		araba.setHiz(50);
		araba.setKm(100000);
		araba.setMarka("Hyundai");
		araba.setModel("ix35");
		araba.setRenk("Siyah");
		araba.setYil("2020");
		araba.setMotor(motor1);
		
		System.out.println(araba);
	}
}