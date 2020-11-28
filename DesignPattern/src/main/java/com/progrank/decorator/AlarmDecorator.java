package com.progrank.decorator;

public class AlarmDecorator extends BikeDecorator {
	
	protected Bike bike;
	
	public AlarmDecorator(Bike bike) {
		super(bike);
		this.bike = bike;
	}

	@Override
	protected void showDetails() {
		super.showDetails();
		System.out.println("Added Alarm to : "+ bike.getName());
	}
	
	@Override
	protected String addNewFeatureName() {
		return "Alarm";
	}

	@Override
	protected int addNewFeaturePrice() {
		return 18000;
	}
	
	
}
