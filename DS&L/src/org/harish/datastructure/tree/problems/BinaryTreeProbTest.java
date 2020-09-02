package org.harish.datastructure.tree.problems;

import org.harish.datastructure.tree.BinaryTreeTraversal;

public class BinaryTreeProbTest {

	public static void main(String[] args) {
		BinaryTreeConstruction btc = new BinaryTreeConstruction();
		BinaryTreeTraversal bt = btc.constructBT();
		BinaryTreeProb btp = new BinaryTreeProb();
		int maxInBinaryTree = btp.maxInBinaryTree(bt.root);
		System.out.println(maxInBinaryTree);
	}
}
