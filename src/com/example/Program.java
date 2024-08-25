package com.example;

import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};// 2,5,1,5,6,9 || 1,2,5,5,6,9
        StringBuilder sb = new StringBuilder();
  
        
        String[] r = {"flow", "floing", "flowers"};
       Arrays.sort(r);
       
       char[] first= r[0].toCharArray();
       char[] last = r[r.length-1].toCharArray();
       
       for(int i=0; i<first.length; i++) {
    	   if(first[i]==last[i]) {
    		   sb.append(first[i]);
    	   }
       }
       System.out.println(sb);
       
     Optional<String> y=  Arrays.stream(r).max(Comparator.comparing(String::length));
	System.out.println(y);
	}

}
