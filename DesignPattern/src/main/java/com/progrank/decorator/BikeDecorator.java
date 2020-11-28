package com.progrank.decorator;

public abstract class BikeDecorator extends Bike {
	
	protected Bike bike;
	
	public BikeDecorator(Bike bike) {
		this.bike = bike;
		setName(bike.getName() + " " + addNewFeatureName());
		setPrice(bike.getPrice() + addNewFeaturePrice());
				
	}
	
	@Override
	protected void showDetails() {
		bike.showDetails();
		System.out.println("Cost of "+getName()+" : "+getPrice());
	}
	
	protected abstract String addNewFeatureName();
	protected abstract int addNewFeaturePrice();
	
}
