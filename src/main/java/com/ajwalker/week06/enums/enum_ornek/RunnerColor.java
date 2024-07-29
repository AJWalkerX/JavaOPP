package com.ajwalker.week06.enums.enum_ornek;

public class RunnerColor {
	enum Color{
		RED,
		GREEN,
		BLUE;
		
	}
	public static void main(String[] args) {
		Color red = Color.RED;
		System.out.println(red);
		
		for(Color item: Color.values()){
			System.out.println(item);
		}

	}
}