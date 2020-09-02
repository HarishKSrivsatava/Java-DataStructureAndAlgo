package org.harish.datastructure.tree;

import java.util.ArrayList;

/*
*   				  1    <-- root
*     				/   \
*    			   2     3  
*                 /   
*                4
*/

public class BinaryTreeTest {
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
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
		System.out.print("Preorder  Traversal(Recursive) :");
		bt.preOrderTraversalRecursive(bt.root);
		System.out.print("\nInorder   Traversal(Recursive) :");
		bt.inOrderTraversalRecursive(bt.root);
		System.out.print("\nPostorder Traversal(Recursive) :");
		bt.postOrderTraversalRecursive(bt.root);
		
		System.out.print("\nPreorder Traversal(Iterative) :");
		ArrayList<Integer> preOrderTraversalIterative = bt.preOrderTraversalIterative(bt.root);
		for (Integer item : preOrderTraversalIterative) {
			System.out.print(item + " ");
		}
		
	}
}
