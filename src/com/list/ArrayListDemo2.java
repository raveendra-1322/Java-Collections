package com.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();

		al.add("A");
		al.add("D");
		al.add("B");
		al.add("K");
		al.add("H");
		al.add("I");
		al.add("N");
		System.out.println("ArrayList elements are : "+ al);

		ArrayList al_dup=new ArrayList(al);
		
		System.out.println(al.contains("H"));  //true
		System.out.println(al.contains("Z"));  //false
		System.out.println("new arraylist elements are :" +al_dup);

		//removeAll()

		al_dup.removeAll(al);
		System.out.println("After removing collection elements "+al_dup);

		System.out.println(al);

		//Sorting the Order
		System.out.println("Before sorting collection elements are: "+al);
		Collections.sort(al);
		System.out.println("after sorting collection elements are:"+ al);

		//Shuffling the elements
		Collections.shuffle(al);
		System.out.println("Shuffled elements are :" +al);
	}

}
