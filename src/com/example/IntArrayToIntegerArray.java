package com.example;

import java.util.Arrays;

public class IntArrayToIntegerArray {
	public static void main(String[] args) {
		int[] s= {1,32,3,45,5,6};

	Integer[] f=	Arrays.stream(s).boxed().toArray(Integer[]::new);
	System.out.println(f);
	for(Integer o:f) {
		System.out.println(o);
		
		Arrays.stream(s).boxed().toArray(Integer[]::new);
	}
	}

}
