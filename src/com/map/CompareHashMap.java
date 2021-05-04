package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMap {

	public static void main(String[] args) {


		HashMap<Integer,String> map1=new HashMap<>();

		map1.put(101, "A");
		map1.put(102, "B");
		map1.put(103, "C");

		HashMap<Integer,String> map2=new HashMap<>();

		map2.put(101, "A");
		map2.put(103, "C");
		map2.put(102, "B");

		HashMap<Integer,String> map3=new HashMap<>();

		map3.put(101, "A");
		map3.put(103, "C");
		map3.put(102, "B");
		map3.put(104, "D");

		//1. on the basis of key-value pair, use equals method

		System.out.println(map1.equals(map2));   //true

		//2.on the basis of only keys---> keySet
		System.out.println(map1.keySet().equals(map2.keySet()));   //true

		//3.find out the extra keys
		//to do that we need combine and removeAll method
		HashSet<Integer> combineKeys=new HashSet<Integer>(map1.keySet());
		combineKeys.addAll(map3.keySet());
		combineKeys.removeAll(map1.keySet());
		System.out.println(combineKeys);

		//4.Compare maps by values

		//duplicates are allowed  then use ArraList

		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values()))); //true

		//duplicates are not allowed  then use HashSet
		System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map2.values()))); //true




	}

}
