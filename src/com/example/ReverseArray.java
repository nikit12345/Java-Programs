package com.example;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		ReverseArray.reverseArray(23213123);
		int i[] = {1,2,4,5,7};
        System.out.println("length "+i.length);
        for(int j=i.length-1; j>=0; j--) {
        	System.out.println(i[j]);
	}}
	private static void reverseArray(long number) {
        int[] numbers = new StringBuilder()
                .append(number)
                .reverse()
                .chars() // '8' '4' '6' '2' '3' '7'
                .map(Character::getNumericValue)
                .toArray();

        Arrays.stream(numbers).forEach(System.out::println);
        
        
        }
    

}
