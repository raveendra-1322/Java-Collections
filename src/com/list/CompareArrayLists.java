package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayLists {

	public static void main(String[] args) {

		//1.Compare two ArrayLists
		//first sort and comapre with euals() method

		ArrayList<String> arr1=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> arr2=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> arr3=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

		Collections.sort(arr1);
		Collections.sort(arr2);
		//here order is also important,so we have to do sort
		System.out.println(arr1.equals(arr2));  //false
		System.out.println(arr1.equals(arr3));  //true

		//2.Compare two lists and find out additional element
		//arr1.removeAll(arr2);         
		//System.out.println(arr1); //E
		//arr2.removeAll(arr1);
		//System.out.println(arr2);  //F
		
		//3.find out common element
		
		arr1.retainAll(arr2);
		System.out.println(arr1);
		
		
		
	}

}
