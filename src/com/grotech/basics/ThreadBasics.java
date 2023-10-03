package com.grotech.basics;

public class ThreadBasics extends Thread {
	
	public ThreadBasics(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hi this is run method call. "+Thread.currentThread().getName());
		for (int i=0; i<=100; i++) {
			System.out.println(Thread.currentThread().getName()+" Running I ="+i);
		}
	}

	// 3 Thread
	// Main thread - JVM 
	// Line No 20 - Create another thread - FirstThread-1
	// Line no 24 - Create another thread - SecondThread-1
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadBasics tb = new ThreadBasics("FirstThread-1");
		tb.setPriority(MIN_PRIORITY);
		
		ThreadBasics tb1 = new ThreadBasics("SecondThread-1");
		tb1.setPriority(MAX_PRIORITY);
		
		tb.start();
		
		//tb.join();// Main wants to Join FirstThread. 
		tb1.start();
	}
}
