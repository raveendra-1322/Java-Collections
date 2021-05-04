package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		//HashSet<Integer> hs=new HashSet<>();
		//HashSet hs=new HashSet(16);    //default capacity 16 and fill ratio is 0.75%
		//HashSet hs=new HashSet(100,(float)0.90);

		HashSet hs=new HashSet();

		hs.add(10);
		hs.add("hello");
		hs.add("hii");
		hs.add('A');
		hs.add(10.5);     //insertion order is not preserved
		hs.add(null);
		hs.add(true);
		hs.add(null);   // null insertion is only once
		hs.add(10);   //duplicates are not allowed
		System.out.println("hashset elements are :"+hs);

		hs.remove(10.5);

		System.out.println(hs.contains(null));  //true
		System.out.println(hs.contains(false));  //false
		System.out.println(hs.isEmpty());    //false

		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

		}


	}

}
