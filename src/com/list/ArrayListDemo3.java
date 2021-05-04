package com.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		//Convert array into arraylist
		
		String arr[]= {"A","G","O"};
		
	for(String s:arr) {
		
		System.out.println("Array elements are :"+ s);
	}
		
	ArrayList al=new ArrayList(Arrays.asList(arr));
	
	System.out.println("array list elements are:"+ al);
	
	

	}

}
