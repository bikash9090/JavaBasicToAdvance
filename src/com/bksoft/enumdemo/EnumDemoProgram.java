package com.bksoft.enumdemo;

public class EnumDemoProgram {

	enum Week {
		monday, tuesday, thursday, friday, saturday
	}

	public static void main(String[] args) {
		System.out.println(Week.monday);
		
		for(Week name:Week.values()) {
			System.out.print(name+", ");
		}

	}

}
