package com.TreeBasic;

public class Programs {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	    Node root=null;
		Operations a = new Operations();
		    root = a.insert(root, 8);
		    root = a.insert(root, 3);
		    root = a.insert(root, 6);
		    root = a.insert(root, 10);
		    root = a.insert(root, 4);
		    root = a.insert(root, 7);
		    root = a.insert(root, 1);
		    root = a.insert(root, 14);
		    root = a.insert(root, 13);
		    a.inorder(root);
		    System.out.println();
		    a.preOrder(root);
		    System.out.println();
		    a.postOrder(root);
		    System.out.println();
		    System.out.println(a.isValueExit(root, 9));

	}

}
