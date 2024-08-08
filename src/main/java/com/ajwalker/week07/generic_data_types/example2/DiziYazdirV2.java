package com.ajwalker.week07.generic_data_types.example2;

import java.util.List;

public class DiziYazdirV2 {
	//Generic method
	/*
	* <T> : Tüm sınıfları kabul eder.
	* <T extends Hayvan> : Hayvan sınıfından miras alan tüm sınıfları kabul eder.
	* <T extends Hayvan&IHavlayabilir> : Hayvan sınıfından miras alan ve
	* IHavlayabilir interface'ini imlimente eden tüm sınıfları kabul eder.
	* */
	public <T extends  Hayvan&IHavlayabilir> void yazdir (T[] dizi){
		for (T t : dizi) {
			System.out.println(t);
		}
	}
	/*Wildcards:
	* <?> : Herhangi bir tip gelebilir
	* <? extends Number>: Number ve Number sınıfından extends alınan herhangi bir sınıf gelebilir. Integer,Double,Number
	* <? super Number>: Number ve number sınıfının üst sınıfları gelebilir. (Object ve Number)
	* */
	public  void  listeYazdir(List<?> list){
		for (Object item : list) {
			System.out.println(item);
		}
	}
	public  double  listeTopla(List<? extends Number> list){
		double sum= 0;
		for (Number item : list) {
			sum+=item.doubleValue();
		}
		return sum;
	}
}