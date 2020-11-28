package com.progrank.decorator;

public class Test {
	
	/*
	 * Decorator pattern allows a user to add new functionality to an existing
	 * object without altering its structure.
	 * 
	 * This type of design pattern comes under structural pattern
	 * 
	 */
	
	
	public static void main(String[] args) {
		//RoadBike bike = new RoadBike("Hero");
		Bike bike = new EletricDecorator
				(new AlarmDecorator(new RoadBike("Hero")));
		bike.showDetails();
	}

}
