package com.queue;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		
		PriorityQueue pq=new PriorityQueue();
		
		//add elements to Queue
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.offer(40);
		pq.offer(50);
		
		System.out.println(pq);
		
		//get elements from head in a dueue
		System.out.println(pq.element());  //10
		System.out.println(pq.peek());   //10
		
		//get the head element and remove from queue
		
		System.out.println(pq.remove()); //10
		System.out.println(pq.poll());  //20
		System.out.println(pq);    //remaining elements are [30 40 50]
	}

}
