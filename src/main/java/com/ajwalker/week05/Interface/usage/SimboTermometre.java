package com.ajwalker.week05.Interface.usage;

public class SimboTermometre implements ITermometre,INemOlcer{
	@Override
	public double nemOlc() {
		return 60.20;
	}
	
	@Override
	public int sicaklikOlc() {
		return 26;
	}
	
	//Bu sınıfta başka methodlar da olabilir...
	
}