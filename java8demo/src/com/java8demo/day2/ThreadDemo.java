package com.java8demo.day2;

public class ThreadDemo implements Runnable {

	@Override
	public void run() {
		for(int a=0;a<5;a++) {
			try {
				Thread.sleep(1000);
				System.out.println("Current thread "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		Runnable r = new ThreadDemo();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		
		new Thread(() -> {
			for (int a = 0; a < 5; a++) {
				try {
					Thread.sleep(1000);
					System.out.println("Current thread " + Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}).start();
	}
}
