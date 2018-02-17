package com.problems;

public class RemoveElement {
	public static void main(String[] args) {
		int a[] = {1,2};
		System.out.println(removeElement(a, 3));
	}
	public static int removeElement(int[] nums, int val) {
	    int tracker=-1;
	    for(int i=0;i<nums.length;i++) {
	        if(nums[i]==val && tracker == -1) {
	        	if(i == nums.length) {
	        		return i-1;
	        	}
	        	tracker = i;
	            
	        }
	        else if(tracker >-1 && nums[i]!=nums[tracker])
	        {
	          nums[tracker] = nums[tracker] + nums[i];
	            nums[i] = nums[tracker] - nums[i];
	            nums[tracker] = nums[tracker] - nums[i]; 
	            tracker = i;
	            System.out.println(tracker);
	        }
	        else
            {
                tracker = i+1;
            }
	        
	    }
	    return tracker;
	}
}
