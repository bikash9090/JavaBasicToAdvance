package com.bksoft.collections.programs;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TraverseHashSet {

	public static void main(String[] args) {
		
		
		Set<Integer> ids = new HashSet<Integer>();
		
		ids.add(3453);
		ids.add(565);
		ids.add(8909);
		
		Iterator<Integer> iterate = ids.iterator();
		while(iterate.hasNext()) {
			int a = iterate.next();
			System.out.print(a);
		}
		
//		for(int a : ids) {
//			System.out.println(a);
//		}
		

	}
}
