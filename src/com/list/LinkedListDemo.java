package com.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {


		LinkedList ll=new LinkedList();

		ll.add(10);
		ll.add("hii");
		ll.add('A');
		ll.add(null);
		ll.add(true);
		ll.add(11.5);

		System.out.println("LinkedList elements are: "+ll);


		System.out.println(ll.remove(null));  //true
		System.out.println(ll.contains(10));  //true     

		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.get(2));

		Iterator itr=ll.iterator();
		while(itr.hasNext()) {

			System.out.println(itr.next());

		}


	}

}
