package com.problems;



public class ListCycle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListCycle l = new ListCycle();
    	ListNode node = new ListNode(2);
    	
    	ListNode node1 = new ListNode(3);
    	node.next = node1;
    	
    	ListNode node2 = new ListNode(4);
    	node1.next = node2;
    	ListNode node3 = new ListNode(5);
    	node2.next = node3;
    	//ListNode node4 = new ListNode(5);
    	node3.next = null;
    	System.out.println(l.hasCycle(node));
	}

	private Boolean hasCycle(ListNode node) {
		// TODO Auto-generated method stub
		ListNode temp = node;
		ListNode prev = node;
		while(temp!=null && temp.next!=null) {
			if(temp.next == node)
			{
				return true;
			}
			else
			{
				temp = temp.next;
				prev.next = node;
				prev = temp;
			}
		}
		return false;
	}

}
class ListNode {
    int val;
   ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }