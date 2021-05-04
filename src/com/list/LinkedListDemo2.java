package com.list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		
		LinkedList<String> ll=new LinkedList<>();
		ll.add("A");
		ll.add("K");
		ll.add("M");
		ll.add("B");
		ll.add("C");
		ll.add("C");
		
		LinkedList<String> ll_dup=new LinkedList<>();
		ll_dup.addAll(ll);
		System.out.println("new collection is: "+ ll_dup);
		ll_dup.add("dog");
		ll_dup.add("pig");
		ll_dup.add("cat");
		System.out.println("modified collection is:"+ll_dup);
		
		// using retainAll
		ll_dup.retainAll(ll);
		System.out.println(ll_dup);
		
		//Sorting 
		
		Collections.sort(ll);
		System.out.println("After sorting list elements are :"+ ll);
		
		Collections.sort(ll,Collections.reverseOrder());
		System.out.println("After sorting revers list elements are :"+ ll);
	}

}
