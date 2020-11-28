package com.progrank.decorator;

public class EletricDecorator extends BikeDecorator {
	
	protected Bike bike;
	
	public EletricDecorator(Bike bike) {
		super(bike);
		this.bike = bike;
	}

	@Override
	protected void showDetails() {
		super.showDetails();
		System.out.println("Added Electric to : "+ bike.getName());
	}
	
	@Override
	protected String addNewFeatureName() {
		return "Electric";
	}

	@Override
	protected int addNewFeaturePrice() {
		return 50000;
	}
	
	
}
