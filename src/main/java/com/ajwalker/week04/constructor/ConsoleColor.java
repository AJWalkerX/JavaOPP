package com.ajwalker.week04.constructor;
/*
*Siyah: \u001B[30m
Kırmızı: \u001B[31m
Yeşil: \u001B[32m
Sarı: \u001B[33m
Mavi: \u001B[34m
Mor: \u001B[35m
Camgöbeği: \u001B[36m
Beyaz: \u001B[37m
Renk sıfırlamak için: \u001B[0m
 */
public class ConsoleColor {
	public static void main(String[] args) {
		System.out.println("Bu mesaj beyaz");
		System.out.println("\u001B[31mBu mesaj kırmızı renk");
		System.out.println("Bu da kırmızı");
		System.out.println("\u001B[0mBu artık beyaz");
	}
}