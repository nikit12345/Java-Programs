package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;

public class MinMaxArray {
	public static void main(String[] args) {
		int[] u= {1,3,5,7,8,5,3,2};
		
		OptionalInt p= Arrays.stream(u).max();
		System.out.println(p);
		int d=0;
		for(int i=0; i<u.length; i++) {
			if(u[0]<u[i]) {
				u[0]=u[i];
			}
		}
		System.out.println(u[0]);
		
		List<Integer> l = Arrays.asList(1,3,5,6,7,8);
		
		 Collections.sort(l);
	     for(Integer k: l) {
	    	 System.out.println(k);
	     }
	}

}
