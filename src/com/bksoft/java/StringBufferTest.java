package com.bksoft.java;

public class StringBufferTest {
	
	static String name = "AMBU";
	
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer(name);
		sb.append("LANCE");
		
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(3));
		System.out.println(sb.reverse());
		System.out.println(sb.length());
		sb.ensureCapacity(700);
		System.out.println(sb.capacity());
	}

}
