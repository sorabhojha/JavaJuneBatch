package com.grotech.basics;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pq = new PriorityBlockingQueue<Integer>();
		pq.add(1); // Only Comparable members are allowed
		pq.add(4);
		pq.add(0);
		pq.add(12);
		pq.add(12);
		
		//Queue of Students - Make sure that comparable is implemented. 
		
		System.out.println(pq);
		//System.out.println(pq.poll());
		//System.out.println(pq.poll());
		//System.out.println(pq.poll());
		//System.out.println(pq.poll());
		
		//It always stores the min from the Queue at its head. 
		
		Iterator<Integer> itr = pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
