package com.bksoft.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPrograms {
	public static void main(String args[]) {
		List<Integer> number = new  ArrayList<>();
		
		for(int i=78;i<85;i++) {
			number.add(i); //Adding elements
		}
		number.add(80);
		
		number.set(1, 78788); //updating elements
		System.out.println(number.indexOf(80));
		System.out.println(number.lastIndexOf(80));
		
		for(int i:number) {
			System.out.print(i+" ");
		}
//		
//		Iterator iterate = number.iterator();
//		while(iterate.hasNext()) {
//			System.out.print(iterate.next()+" ");
//		}
	}
	

}
