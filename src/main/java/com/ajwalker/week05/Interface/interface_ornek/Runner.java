package com.ajwalker.week05.Interface.interface_ornek;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		PhilipsRecoreder philipsRecoreder = new PhilipsRecoreder();
//		philipsRecoreder.record();
//		philipsRecoreder.pause();
//		philipsRecoreder.play();
//		philipsRecoreder.stop();
		
		DvdPlayer dvdPlayer = new DvdPlayer();
//		dvdPlayer.pause();
//		dvdPlayer.stop();
//		dvdPlayer.play();
		
		CdPlayer cdPlayer = new CdPlayer();
//		cdPlayer.pause();
//		cdPlayer.stop();
//		cdPlayer.play();
		
		ArrayList<Player> player = new ArrayList<>();
		player.add(philipsRecoreder);
		player.add(dvdPlayer);
		player.add(cdPlayer);
		
		for (Player item: player){
			item.play();
		}
		for (Player item: player){
			item.stop();
		}
	}
}