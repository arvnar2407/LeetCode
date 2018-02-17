package com.problems;

public class Atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "-2147483648";
		 System.out.println(myAtoi(str));
	}
	public static int myAtoi(String str) {
	    
        if(str.length() ==0)
            return 0;
        str = str.trim();
        
        long num=0;
        for(int i=0;i<str.length();i++) {
            int temp;
            if((str.charAt(i) == '+' || str.charAt(i) == '-')&& i==0 ) {
                continue;
            }
            temp = (int) str.charAt(i);
        
            if((temp - 48) <=9 && (temp-48)>=0) {
                 num = (long)(num * 10 + (temp-48));
	                if(num > Integer.MAX_VALUE)
	                    return Integer.MAX_VALUE;
	                else if (num < Integer.MIN_VALUE)
	                	return Integer.MIN_VALUE;
            }
            
            else {
                if(str.charAt(0)=='-')
                    return (int)num*-1;
                
                return (int)num;
            }
        }
        if(str.charAt(0)=='-')
                    return (int)num*-1;
        return (int)num;
   
    }

}
