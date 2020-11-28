package com.thread;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		MyThread t1 = new MyThread(); // NEW (Born) 
		t1.run(); // RUNNABLE (Ready)

		System.out.println("Hello! " + Thread.currentThread().getName());

	}

}
