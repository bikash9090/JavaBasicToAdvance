package com.bksoft.java;

public class ForLoop {

	public static void main(String[] args) {

		int a=12;
		for(int i=0;i<a;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
