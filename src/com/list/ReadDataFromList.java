package com.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ReadDataFromList {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		
		al.add(1);
		al.add('A');
		al.add("hello");
		al.add(10.5);
		al.add(true);
		al.add(10);
		
		System.out.println("List of elements in AL is"+al);
		System.out.println(al.size());
		
		//Read the data from the list
		
		//1. Using for loop
		
		for(int i=0;i<al.size();i++) {
			
			System.out.println(al.get(i));
			
		}
		
		//2. Using For each loop
		
		for(Object l:al) {
			
			System.out.println("print elements using for each " + l);
		}
		
		//3. Using Iterator
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	

}
