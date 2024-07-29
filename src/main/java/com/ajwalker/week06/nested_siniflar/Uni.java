package com.ajwalker.week06.nested_siniflar;

import java.util.ArrayList;

/*
* Nested class: iç içe yerleştirilmiş sınıflardır.
* İç sınıftan direkt olarak nesne oluşturulamaz.
* İç sınıftan nesne oluşturmak için öncelikle dış sınıf adı sonra iç sınıf adı yazılmalıdır.
* */

public class Uni {
	private String ad;
	private ArrayList<Ogrenci> ogrenciler;
	
	public Uni(String ad) {
		this.ad = ad;
	}
	
	public void ogrenciListele(){
		for (Ogrenci ogrenci : ogrenciler){
			System.out.println(ogrenci);
		}
	}
	
	public class Ogrenci{
		private String ad;
		private Integer ogrNo;
		
		public Ogrenci(String ad, Integer ogrNo) {
			this.ad = ad;
			this.ogrNo = ogrNo;
			ogrenciler.add(this);
		}
		
		@Override
		public String toString() {
			return "Ogrenci{" + "ad='" + ad + '\'' + ", ogrNo=" + ogrNo + '}';
		}
	}
}