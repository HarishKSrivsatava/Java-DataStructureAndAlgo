package org.harish.algorithms.searching;

// Given a sorted array of integer in non-decreasing order

public class BinarySearch {

    // Iterative approach
    public int binarySearchIterative(int[] a, int data) {
	int low = 0, high = a.length - 1;
	while (low <= high) {
	    int mid = low + (high - low) / 2;
	    if (a[mid] == data)
		return mid;
	    else if (a[mid] < data)
		low = mid + 1;
	    else
		high = mid - 1;
	}
	return -1;
    }

    // Recursive Approach
    public int binarySearchRecursive(int[] a, int data, int low, int high) {

	int mid = low + (high - low) / 2;
	if (low > high)
	    return -1;
	if (mid > a.length - 1)
	    return -1; // To handle overflow
	if (a[mid] == data)
	    return mid;
	else if (a[mid] > data)
	    return binarySearchRecursive(a, data, low, (mid - 1));
	else
	    return binarySearchRecursive(a, data, (mid + 1), high);
    }

    public void print(int a[]) {
	for (int i = 0; i < a.length; i++) {
	    System.out.print(a[i] + " ");
	}
    }

    public static void main(String[] args) {
	int[] a = { 10, 31, 33, 34, 45, 56 }; // declare an array with
					      // initialization
	int data = 56;
	BinarySearch binarySearch = new BinarySearch();
	binarySearch.print(a);
	System.out.println("\nBinary Search (Iterative Approach)");
	int binarySearchIterative = binarySearch.binarySearchIterative(a, data);
	if (binarySearchIterative != -1)
	    System.out.println("Found at position : " + (binarySearchIterative + 1));
	else
	    System.out.println("Not Found");

	System.out.println("\nBinary Search (Recursive Approach)");
	int binarySearchRecursive = binarySearch.binarySearchRecursive(a, data, 0, (a.length));
	if (binarySearchRecursive != -1)
	    System.out.println("Found at position : " + (binarySearchRecursive + 1));
	else
	    System.out.println("Not Found");
    }
}
