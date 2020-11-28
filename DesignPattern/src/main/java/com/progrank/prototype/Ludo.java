package com.progrank.prototype;

public class Ludo extends Game{
	@Override
	public void playGame() {
		System.out.println("Play Ludo Game !");
		System.out.println("Max 4-Players !");
	}

	@Override
	public String toString() {
		return "Ludo [name=" + name + "]";
	}
	
}
