package com.progrank.decorator;

public class MountainBike extends Bike {

	public MountainBike(String name) {
		super(name);
		setPrice(500000);
	}
	
	@Override
	protected void showDetails() {
		System.out.println("Cost of "+getName()+" "+getPrice());
	}

}
