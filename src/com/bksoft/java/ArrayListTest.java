package com.bksoft.java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(45);
		alist.add(78);
		alist.add(55);
		alist.add(456);
		
		System.out.print(alist);
		
		alist.remove(3);
		
		System.out.print("\n"+alist);
		
		Iterator<Integer> it = alist.iterator();
	}
	

}
