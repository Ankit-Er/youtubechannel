package com.progrank.prototype;

public class Pubg extends Game{
	
	@Override
	public void playGame() {
		System.out.println("Play PUBG Game !");
		System.out.println("Multi-Players !");
	}

	@Override
	public String toString() {
		return "Pubg [name=" + name + "]";
	}
	
}
