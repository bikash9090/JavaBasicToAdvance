package com.bksoft.collections.programs;

public class FindFirstRepetingCharacter {
	public static void main(String args[]) {
		String details = "kyrtsmello i ap He";

		for(char detail: details.toCharArray()) {
			if(details.indexOf(detail) != details.lastIndexOf(detail)) {
				System.out.println("First repating character : "+detail);
				break;
			}
		}
	}

}
