package com.bksoft.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPrograms {

	public static void main(String[] args) {
		Set<Integer> studentSet = new HashSet();

		studentSet.add(4344);
		studentSet.add(5556);
		studentSet.add(577);
		studentSet.add(667);
		studentSet.add(5556);
		studentSet.add(899);
		studentSet.add(5556);

		System.out.println(studentSet);

		studentSet.remove(5556);
		Iterator<Integer> iterate = studentSet.iterator();

		while (iterate.hasNext()) {
			System.out.print(iterate.next() + " ");
		}
		System.out.println();
		for (int student : studentSet) {
			System.out.print(student + " ");
		}

	}

}
