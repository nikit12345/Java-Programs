package com.example;

public class FindMinFromArray {
	public static void main(String[] args) {
		int[] n= {1,3,7,5,2,5,9};
		
		int ans = n[0];
		
		for(int i=1;i<n.length; i++) {
			if(n[i]<n[0]) {// 
				ans=n[i];//
				
			}
			System.out.println(n[i]-1);
		}
		
		//System.out.println(ans);
	}

}
