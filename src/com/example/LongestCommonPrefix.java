package com.example;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args) {
        String[] g = new String[]{"ssda", "ssdfs", "sserowi"};
		System.out.println(longestCommonPrefix2(g));
	
	System.out.println(LongestCommonPrefix.longestCommonPrefix(g));
	}
	
	public static String longestCommonPrefix2(String[] s) {
		
		StringBuilder sb = new StringBuilder();
		Arrays.sort(s);
		char f[] = s[0].toCharArray();
		char l[] = s[s.length-1].toCharArray();
		
		for(int i=0;i<s.length-1; i++) {
			if(f[i]==l[i]) {
				sb.append(f[i]);
			}
		}
		return sb.toString();
		
	}
	
	public static String longestCommonPrefix(String[] s) {
		
		StringBuilder sb = new StringBuilder();
		
		Arrays.sort(s);
		
		char[] first = s[0].toCharArray();
		char[] last = s[s.length-1].toCharArray();
		
		for(int i=0; i<first.length; i++) {
			if(first[i]!=last[i]) 
				break;
				sb.append(first[i]);
			
		}
		return sb.toString();
	}

}
