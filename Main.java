package com.oops;

class A {

	public static  void show(int n) {
		String res = !!(n!=5) ? "Hye" : "Bye";
		System.out.println(res);
	}
}

public class Main {

	public static void main(String[] args) {
		new A().show(5);
		
		/*
		 * Person rohan = new Person(); rohan.showName("rohan");
		 * 
		 * Person anaaya = new Person(); anaaya.showName("anaaya");
		 * 
		 * Person.display();
		 */

	}

}
