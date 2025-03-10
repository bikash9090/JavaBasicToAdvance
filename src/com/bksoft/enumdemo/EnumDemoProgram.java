package com.bksoft.enumdemo;

public class EnumDemoProgram {

	enum Week {
		monday, tuesday, thursday, friday, saturday
	}

	public static void main(String[] args) {
		System.out.println(Week.monday);

		for (Week name : Week.values()) {
			System.out.print(name + ", ");
		}

		Week wname = Week.monday;

		switch (wname) {
		case monday:
			System.out.println("Monday");
			break;
		case friday:
			System.out.println("friday");
			break;
		}

	}

}
