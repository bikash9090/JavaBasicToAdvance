package com.bksoft.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPrograms {
	public static void main(String args[]) {
		List<Integer> number = new  ArrayList<>();
		
		for(int i=0;i<20;i++) {
			number.add(i);
		}
		
		for(int i:number) {
			System.out.print(i+" ");
		}
		
		Iterator iterate = number.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next()+" ");
		}
	}
	

}
