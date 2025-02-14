package com.bksoft.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		
	}

	static void arithmetic() {
		int a = 8, b = 0;

		System.out.println(a / 0);

	}

	static void fileIO() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\bikashs\\eclipse-workspace\\javaPractice\\src\\test\\resources\\config.properties");
		
	}

}
