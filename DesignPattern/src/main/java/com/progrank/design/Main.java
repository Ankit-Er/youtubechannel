package com.progrank.design;

public class Main {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		DatabaseLayer db = DatabaseLayer.getDbInstance();
		long end = System.currentTimeMillis();
		
		System.out.println(db);
		System.out.println(start-end);
	}

}
