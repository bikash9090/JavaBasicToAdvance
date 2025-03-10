package com.bksoft.collections.programs;

public class FindPrimeNumbers {

	public static void main(String[] args) {
		int[] numbers = { 5, 34, 45, 87, 15,41,61, 90, 67, 31, 91, 3 };
		
		for(int number: numbers) {
			if(isPrime(number) == true) {
				System.out.println(number+" : Prime");
			}else {
				System.out.println(number+" : Not Prime");
			}
		}

	}

	public static boolean isPrime(int number) {

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public void demo() {
		
	}

}
