package com.bksoft.java;

public class StaticDemo {
	public static void main(String args[]) {
		m1(9);
		m1(88,89);
	}
	
	static int m1(int a) {
		System.out.println(a+" first m1");
		return 55;
	}
	
	static int m1(int a,int b) {
		System.out.print(a+" second m1 "+b);
		return 3;
	}
	
//	static void m1() {
//		
//	}
//	
//	static int m1() {
//		
//	}
}
