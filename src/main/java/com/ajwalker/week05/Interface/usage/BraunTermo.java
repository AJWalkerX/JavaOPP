package com.ajwalker.week05.Interface.usage;

public class BraunTermo implements ITermometre,INemOlcer,IHavaKalitesi,ITarih{
	@Override
	public int havaKalitesi() {
		return 90;
	}
	
	@Override
	public int sicaklikOlc() {
		return 23;
	}
	
	@Override
	public double nemOlc() {
		return 0;
	}
	
	@Override
	public String tarihGoster() {
		return "25.07.2024";
	}
	
	@Override
	public String saatGoster() {
		return "09:32";
	}
}