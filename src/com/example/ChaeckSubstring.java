
package com.example;

public class ChaeckSubstring {
	public static void main(String[] args) {
		String s ="hi i love java coding";
		String f="java";
		
		if(s.contains(f)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		if(s.indexOf(f)== -1) {
			System.out.println(false);
		}else {
			System.out.println(true);
		}
	}

}
