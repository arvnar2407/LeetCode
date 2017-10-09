package com.circle;

public class CicrcleTest {
	public static void main(String args[])
	{
		String arr = "UDUR";
		Boolean result = isCircle(arr);
		
	}
	public static Boolean isCircle(String array) {
		
		int x=0,y=0;
		for(int i=0;i<array.length();i++)
		{
			if(array.charAt(i)=='U'){
				y++;
			}
			else if(array.charAt(i)=='D')
			{
				y--;
			}
			else if(array.charAt(i)=='R')
			{
				x++;
			}
			else if(array.charAt(i)=='L')
			{
				x--;
			}
		
		}
		if(x == 0 && y==0)
			return true;
		else
			return false;
		
		
	}
}
