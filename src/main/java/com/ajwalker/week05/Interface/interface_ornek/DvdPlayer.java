package com.ajwalker.week05.Interface.interface_ornek;

public class DvdPlayer implements Player{
	@Override
	public void play() {
		System.out.println("DVD playing");
	}
	
	@Override
	public void stop() {
		System.out.println("DVD stopped");
		
	}
	
	@Override
	public void pause() {
		System.out.println("DVD paused");
		
	}
}