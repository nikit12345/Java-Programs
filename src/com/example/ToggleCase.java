package com.example;

public class ToggleCase {
	public static void main(String[] args) {
		String s ="nIkItA";
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				sb.append(Character.toLowerCase(s.charAt(i)));
			}else {
				sb.append(Character.toUpperCase(s.charAt(i)));
			}
		}
		System.out.println(sb.toString());
		ToggleCase.caseconversion(s);
		
	}
	
	public static void caseconversion(String s) {
		StringBuffer sf = new StringBuffer();

		String upper ="", lower="";
		
		for(int i=0; i<s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				sf.append(Character.toLowerCase(s.charAt(i)));
			}else {
				sf.append(Character.toUpperCase(s.charAt(i)));
			}
		}
		System.out.println(sf);
	}

}
