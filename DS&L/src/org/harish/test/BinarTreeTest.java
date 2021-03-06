package org.harish.test;

class BinaryNode {
    private int info;
    private BinaryNode left, right;

    public BinaryNode getLeft() {
	return left;
    }

    public void setLeft(BinaryNode left) {
	this.left = left;
    }

    public BinaryNode getRight() {
	return right;
    }

    public void setRight(BinaryNode right) {
	this.right = right;
    }

    public BinaryNode(int info) {
	super();
	this.info = info;
    }

    public int getInfo() {
	return info;
    }

    public void setInfo(int info) {
	this.info = info;
    }

}

public class BinarTreeTest {

    public BinaryNode generateBT() {
	BinaryNode root = new BinaryNode(10);
	root.setLeft(new BinaryNode(20));
	root.setRight(new BinaryNode(30));
	root.getLeft().setLeft(new BinaryNode(40));
	root.getLeft().setRight(new BinaryNode(50));
	root.getRight().setLeft(new BinaryNode(60));
	root.getRight().setRight(new BinaryNode(70));

	return root;
    }

    public void preOrderTraversal(BinaryNode node) {
	if (null != node) {
	    System.out.print(node.getInfo() + " ");
	    preOrderTraversal(node.getLeft());
	    preOrderTraversal(node.getRight());
	}
    }

    public static void main(String[] args) {
	BinarTreeTest bt = new BinarTreeTest();
	BinaryNode root = bt.generateBT();
	bt.preOrderTraversal(root);
    }
}
