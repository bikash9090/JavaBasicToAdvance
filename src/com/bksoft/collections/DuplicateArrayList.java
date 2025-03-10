package com.bksoft.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArrayList {

	public static void main(String args[]) {
		List<Integer> number = Arrays.asList(112, 2, 2, 32, 47, 48, 5, 112, 48);
		Set<Integer> nonDuplicate = new HashSet(number);
//
//		System.out.println(nonDuplicate);
//		number.sort(Comparator.naturalOrder());
//
//		System.out.println(number);
		
		Collections.reverse(number);
		
		System.out.println(number);
		
		

	}
}
