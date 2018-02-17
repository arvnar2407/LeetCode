package com.problems;

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
public class Symmetric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1,2,2,null,3,null,3
			TreeNode node = new TreeNode(1);
			node.left= new TreeNode(2);
			node.right = new TreeNode(2);
			node.left.left = null;
			node.left.right = new TreeNode(3);
			node.right.right = new TreeNode(3);
			System.out.println(isSymmetric(node));
	}
	  public static boolean isSymmetric(TreeNode root) {
	        
	        if(root!=null)
	        {
	            return isMirror(root.left,root.right);
	        }
	        return true;
	    }
	    public static Boolean isMirror(TreeNode p,TreeNode q) {
	        if(p == null && q== null)
	        {
	            return true;
	            
	        }
	        if(p== null || q== null)
	        {
	            return false;
	        }
	        if(p.val == q.val && isMirror(p.left,q.right) && isMirror(p.right,q.left))
	        {
	            return true;
	        }
	        return false;
	    }
}


