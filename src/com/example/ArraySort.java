package com.example;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
	   int[] u= {1,3,5,7,8,5,3,2}; int y=u.length;
       Arrays.sort(u);
       System.out.println(Arrays.toString(u));
       System.out.println(u[y-2]);
       
       Arrays.sort(u);
    System.out.println(Arrays.toString(u));   
	}

}
