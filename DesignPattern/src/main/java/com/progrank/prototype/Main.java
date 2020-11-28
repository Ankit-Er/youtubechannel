package com.progrank.prototype;


public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		GameRegistry reg = new GameRegistry();
		Ludo ludo = (Ludo)reg.getGame(GameType.LUDO);
		System.out.println(ludo);
		ludo.setName("XYZ");
		
		Ludo ludo2 = (Ludo)reg.getGame(GameType.LUDO);
		System.out.println(ludo2);
		
		System.out.println("=====================");
		System.out.println(ludo);
		System.out.println(ludo2);
		
		
	}

}
