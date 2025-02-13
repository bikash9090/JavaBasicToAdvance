package com.bksoft.java;

import java.util.HashMap;
import java.util.Map;

public class MapProgramTest {

	public static void main(String[] args) {
		Map<Integer,String> student = new HashMap();
		
		student.put(1, "Siva");
		student.put(23, "bikash");
		
		System.out.println(student);
		System.out.println();
		
		System.out.println(student.get(1));

	}

}
