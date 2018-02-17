package com.problems;

import java.util.HashSet;
import java.util.Iterator;

public class LongestSequence {
	public static void main(String[] args) {
		int nums[] = {0,-1};
		HashSet set = new HashSet();
		for(int i:nums){
			set.add(i);
		}
		int max =1;
		
		for(int i:nums) {
			if(!set.contains(i-1)) {
				int current = i,count=1;
				while(set.contains(current+1)) {
					count++;
					current++;
				}
				max = Math.max(count,max);
			}
		}
		System.out.println(max);
	}

}
