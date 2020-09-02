package org.harish.datastructure.tree;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTree {
		public BTNode root;
		public BinaryTree(){
			root = null;
		}
		public BinaryTree(int data){
			root = new BTNode(data);
		}
		
		public void preOrderTraversalRecursive(BTNode node){
			if(null != node){
				System.out.print(node.getData() + " ");
				preOrderTraversalRecursive(node.getLeft());
				preOrderTraversalRecursive(node.getRight());
			}
		}
		
		public void inOrderTraversalRecursive(BTNode node){
			if(null != node){
				inOrderTraversalRecursive(node.getLeft());
				System.out.print(node.getData()+ " ");
				inOrderTraversalRecursive(node.getRight());
			  }
			}
		public void postOrderTraversalRecursive(BTNode node){
				if(null != node){
					postOrderTraversalRecursive(node.getLeft());
					postOrderTraversalRecursive(node.getRight());
					System.out.print(node.getData()+ " ");
					
				}
		}
		
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
	
}
