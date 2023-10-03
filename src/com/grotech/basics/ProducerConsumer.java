package com.grotech.basics;

public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1 = new Bank();
		new Thread() {
			public void run() {b1.withdraw(60000);};
		}.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new Thread() {
			public void run() {b1.deposit(35000);};
		}.start();
	}
}

class Bank {
	int amount = 50000;
	
	synchronized void withdraw(int neftAmount) {
		System.out.println("Withdrawing amount - "+neftAmount);
		if(this.amount < neftAmount) {
			System.out.println("Amount not sufficient");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.amount = this.amount-neftAmount;
		System.out.println("Withdrawal complete. Amount remaining - "+this.amount);
	}
	
	synchronized void deposit(int neftAmount) {
		System.out.println("Depositing amount - "+neftAmount);
		amount = amount+neftAmount;
		notify();
	}
}
