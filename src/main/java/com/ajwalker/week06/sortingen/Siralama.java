package com.ajwalker.week06.sortingen;

import java.util.Arrays;

public class Siralama {
	public static void main(String[] args) {
		int[] sayilar = {5,2,3,1,10,7};
//		Arrays.sort(sayilar);
		
		//AnonymousInnerClass
		ISortAlgo bubble= new ISortAlgo() {
			@Override
			public void sort(int[] array) {
				int uzunluk = array.length;
				for (int i = 0; i<uzunluk-1; i++){
					for (int j = 0; j<uzunluk-1-i; j++){
						if (array[j]>array[j+1]){
							int temp =array[j];
							array[j] = array[j+1];
							array[j+1] = temp;
						}
					}
					System.out.println(Arrays.toString(array));
				}
				
			}
		};
		
		bubble.sort(sayilar);
		
		
	}
}