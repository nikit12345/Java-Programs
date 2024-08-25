package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestWordFromString {
	public static void main(String[] args) {
		String s="hi my name isw nikita";
		String longestWord="";
		String[] f= s.split(" ");
		for(String word: f) {
			if(word.length()>longestWord.length()){
				longestWord=word;
			}
		}
		System.out.println(longestWord);
		
		Optional<String> longestWord2 =Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length));
		System.out.println(longestWord2);
		
		Optional<String> longestWord3 =	Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length));
	   System.out.println(longestWord3);
	   
	   
	   String longest ="";
	   for(String d:s.split(" ")) {
		   if(d.length()<longest.length()) {
			   longest=d;
		   }
	   }
	}

}
