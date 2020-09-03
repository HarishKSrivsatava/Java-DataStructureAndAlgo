package org.harish.datastructure.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	
	private BTNode root;
	public BTNode generateBinaryTree(){
	// create root node
	root = new BTNode(1);
	 /* following is the tree after above statement 
    			1 
  			  /   \ 
			null  null     */
	root.setLeft(new BTNode(2));
	root.setRight(new BTNode(3));
	/* 2 and 3 become left and right children of 1 
    				1 
  				/      \ 
               2        3 
             /    \    /  \ 
           null null null null  */
	
	root.getLeft().setLeft(new BTNode(4));
	root.getLeft().setRight(new BTNode(5));
	
	return root;
	
	}
	
	
	public boolean searchInBT(BTNode root, int data){
		if(root == null)
			return false;
		if(root.getData() == data)
			return true;
		return searchInBT(root.getLeft(),data) || searchInBT(root.getRight(), data);
	}
	/**
	 * 
	 * @param node
	 */
	public void preOrderTraversalRecursive(BTNode node){
		if(null != node){
			System.out.print(node.getData() + " ");
			preOrderTraversalRecursive(node.getLeft());
			preOrderTraversalRecursive(node.getRight());
		}
	}
	/**
	 * 
	 * @param node
	 */
	public void inOrderTraversalRecursive(BTNode node){
		if(null != node){
			inOrderTraversalRecursive(node.getLeft());
			System.out.print(node.getData()+ " ");
			inOrderTraversalRecursive(node.getRight());
		  }
		}
	/**
	 * 
	 * @param node
	 */
	public void postOrderTraversalRecursive(BTNode node){
			if(null != node){
				postOrderTraversalRecursive(node.getLeft());
				postOrderTraversalRecursive(node.getRight());
				System.out.print(node.getData()+ " ");
				
			}
	}
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	public ArrayList<Integer> preOrderTraversalIterative(BTNode node){
		// We need a stack to remember the current node. After processing this
		// current node we go to the left subtree, process it and again come 
		// back to the current node to get the right node.
		ArrayList<Integer> listOfData = new ArrayList<>();
		if(node == null)
			return listOfData;
		Stack<BTNode> nodeStack = new Stack<>();
		nodeStack.push(node);
		while(!nodeStack.isEmpty()){
			BTNode temp = nodeStack.pop();
			listOfData.add(temp.getData());
			// See here. We have to push first right child and then left child
			// so that while pop we will get the left child first and then right 
			// child as required in case of PreOrder Traversal.
			if(null != temp.getRight()){
				nodeStack.push(temp.getRight());
			}
			if(null != temp.getLeft()){
				nodeStack.push(temp.getLeft());
			}
		}
		return listOfData;
	}
	/**
	 * 
	 * @param node
	 * @return
	 */
	public ArrayList<Integer> postOrderTraversalIterative(BTNode node){
		ArrayList<Integer> listOfData = new ArrayList<>();
	    if(node == null){
	    	return listOfData;
	    }	
	    Stack<BTNode> nodeStack = new Stack<>();
	    nodeStack.push(node);
	    while(!nodeStack.isEmpty()){
	    	BTNode currentNode = nodeStack.peek();
	    	// TODO
	    }
	    return listOfData;
	}	
	
	/**
	 * 
	 * @param root
	 * @return
	 */
	public ArrayList<ArrayList<Integer>> levelOrderTraversal(BTNode root){
		ArrayList<ArrayList<Integer>> listOfData = new ArrayList<>();
		/*1. Visit the root
		2. While traversal level L , keep all the elements at level L+1 in queue
		3. Go to the next level and visit all the nodes at that level
		4. Repeat until all the levels are completed
		*/
		if (root == null)
			return listOfData;
		Queue<BTNode> nodeQueue = new LinkedList<>();
		nodeQueue.offer(root);
		nodeQueue.offer(null);
		ArrayList<Integer> curr = new ArrayList<>();
		while(!nodeQueue.isEmpty()){
			BTNode temp = nodeQueue.poll();
			if(temp != null){
				curr.add(temp.getData());
				if(null != temp.getLeft())
					nodeQueue.offer(temp.getLeft());
				if(null != temp.getRight())
					nodeQueue.offer(temp.getRight());
			}else{
				ArrayList<Integer> cu_curr = new ArrayList<>(curr);
				listOfData.add(cu_curr);
				curr.clear();
				if(!nodeQueue.isEmpty())
					nodeQueue.offer(null);
			}
		}
		return listOfData;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		BTNode binaryTreeRootNode = binaryTree.generateBinaryTree();
		ArrayList<Integer> preOrderTraversalIterative = binaryTree.preOrderTraversalIterative(binaryTreeRootNode);
		System.out.print("PreOrder Traversal : " );
		for (Integer item : preOrderTraversalIterative) {
			System.out.print(item + " ");
		}
		/*ArrayList<Integer> postOrderTraversalIterative = binaryTree.postOrderTraversalIterative(binaryTreeRootNode);
		System.out.print("PostOrder Traversal : " );
		for (Integer item : postOrderTraversalIterative) {
			System.out.print(item + " ");
		}*/
		System.out.print("\nLevelOrder Traversal : " );
		ArrayList<ArrayList<Integer>> levelOrderTraversal = binaryTree.levelOrderTraversal(binaryTreeRootNode);
		for (ArrayList<Integer> arrayList : levelOrderTraversal) {
			for (Integer item : arrayList) {
				System.out.print(item + " ");
			}
			
		}
		
		System.out.println("\nSearch in Binary Tree :");
		System.out.print("Is element found ? " + binaryTree.searchInBT(binaryTreeRootNode, 5));
		
	}
	

}
