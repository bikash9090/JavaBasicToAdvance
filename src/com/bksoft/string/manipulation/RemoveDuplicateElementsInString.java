package com.bksoft.string.manipulation;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsInString {

	public static void main(String[] args) {

		String name = "Hi I am Bikash kumar sethy Hi I am";
		Set<Character> nonDuplicates = new LinkedHashSet<Character>();

		for (int i = 0; i < name.length(); i++) {
			nonDuplicates.add(name.charAt(i));
		}
		
		Iterator<Character> iterate = nonDuplicates.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
		}

	}

}
