package com.example;

public class Abberevation {
	public static void main(String[] args) {
		String phrase = "National Aeronautics and Space Administration";
        System.out.println(Abberevation.abberevation(phrase));
    	StringBuilder sb = new StringBuilder();
    	
    	for(String s:phrase.split(" ")) {
    		if(!s.isEmpty()) {
    			sb.append(Character.toUpperCase(s.charAt(0)));
    			
    		}
    	}
    	System.out.println(sb.toString());
 
	}
	
	public static String abberevation(String s) {
		StringBuilder sb = new StringBuilder();
		String g[] = s.split(" ");
		
		for(String d : g) {
			if(!d.isEmpty()) {
				sb.append(Character.toUpperCase(d.charAt(0)));
			}
		}
		return sb.toString();
	}
	

}
