package com.example;

import java.util.Arrays;
import java.util.OptionalInt;

public class SumWithoutHighestLowest {
	public static void main(String[] args) {
        int[] numbers = new int[]{6, 2, 1, 8, 7, 10, 3};  // 1 and 10

      int f=  Arrays.stream(numbers).sorted().skip(1).limit(numbers.length-2).sum();
	System.out.println(f);
	
	Arrays.stream(numbers).sorted().skip(1).limit(numbers.length-2).sum();
	}

}
