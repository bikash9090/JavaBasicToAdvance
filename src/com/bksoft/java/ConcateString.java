package com.bksoft.java;

public class ConcateString {

	public static void main(String[] args) {
		String str = "Hello";
		String str2 = "World";
		int number = 40;
		/*
		 * It works with only Strings not other data types and null.
		 * Return new String by appending
		 * Throws NullPointerExcetipion if 'str' is null.
		 * */
		System.out.println(str.concat(str2));
		
		/*
		 * It allows all non-String types to append.
		 * Internally, the compiler converts + into StringBuilder.append()
		 * */
		System.out.println(str+number);
		
		EnumPractice ee = EnumPractice.LOW;
		System.out.println(ee);
		ee = EnumPractice.HIGH;
		System.out.println(ee);

	}

}	
