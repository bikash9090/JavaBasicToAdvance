package com.bksoft.java;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("zpple");
		names.add("zero");
		names.add("tool");
		names.add("paper");
		
		Collections.sort(names);
		
		for(String i:names) {
			System.out.print(i+", ");
		}
	}

}
