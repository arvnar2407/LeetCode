package com.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Stack {

    /** initialize your data structure here. */
    HashMap map = new HashMap();
    int top =-1; int min = Integer.MAX_VALUE,minIndex =-1;
    public Stack() {
        
    }
    
    public void push(int x) {
        if(x < min) {
            min = x;
            minIndex= top+1;
        }
        top = top+1;
        map.put(top, x);
    }
    
    public void pop() {
        
        map.remove(top);
        top--;
    }
    
    public int top() {
        
        int temp = (int)map.get(top);
        return temp;
    }
    
    public int getMin() {
        if(map.containsKey(minIndex)){
        	return min;
        	}
        else
        {
        	min = Integer.MAX_VALUE;
        	Set set = map.keySet();
        	Iterator iter = set.iterator();
        	
        	while(iter.hasNext()) {
        		int temp = (int) map.get(iter.next());
        		if(temp < min)
        			min = temp;
        	}
        }
        return min;
    }
    public static void main(String[] args) {
    	
    	 // Your MinStack object will be instantiated and called as such:
    	  Stack obj = new Stack();
    	  obj.push(5);
    	  obj.push(4);
    	  obj.pop();
    	  int param_3 = obj.top();
    	  int param_4 = obj.getMin();
    	  System.out.println(param_3 + "" + param_4);
    	 
    }
}

