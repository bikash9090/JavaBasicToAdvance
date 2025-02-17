package com.bksoft.java;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPrograms {

	public static void main(String[] args) {
		List<String> stuData = new LinkedList<>();
		
		stuData.add("Shiv");
		stuData.add("Gopi");
		stuData.add("Shakti");
		stuData.add("Pandav");
		
		System.out.println(stuData);
		
		stuData.remove(0);
		stuData.remove("Pandav");
		stuData.add(0, "Bikash");
		stuData.set(2, "SHIV");
		
		System.out.println(stuData);

	}

}
