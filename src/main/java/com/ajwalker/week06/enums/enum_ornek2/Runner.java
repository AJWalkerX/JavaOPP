package com.ajwalker.week06.enums.enum_ornek2;


public class Runner {
	public static void main(String[] args) {
		ETrafikIsiklari[] isiklar = ETrafikIsiklari.values();
		for (ETrafikIsiklari item : isiklar){
			System.out.println(item+" "+ item.getDurum());
		}
		System.out.println(ETrafikIsiklari.KIRMIZI.name().equals("KIRMIZI"));
		System.out.println(ETrafikIsiklari.SARI.name().equals("KIRMIZI"));
		System.out.println(ETrafikIsiklari.SARI.getDurum().equals("HAZIRLAN"));
	}
}