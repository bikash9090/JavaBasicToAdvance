package com.bksoft.java;

public class StringToInteger {

	public static void main(String[] args) {
		String number = "400";
		int age = 40;

		// Returns primitive data type.
		int num = Integer.parseInt(number);

		// Returns non-primitive data type.
		Integer num2 = Integer.valueOf(age);

		System.out.println(num * 5);
		System.out.println(num2);
	}

}
