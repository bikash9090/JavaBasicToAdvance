package com.bksoft.string.manipulation;

public class FindLengthOfString {
	public static void main(String args[]) {
		String str = "Hello Bikash";
		int length = 0;
		
		char[] strArray = str.toCharArray();
		
		for(char c:strArray) {
			length++;
		}
		
		System.out.println("The length of string is : "+length);
	}
}
