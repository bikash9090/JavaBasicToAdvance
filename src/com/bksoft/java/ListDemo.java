package com.bksoft.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> cities = new LinkedList();
		
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Bhubaneswar");
		cities.add("Kolkata");
		
		System.out.print(cities+"\n");
		
		cities.remove(2);
		System.out.print(cities+"\n\n");
		
		List<Integer> numbers = new ArrayList();
		numbers.add(20);
		numbers.add(45);
		numbers.add(56);
		numbers.add(554);
		numbers.add(34);
		
		System.out.print(numbers+"\n");
		
		numbers.remove(2);
		
		System.out.print(numbers+"\n");
		System.out.print(numbers.get(2));
	}

}
