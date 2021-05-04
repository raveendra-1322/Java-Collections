package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsInArrayList {

	public static void main(String[] args) {

		// First way
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(1,2,3,3,4,4,5,6));
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>(arr);
		ArrayList<Integer> withOutDuplicateElements=new ArrayList<Integer>(lhs);
		System.out.println(withOutDuplicateElements);
		
		//2nd way
		List<Integer> withOutDuplicate =arr.stream().distinct().collect(Collectors.toList());
		System.out.println(withOutDuplicate);


	}

}
