package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo  {

	public static void main(String[] args) {

		//ArrayList al = new ArrayList();
		//ArrayList<Integer> al= new ArrayList<Integer>();
		//ArrayList<String> al= new ArrayList<>();

		List al=new ArrayList();
		

		al.add(10);
		al.add('A');
		al.add("Hello");
		al.add(10);
		al.add(20.5);
		al.add(true);

		System.out.println("list of array list elements are"+ al);
		al.remove(3);
		al.remove(20.5);

		System.out.println("after removing  list elements are"+ al);

		Object o=al.get(2);
		System.out.println(o);
		
		System.out.println(al.size());   //5
		
		System.out.println(al.isEmpty());  //false
		
		// add a new element
		
		al.add("hii");
		System.out.println(al);
		
		al.add(0, "hii");
		System.out.println(al);
		
		//replace a element
		al.set(2, "how");
		System.out.println("after relacing new element"+al);
		
		//search a element in list
		
		System.out.println(al.contains("hii"));  //true
		
		System.out.println(al.contains("you")); //false
	}

}
