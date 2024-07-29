package com.ajwalker.week06.enums.enum_ornek3;

public enum EGun implements IHafta{
	PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI,PAZAR;
	
	@Override
	public int kacinciGun() {
		return ordinal()+1;
	}
}