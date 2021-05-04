package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ConvertHashMapToArrayList {

	public static void main(String[] args) {

		HashMap<String,Integer> studentList=new HashMap<String, Integer>();

		studentList.put("ABC", 100);
		studentList.put("DFR", 200);
		studentList.put("FDD", 300);
		studentList.put("DEV", 400);
		studentList.put("LOF", 500);

		Iterator itr=studentList.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<String,Integer> entry=(Entry<String, Integer>) itr.next();
			System.out.println(entry.getKey()+ "  " + entry.getValue());
		}

		ArrayList<String> arr=new ArrayList<>(studentList.keySet());
		for(String sname:arr) {
			System.out.println(sname);

		}

		ArrayList<Integer> arr2=new ArrayList<>(studentList.values());
		for(Integer marks:arr2) {
			System.out.println(marks);

		}
		

	}

}
