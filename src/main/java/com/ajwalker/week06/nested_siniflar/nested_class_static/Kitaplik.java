package com.ajwalker.week06.nested_siniflar.nested_class_static;



import java.util.ArrayList;

public class Kitaplik {
	private String ad;
	private static ArrayList<Kitap> kitapArrayList;
	
	public Kitaplik(String ad) {
		this.ad = ad;
		kitapArrayList = new ArrayList<>();
	}
	
	public static ArrayList<Kitap> getKitapArrayList() {
		return kitapArrayList;
	}
	
	public static class Kitap{
		private String ad;
		private int price;
		
		public Kitap(String ad, int price) {
			this.ad = ad;
			this.price = price;
			kitapArrayList.add(this);
		}
		
		@Override
		public String toString() {
			return "Kitap{" + "ad='" + ad + '\'' + ", price=" + price + '}';
		}
	}
}