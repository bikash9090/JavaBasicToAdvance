package com.bksoft.enumdemo;

public class EnumDemoProgram {

	// The enum constants are public, static and final
	// (unchangeable - cannot be overridden).
	// Use enums when you have values that you know aren't going to change,
	// like month days, days, colors, deck of cards, etc.
	enum Week {
		monday, tuesday,wednesday, thursday, friday, saturday
	}

	public static void main(String[] args) {
		System.out.println(Week.monday);

		for (Week name : Week.values()) {
			System.out.print(name + ", ");
		}

	}

}
