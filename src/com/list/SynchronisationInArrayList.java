package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronisationInArrayList {

	public static void main(String[] args) {

		List<String> arr=Collections.synchronizedList(new ArrayList<String>());

		arr.add("webdriver");
		arr.add("java");
		arr.add("selenium");
		arr.add("testng");
		System.out.println(arr);
		
		//add/remove elements we don't need explicit synchronization
		// to retrieve the elements we need explicit synchronization
		synchronized (arr) {
			Iterator<String> itr=arr.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}	

// copyOnWriteArrayList is a class--->Synchronized already and thread safety
		
		CopyOnWriteArrayList<String> ca=new CopyOnWriteArrayList<>();

		ca.add("java");
		ca.add("sql");
		ca.add("testng");
		ca.add("java");

		Iterator<String> itr=ca.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
