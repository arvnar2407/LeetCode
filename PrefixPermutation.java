package com.problems;

public class PrefixPermutation {

	public static void main(String[] args) {
	
		int a[] = {4,1,3,2};
		int max = Integer.MIN_VALUE;
		int count = 0;
		for(int i=0;i<a.length;i++) {
			
			if((a[i]<= i+1) && max<=i+1 ) {
				count++;
			}
			if(a[i] > max)
				max = a[i];
		}
		System.out.println(count);
	}
	
	
}
