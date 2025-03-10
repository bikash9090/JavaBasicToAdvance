package com.bksoft.string.manipulation;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringWordsUsingCollections {

	public static void main(String[] args) {
		String sentence = "Nothing new is happening here";
		String[] a = sentence.split(" ");
		
		List<String> reverse = new ArrayList<String>();
		
		for(int i=0;i<a.length;i++) {
			reverse.add(new StringBuilder(a[i]).reverse().toString());
		}
		
		for(String s:reverse) {
			System.out.print(s+" ");
		}
		
	}

}
