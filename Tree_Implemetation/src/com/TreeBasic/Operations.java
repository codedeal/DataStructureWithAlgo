package com.TreeBasic;

public class Operations 
{
	
	
	public Operations() 
	{
	 
	}
	 public Node createNode(int k) {
		    Node a = new Node();
		    a.data = k;
		    a.left = null;
		    a.right = null;
		    return a;
		  }
    
	 public Node insert(Node node, int val) {
		    if(node == null) {
		      return createNode(val);
		    }
		    
		    if(val < node.data) {
		      node.left = insert(node.left, val);
		    } else if((val > node.data)) {
		      node.right = insert(node.right, val);
		    }
		    
		    return node;
		  }
	
	 public void inorder(Node node) 
	 {
		// L Node R
		    if(node == null) {
		      return;
		    }
		    
		    inorder(node.left);
		    System.out.print(node.data + " ");
		    inorder(node.right);
	 }
	 
	 public void preOrder(Node node)
	 {
		 //Root L R
		 if(node == null) {
		      return;
		    }
		    System.out.print(node.data + " ");
		      preOrder(node.left);
		      preOrder(node.right);
	 }
	 
	 public void postOrder(Node node)
	 {
		 if(node == null) {
		      return;
		    }
		 //R L Root
		      preOrder(node.left);
		      preOrder(node.right);
		      System.out.print(node.data + " ");
	 }
	 
	 public Node lowestCommonAncestor(Node root, Node p, Node q) 
	 {
		 if(p.data<root.data&&q.data<root.data)
		 {
			return lowestCommonAncestor(root.left, p, q);
		 }
		 else if(p.data>root.data&&q.data>root.data)
		 {
			return lowestCommonAncestor(root.right, p, q);
		 }
		 else
			return root;
	    }
	 
	 public int maxDepth(Node root)
	 {
	        if(root==null)
	        	return 0;
	        int left=maxDepth(root.left);
	        int right=maxDepth(root.right);
	        
	        return Math.max(left, right)+1;
	    }
	 
	 public boolean isValueExit(Node root,int value)
	 {
		 if (root == null) return false;
		 if (root.data == value) return true;
		    if (root.data > value) return isValueExit(root.left, value);
		    return isValueExit(root.right, value);
	     
	 }
	 
	 public boolean isSymmetric(Node root) 
	 {
		 if(root==null)
			 return true;
	        return isSymetric(root.left,root.right);
	    }
	 
	private boolean isSymetric(Node left, Node right) {
		if(left==null||right==null)
			return left==right;
		if(left.data!=right.data)
			return false;
		
		return isSymetric(left.left, right.right) && isSymetric(left.right,right.left);
		
	}
}
