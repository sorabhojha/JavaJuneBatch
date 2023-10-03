package com.grotech.basics;

public class RunnableExample implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableExample ex = new RunnableExample();
		Thread th = new Thread(ex, "MasterThread");
		Thread th1 = new Thread(ex, "SlaveThread");
		
		
		th.start();
		th1.start();
		th.start(); // Non Reusable
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<=100; i++) {
			System.out.println("Iterating i="+i);
		}
	}
}
