package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysToArrayList {
	public static void main(String[] args) {
		int[] s= {1,32,3,45,5,6};
		
	Integer[] intArr=	Arrays.stream(s).boxed().toArray(Integer[]::new);
	System.out.println(intArr);
	 List l = Arrays.asList(intArr);
	 System.out.println(l);
	 
	 List<Integer> ll = new ArrayList<Integer>();
	 for(Integer hh: intArr ) {
		 ll.add(hh);
	 }
	 System.out.println(ll);
	 
	Integer[] g=Arrays.stream(s).boxed().toArray(Integer[]::new);
	 List jj = Arrays.asList(g);
	 System.out.println(jj);
	}

	
}
