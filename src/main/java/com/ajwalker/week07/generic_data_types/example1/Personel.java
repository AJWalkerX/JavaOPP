package com.ajwalker.week07.generic_data_types.example1;
//E(element), K(key), V(value), T(type)
public class Personel<ADTUR,TARIHTUR> {
	ADTUR ad;
	TARIHTUR dTarihi;
	
	@Override
	public String toString() {
		return "Personel{" + "ad=" + ad + ", dTarihi=" + dTarihi + '}';
	}
}