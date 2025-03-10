package com.bksoft.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SortArrays {

	public static void main(String[] args) {
		int[] numbers = { 2, 3, 23, 45, 2, 3, 66, 7, 23, 66, 756, 89 };
		Set<Integer> unique = new HashSet();
		
		for(int a:numbers) {
			
			unique.add(a);
		}
		
		Iterator<Integer> iterate = unique.iterator();
		while(iterate.hasNext()) {
			System.out.print(" "+iterate.next());
		}
	}

}
