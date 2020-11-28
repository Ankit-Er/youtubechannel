package com.progrank.builder;

public class Main {

	public static void main(String[] args) {
		Mobile mobile1 = new Mobile.Builder("OnePlus")
				.setColor("Red")
				.setRam("2GB").build();
		
		Mobile mobile2 = new Mobile.Builder("OnePlus")
				.setColor("Red")
				.setRam("2GB").setProcessor("dual-core").build();
		
		System.out.println(mobile1);
		
		System.out.println(mobile2);
	}

}
