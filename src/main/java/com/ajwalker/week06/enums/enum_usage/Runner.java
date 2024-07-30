package com.ajwalker.week06.enums.enum_usage;

public class Runner {
	public static void main(String[] args) {
		Personel p1 = new Personel("Engin", "İst", EUnvanlar.MUDUR);
		Personel p2 = new Personel("Serken", "İst", EUnvanlar.HIZMETLI);
		Personel p3 = new Personel("Eylül", "Ankara", EUnvanlar.MUHASEBECI);
		Personel p4 = new Personel("Su", "İzmir", EUnvanlar.MUHENDIS);
		
		System.out.println(EUnvanlar.MUDUR.getAdi());
		System.out.println(EUnvanlar.MUDUR.getNo());
	}
}