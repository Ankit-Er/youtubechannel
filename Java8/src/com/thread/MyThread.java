package com.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (char i = 65; i < 68; i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i + " "+ Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
