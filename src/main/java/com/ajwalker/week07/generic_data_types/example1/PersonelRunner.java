package com.ajwalker.week07.generic_data_types.example1;

import java.time.LocalDateTime;

public class PersonelRunner {
	public static void main(String[] args) {
		Personel<String,String> p1 = new Personel();
		p1.ad = "Berkay";
		p1.dTarihi = "105";
		
		System.out.println(p1);
		
		Personel<String, LocalDateTime> p2 = new Personel<>();
		p2.ad = "Erkan";
		p2.dTarihi = LocalDateTime.now();
		
		System.out.println(p2);
	}
}