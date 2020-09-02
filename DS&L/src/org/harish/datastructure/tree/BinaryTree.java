package org.harish.datastructure.tree;


/*
 * 
 *   				  1    <-- root
     				/   \
    			  2       3  
                 /   
               4
 */
public class BinaryTree {

	private BTNode root;
	
	public BinaryTree(){
		root = null;
	}
	public BinaryTree(int data){
		root = new BTNode(data);
	}
	
	
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
		
		
	}
	
}
