package com.example;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayMinMax {
	public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};// 
        int temp=array[0];
     for(int i=1;i<array.length;i++) {
    	 if(temp>array[i]) {
    		 temp=array[i];
    	 }
     }
     System.out.println(temp);
     
     for(int i=1; i<array.length;i++) {
    	 int tem2p=array[0];
    	 if(temp>array[i]) {
    		 temp=array[i];
    	 }
     }
     
     System.out.println(temp);
     Arrays.stream(array).min();
     
     OptionalDouble o =Arrays.stream(array).average();
     System.out.println(o);
     
     Integer[] arr = {5, 2, 9, 1, 5, 6};// 
    OptionalInt i= Arrays.stream(arr).mapToInt(Integer::valueOf).min();
   System.out.println(i);
	}

}
