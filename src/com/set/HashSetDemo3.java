package com.set;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {

		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		hs.add(90);
		System.out.println("HashSet elements are:"+ hs);

		HashSet<Integer> hs2=new HashSet<>();
		hs2.add(50);
		hs2.add(60);
		hs2.add(70);
		hs2.add(80);
		System.out.println(hs2);

		//deference 
		hs.removeAll(hs2);
		System.out.println("the diff elements are:"+hs);
		//union
		hs.addAll(hs2);
		System.out.println("union elements are:"+ hs);
		//intercection
		hs.retainAll(hs2);
		System.out.println("intercection elements are:"+hs);

		//subset
		
		System.out.println(hs.containsAll(hs2));   //true
		System.out.println("subset values are:"+hs);



	}

}
