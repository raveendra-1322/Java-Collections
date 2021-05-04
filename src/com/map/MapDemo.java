package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		//HashMap hm=new HashMap();
		HashMap <Integer,String> hm =new HashMap<>();
		hm.put(101, "A");
		hm.put(102, "B");
		hm.put(103, "C");
		hm.put(104, "D");
		hm.put(105, "E");
		hm.put(106, "F");

		System.out.println(hm);


		System.out.println(	hm.containsKey(101));  //true
		System.out.println(hm.containsValue("B"));  //true
		System.out.println(hm.get(103));
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
		hm.remove(106);
		//System.out.println(hm.keySet());
		//System.out.println(hm.values());
		//System.out.println(hm.entrySet());

		//we can use same for all like values and entry set
		for(int i:hm.keySet()) {

			System.out.println(i);
		}
		for(Map.Entry entry:hm.entrySet()) {

			System.out.println(entry.getKey()+" " +entry.getValue());

		}


		Set s=hm.entrySet();
		Iterator itr=	s.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey() +"  "+entry.getValue());
			
		}
		

	}

}
