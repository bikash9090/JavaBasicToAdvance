package com.bksoft.java;

public class WhileLoop {

	public static void main(String[] args) {
		int num = 10;
		while (num > 0) {
			System.out.println(num);
			num--;
		}
		
		System.out.println(num);
		
		while(num > 0) {
			if(num%2 != 0) {
				System.out.print(num+" ");
			}
			num--;
		}

	}

}
