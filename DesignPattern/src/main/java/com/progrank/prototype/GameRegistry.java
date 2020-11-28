package com.progrank.prototype;

import java.util.HashMap;
import java.util.Map;

public class GameRegistry {

	private Map<GameType, Game> games = new HashMap<GameType, Game>();
	
	public GameRegistry(){
		this.initialize();
	}

	public Game getGame(GameType type) {
		try {
		return (Game) games.get(type).clone();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private void initialize() {
		//fetch data from database
		
		Ludo ludo = new Ludo();
		ludo.setName("LUDO");
		
		Pubg pubg = new Pubg();
		pubg.setName("PUGB");
		
		games.put(GameType.LUDO, ludo);
		games.put(GameType.PUBG, pubg);
		
	}
}
