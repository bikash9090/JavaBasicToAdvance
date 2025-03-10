package com.bksoft.collections.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayToListConversion {

	public static void main(String[] args) {
		String[] locations = {"bbsr","ctc","jjkr"};
		System.out.println("String Array : ");
		
		List<String> locList = Arrays.asList(locations);
		System.out.println("List : "+locList);
		
		ArrayList<String> locAlist = new ArrayList(locList);
		System.out.println("ArrayList : "+locAlist);
		
		LinkedList<String> locLinkedList = new LinkedList(locAlist);
		System.out.println("Linkedlist : "+locLinkedList);
		
		Set<String> locSet	= new HashSet(locList);
		System.out.println("Set : "+locSet);
		
		Map<Integer,String> students = new HashMap();
		
		students.put(1,"Bikash");
		students.put(2, "Shiv");
		
		Set<Map.Entry<Integer, String>> stud = students.entrySet();
		System.out.println(stud);
		
		Set<Integer> keys = students.keySet();
		System.out.println("Keys of map : "+keys);
		
		

	}

}
