package com.problems;

class Solution {
    public int trap(int[] height) {
        
        int ltallest[] = new int[height.length];
        int rtallest[] = new int[height.length];
        int max=0;
        for(int i=0;i<height.length;i++) {
            
            if(i==0)
            {
                ltallest[i] = -1;
                max = height[i];
                continue;
            }
            ltallest[i] = max;
            if(height[i] > max) {
                max = height[i];
            }
            
        }
        for(int i=height.length-1; i>=0;i--)
        {
            if(i==height.length-1)
            {
                rtallest[i] = -1;
                max = height[i];
                continue;
            }
            rtallest[i] = max;
            if(height[i] > max) {
                max = height[i];
            }
            
        }
        for(int i=0;i<height.length;i++) {
            int min = Math.min(ltallest[i],rtallest[i]);
            if(min <= 0){
                ltallest[i] = 0;
                continue;
            }
            ltallest[i] = Math.min(ltallest[i],rtallest[i]) - height[i];
        }
        max=0;
        for(int i=0;i<ltallest.length;i++) {
            
        	max = max + ltallest[i];
        }
        return max;
    }
    
}

public class TrapWater {
	public static void main(String[] args) {
		Solution s = new Solution();
		int height[] = {5,4,1,2};
		s.trap(height);
	}
}