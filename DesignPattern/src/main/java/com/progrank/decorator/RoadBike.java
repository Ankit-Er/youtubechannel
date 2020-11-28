package com.progrank.decorator;

public class RoadBike extends Bike {

	public RoadBike(String name) {
		super(name);
		setPrice(500000);
	}
	
	@Override
	protected void showDetails() {
		System.out.println("Cost of "+getName()+" "+getPrice());
	}

}
