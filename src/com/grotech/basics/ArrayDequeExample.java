package com.grotech.basics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Double ended Queue
		//Array based data structure. 
		
		// Blocking Queues - Thread safety 
		
		// add/remove/offer/peek/poll
		// peekFirst/pollFirst
		// offerFirst/offerLast
		// Null  is not supported
		// Thread safe 
		// Size restrction - not applicable - Growable 
		// Faster than LL - Retreivals
		
		Deque<Integer> dq = new ArrayDeque();
		dq.add(1);
		dq.add(2);
		dq.add(3);
		dq.addFirst(4);
		dq.addLast(5);
		dq.offerFirst(6);
		dq.offerLast(7);
		dq.add(8);
		System.out.println(dq);
		
		for(Integer i: dq) {
			System.out.println(i);
		}
		
		Deque<Integer> li = new LinkedList<Integer>();
		li.add(null);
		
		//A negative no -10
		// 0 - when equals 
		//A positive no +10
		
		//compareTo(Student s){
		//	if(this.s.totalMarks()>s.totalMarks(){
		//     return 1;
		//  else 
		//  else 
		//}
		
		// LinkedList - Child of both List/Queue - Null is allowed
		// ArrayDeque, PriorityBlockingQueue and PriorityQueue -> Do not allow nulls - NPE is thrown
		// All support duplicate insertions. 
	}
}
