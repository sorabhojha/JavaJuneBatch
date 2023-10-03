package com.grotech.basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample implements Runnable{

	//Pool of worker threads, waiting to execute
	//Fixed size.  - CPU - Octa  core - 16 Threads 
	//Job Done - Comes back to the pool. 
	
	//newFixedThreadPool(3)
	//newCachedThreadPool - Caching 4 + 2  - Website - Smarter
	//newSingleThreadPoolExecutor - 1
	//java.util.concurrent 

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<=5; i++) {
			System.out.println("Iterating i="+i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService es = Executors.newSingleThreadExecutor();
		ThreadPoolExample t1 = new ThreadPoolExample();
		ThreadPoolExample t2 = new ThreadPoolExample();
		ThreadPoolExample t3 = new ThreadPoolExample();
		
		es.execute(t1);
		es.execute(t2);
		es.execute(t3);
	}
}
