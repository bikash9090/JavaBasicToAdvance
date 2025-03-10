package com.bksoft.string.manipulation;

public class ReverseAstring {

	public static void main(String[] args) {
		String name = "Bikash Kumar Sethy";

		char[] reverse = new char[name.length()];

		for (int a = 0; a < name.length(); a++) {
			reverse[a] = name.charAt(a);
		}

		System.out.println(reverse);

	}

}
