package org.harish.datastructure.tree;

public class BTNode {

	private int data;
	private BTNode left, right;
	public BTNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public BTNode(int data, BTNode left, BTNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BTNode getLeft() {
		return left;
	}
	public void setLeft(BTNode left) {
		this.left = left;
	}
	public BTNode getRight() {
		return right;
	}
	public void setRight(BTNode right) {
		this.right = right;
	}
	
}
