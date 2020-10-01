package org.harish.datastructure.tree.problems;

import org.harish.datastructure.tree.BTNode;

public class BinaryTreeProb {

    // Find the maximum element in the binary tree
    public int maxInBinaryTree(BTNode root) {
	int maxValue = Integer.MIN_VALUE;
	if (null != root) {
	    int leftMaxValue = maxInBinaryTree(root.getLeft());
	    int rightMaxValue = maxInBinaryTree(root.getRight());
	    if (leftMaxValue > rightMaxValue)
		maxValue = leftMaxValue;
	    else
		maxValue = rightMaxValue;
	    if (root.getData() > maxValue)
		maxValue = root.getData();
	}
	return maxValue;
    }

    public int findMaxWithRecursion(BTNode roo) {
	int maxValue = Integer.MIN_VALUE;

	return maxValue;
    }
}
