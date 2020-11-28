package com.progrank.decorator;

public abstract class Bike {
	private String name;
	private int price;
	
	public Bike(){}
	public Bike(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	protected abstract void showDetails();
	
	
}
