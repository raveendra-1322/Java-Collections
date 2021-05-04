package com.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		
		//Hashtable ht=new Hashtable();   //default capacity 11 and load factor 0.75
		//Hashtable ht=new Hashtable(20);
		//Hashtable ht=new Hashtable(20,(float)0.9);
		Hashtable<Integer,String> ht=new Hashtable<>();
		ht.put(101, "AA");
		ht.put(102, "BB");
		ht.put(103, "CC");
		ht.put(104, "DD");
		ht.put(105, "EE");
		ht.put(106, "FF");
		ht.put(107, "GG");

		System.out.println(ht);
		
		//Nulls are not accept for both keys and values also
		//Hashtable is Synchronized
		
		for(Map.Entry entry:ht.entrySet()) {
			
			System.out.println(entry.getKey()+"  "+ entry.getValue());
		}
		
		Set s=ht.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
	}

}
