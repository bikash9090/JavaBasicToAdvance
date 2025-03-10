package com.bksoft.collections.programs;

import java.util.HashMap;
import java.util.Map;

public class RepatingCharCount {

	public static void main(String[] args) {
		String str = "I am I am";
		int count = 0;
		char[] strArray = str.toCharArray();

		Map<Character, Integer> charCount = new HashMap();

		for (char c : strArray) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
		
	}
	
	public void demo() {
		
	}

}