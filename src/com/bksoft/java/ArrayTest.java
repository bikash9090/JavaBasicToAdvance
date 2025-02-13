package com.bksoft.java;

public class ArrayTest {

	public static void main(String[] args) {
		String[] names = { "bikash", "hello" };
		int[] number = { 39, 58, 33 };

		System.out.print(names[1] + " \n");

		// Print the string array
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println("\n-------------------------");

		// Print the integers array
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println("\n-------------------------");

		// Sort an array
		int[] ages = { 34, 12, 1, 3, 67, 45, 5 ,1,1};

		for (int i = 0; i > ages.length; i++) {
			for (int j = i; j < ages.length; j++) {
				if (ages[i] < ages[j]) {
					int temp = ages[i];
					ages[i] = ages[j];
					ages[j] = temp;
				}
			}
		}
		for(int age:ages) {
			System.out.print(age+" ");
		}
		System.out.println("\n-------------------------");
		
		//MultiDimensional Array
		int[][] marray = {{1,2,4,55,22,9},{56,87,34,56,90,44,66,77}};
		
		for(int i=0;i<marray.length;i++) {
			for(int j=0;j<marray[i].length;j++) {
				System.out.print(marray[i][j]+" ");
			}
			System.out.println();
		}

	}

}
