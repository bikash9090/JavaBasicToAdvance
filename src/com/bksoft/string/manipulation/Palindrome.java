package com.bksoft.string.manipulation;

public class Palindrome {

	public static void main(String[] args) {
		String str = "eye";
		
		StringBuilder sb =new StringBuilder(str);
		String reverse = sb.reverse().toString();
		
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println("The given string is palindrome");
		}else {
			System.out.println("The String is not palindrome");
		}
	}

}
