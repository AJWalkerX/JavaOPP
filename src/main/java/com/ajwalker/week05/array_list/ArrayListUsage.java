package com.ajwalker.week05.array_list;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListUsage {
	public static void main(String[] args) {
		//Elaman ekleme
		ArrayList arrayList =new ArrayList();
		arrayList.add(1);
		arrayList.add(true);
		arrayList.add(null);
		arrayList.add('!');
//		System.out.println(arrayList);
		
		for (int i = 0; i < arrayList.size(); i++){
//			System.out.println(i + ". eleman= "+ arrayList.get(i));
		}
		
		//index ile eleman ekleme
		arrayList.add(1, "İstanbul");
//		System.out.println(arrayList);
		
		//eleman silme
		arrayList.remove(3);
		System.out.println(arrayList);
		
		//Sadece integer tipte vveri kabul edicektir.
		ArrayList<Integer> sayilar = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++){
			sayilar.add(rand.nextInt(0,10));
		}
//		System.out.println(sayilar);
	}
}