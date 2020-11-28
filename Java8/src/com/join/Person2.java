package com.join;

public class Person2  implements Runnable {
	@Override
	public void run() {
		System.out.println("Person 2 - Give me 150 rupees !! "+Thread.currentThread().getName());
	}
}
