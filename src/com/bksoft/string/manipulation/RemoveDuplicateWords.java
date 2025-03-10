package com.bksoft.string.manipulation;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String name = "Hello i am Hello";

		String[] splitData = name.split(" ");
		Set<String> nonDuplicates = new LinkedHashSet<String>();

		for (int i = 0; i < splitData.length; i++) {
			nonDuplicates.add(splitData[i]);
		}
		
		for(String nonDuplicate: nonDuplicates) {
			System.out.print(nonDuplicate+" ");
		}

	}

}
