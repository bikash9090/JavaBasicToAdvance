package com.bksoft.string.manipulation;

import java.util.Set;

public class VowelsAndConsonents {

	public static void main(String args[]) {
		String name = "apple ";
		Set<Character> vowels = Set.of('a','e','i','o','u');
		int vowelsCount = 0;
		int consonent = 0;

		char[] nameArray = name.replaceAll("\\s", "").toCharArray();

		for (int i = 0; i < nameArray.length; i++) {
			if(vowels.contains(nameArray[i])) {
				vowelsCount++;
			}else {
				consonent++;
			}
		}
		
		System.out.println("Total vowels : "+vowelsCount);
		System.out.println("Total consonents : "+consonent);
	}

}
