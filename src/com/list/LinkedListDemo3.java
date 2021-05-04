package com.list;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {

		LinkedList ll=new LinkedList();
		ll.add("A");
		ll.add("C");

		ll.add("P");
		ll.add("O");
		ll.add("K");
		ll.add("T");

		System.out.println("linked list elements are: "+ll);

		ll.addFirst("hii");
		ll.addLast("Hello");
		System.out.println(ll);


		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());

		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println("after removing :"+ll);
	}

}
