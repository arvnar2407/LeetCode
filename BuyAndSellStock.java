package com.problems;

public class BuyAndSellStock {
	public static void main(String[] args) {
		int prices[] = {7, 6, 3, 4, 1};
//		int max = 0;
//		int min = a[0];
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]<min) {
//				min = a[i];
//			}
//			else if(a[i] > min) {
//				max = Math.max(max, a[i] - min);
//			}
//			
//		}
		 int max =0;
	        for(int i=1;i<prices.length;i++) {
	            int temp = prices[i] - prices[i-1];
	            if(temp > 0)
	            	max = max + Math.max(max,temp);
	        }
		System.out.println(max);
		
	}
}
