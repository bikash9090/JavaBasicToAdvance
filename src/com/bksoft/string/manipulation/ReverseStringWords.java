package com.bksoft.string.manipulation;

public class ReverseStringWords {

	public static void main(String[] args) {
		String name = "Bikash Kumar Sethy";
		String[] splitData = name.split(" ");

		for (int i = 0; i < splitData.length; i++) {
			reverseWord(splitData[i]+" ");
		}

	}

	public static void reverseWord(String word) {
		for (int a = word.length()-1; a >= 0; a--) {
			System.out.print(word.charAt(a));
		}
	}

}
