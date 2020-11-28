package com.join;

public class Main {

	/*
	 * [Tread Priority]
	 * 
	 * Rang -> 1 to 10 
	 * Max Priority --> 10
	 * Min Priority --> 1 
	 * Norm Priority --> 5 (default Priority) 
	 * never try to use in real time application
	 * 
	 */
	 
	public static void main(String[] args) {

		//get person salary from [personTbl[
		Thread person1 = new Thread(new Person1(),"Abhi");
		//get person bonus from [personBonus]
		Thread person2 = new Thread(new Person2(),"Yaman");

		person1.start();
		person2.start();

		try {
			person1.join();
			person2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// me
		System.out.println("Watching movie "+Thread.currentThread().getName()); // get 300 rupees (waiting)

	}

}
