package com.ajwalker;

import org.w3c.dom.ls.LSOutput;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(textBlock());
	}
	
	public static String textBlock(){
		return """
				Burada bir kaç bir şey yazıyor.
				"atasözü" yazıyor tırnak içersinde.
				burada bir escape mi var?\rd
				
				bir başka yazı \
				Bu da bir başka yazı ama aşağıda mı ?
				
				<html>
					<body>
						Merhaba websitesi :)
					</body>
				</>
				""";
	}
}