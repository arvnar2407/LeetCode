package com.problems;

public class LongestSubStrNoRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "anviaj";
		int max=0,count=0;
		String temp ="";
	
		for(int i=0;i<str.length();i++) {
			
			if(temp.contains(str.charAt(i)+"")) {
				
				
				//count = 0;
				temp =temp.substring(temp.indexOf(""+str.charAt(i))+1, temp.length());
				
				count = temp.length();
				i--;
				continue;
			}
			
				count++;
				temp = temp + str.charAt(i);
			
			max = Math.max(count,max);
		}
		System.out.println(temp);
		System.out.println(max);
	}

}
