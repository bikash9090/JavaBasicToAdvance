package com.bksoft.interfaceimplementations;

public class DemoImplement implements Demo {
	public void method1() {
		System.out.println("Implemented method1");
	}

	public static void main(String args[]) {
		Demo obj = new DemoImplement();
		obj.method1();
		System.out.println(obj.a);
	}
}
