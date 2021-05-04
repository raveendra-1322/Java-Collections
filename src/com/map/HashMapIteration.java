package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteration {

	public static void main(String[] args) {

		HashMap<Integer,String> studentList=new HashMap<Integer, String>();
		studentList.put(101, "Ravi");
		studentList.put(102, "Mani");
		studentList.put(103, "Sree");
		studentList.put(104, "Siva");

		//Operations on HashMap
		System.out.println(studentList.get(104));
		System.out.println(studentList.size());
		System.out.println(studentList.containsKey(103));
		System.out.println(studentList.containsValue("Mani"));	

		//System.out.println(studentList.keySet());
		//System.out.println(studentList.values());
		
		
		//Iterator: over the keys : by using keySet()
		Iterator<Integer> itr=studentList.keySet().iterator();
		while(itr.hasNext()) {
			
			Integer key=itr.next();
			String value=studentList.get(key);
			
			System.out.println("Key is : "+ key + " value is : " + value);
			
		}
		
		//Iterator :over the pair : using entrySet
		
	Iterator itr2=studentList.entrySet().iterator();
		while(itr2.hasNext()) {
			
			Map.Entry<Integer, String> entry= (Entry<Integer, String>) itr2.next();
			
			System.out.println(entry.getKey() +"   "+ entry.getValue());
		}
	
	
	
		
	}

}
