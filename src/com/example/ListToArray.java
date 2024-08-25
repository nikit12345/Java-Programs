package com.example;

import java.util.Arrays;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7);
		
		Object[] o =l.toArray();
		for(Object oo:o) {
			System.out.print(oo+" ");
		}
		
		Object[] oo = l.toArray();
		
		for(Object ll:oo) {
			System.out.println(ll);
		}
	}

}
