package com.bksoft.string.manipulation;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {

		String str = "hello";

		char[] stringArray = str.toCharArray();

		Set<Character> nonDuplicates = new HashSet<Character>();
		Set<Character> duplicates = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			if(nonDuplicates.contains(stringArray[i])) {
				duplicates.add(stringArray[i]);
			} else {
				nonDuplicates.add(stringArray[i]);
			}
		}
		
		System.out.println(duplicates);

	}

}
