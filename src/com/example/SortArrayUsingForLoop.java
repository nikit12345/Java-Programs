package com.example;

public class SortArrayUsingForLoop {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};// 2,5,1,5,6,9 || 1,2,5,5,6,9

              
        for(int i=0; i<array.length; i++) {
        	for(int j=0; j<array.length-1-i; j++) {
        		if(array[j]>array[j+1]) {
        			int temp = array[j];
        			array[j]=array[j+1];
        			array[j+1]=temp;
        		}
        	}
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
