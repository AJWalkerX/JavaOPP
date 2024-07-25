package com.ajwalker.week05.Interface.interface_ornek;

public class CdPlayer implements Player{
	@Override
	public void play() {
		System.out.println("Cd player is playing");
	}
	
	@Override
	public void stop() {
		System.out.println("Cd player stopped");
	}
	
	@Override
	public void pause() {
		System.out.println("Cd player paused");
	}
}