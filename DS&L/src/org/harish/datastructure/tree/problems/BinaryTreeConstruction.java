package org.harish.datastructure.tree.problems;

import org.harish.datastructure.tree.BTNode;
import org.harish.datastructure.tree.BinaryTreeTraversal;


/*
*   				  1    <-- root
*     				/   \
*    			   2     3  
*                 /   
*                4
*/


public class BinaryTreeConstruction {
	public BinaryTreeTraversal constructBT(){
		BinaryTreeTraversal bt = new BinaryTreeTraversal();
	// create root node
	bt.root = new BTNode(1);
	 /* following is the tree after above statement 
    			1 
  			  /   \ 
			null  null     */
	bt.root.setLeft(new BTNode(2));
	bt.root.setRight(new BTNode(3));
	/* 2 and 3 become left and right children of 1 
    				1 
  				/      \ 
               2        3 
             /    \    /  \ 
           null null null null  */
	
	bt.root.getLeft().setLeft(new BTNode(4));
	bt.root.getLeft().setRight(new BTNode(5));
	
	return bt;
	}
}
