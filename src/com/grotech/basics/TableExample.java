package com.grotech.basics;

public class TableExample {

	synchronized void displayTable(int n) {
		
		for (int i=1; i<=10; i++) {
			System.out.println("Value = "+n*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		TableExample ex = new TableExample();
		TableExample ex1 = new TableExample();
		
		ThreadOne t1 = new ThreadOne(ex);
		ThreadTwo t2 = new ThreadTwo(ex1);
		
		t1.start();
		t2.start();
	}
}

class ThreadOne extends Thread {
	
	TableExample ex;
	ThreadOne(TableExample ex){
		this.ex = ex;
	}
	
	@Override
	public void run() {
		ex.displayTable(5);
	}
}

class ThreadTwo extends Thread {
	
	TableExample ex;
	ThreadTwo(TableExample ex){
		this.ex = ex;
	}
	
	@Override
	public void run() {
		ex.displayTable(7);
	}
}
