package com.join;

public class Person1 implements Runnable {
	@Override
	public void run() {
		System.out.println("Person 1 - Give me 150 rupees !! "+Thread.currentThread().getName());
	}
}
