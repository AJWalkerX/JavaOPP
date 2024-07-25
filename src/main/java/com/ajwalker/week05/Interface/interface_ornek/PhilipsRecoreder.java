package com.ajwalker.week05.Interface.interface_ornek;

public class PhilipsRecoreder implements Recorder {
	@Override
	public void record() {
		System.out.println("Recording");
	}
	
	@Override
	public void play() {
		System.out.println("Recorder playing");
	}
	
	@Override
	public void stop() {
		System.out.println("Recorder stopped");
		
	}
	
	@Override
	public void pause() {
		System.out.println("Recorder paused");
		
	}
}