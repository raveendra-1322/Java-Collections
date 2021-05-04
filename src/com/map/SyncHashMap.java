package com.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SyncHashMap {

	public static void main(String[] args) {
		
		HashMap map1=new HashMap();
		
		map1.put(101, "A");
		map1.put(102, "B");
		map1.put(103, "C");
		map1.put(104, "D");
		System.out.println(map1);
		
		//Create SyncronizedMap
		
		Map map2=Collections.synchronizedMap(map1);
		
		//Create ConcurrentHashMap
		
		ConcurrentHashMap<Integer, String> chm=new ConcurrentHashMap<>();
		
		chm.put(101, "A");
		chm.put(102, "B");
		chm.put(103, "C");
		System.out.println(chm);
	}

}
