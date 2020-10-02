package org.harish.algorithms.searching;

// Given an sorted array of integer in increasing order.

public class OrderedLinearSearch {

    public int orderedSearch(int[] a, int data) {
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == data)
		return i;
	    else if (a[i] > data)
		return -1;
	}
	return -1;
    }

    public void print(int a[]) {
	for (int i = 0; i < a.length; i++) {
	    System.out.print(a[i] + " ");
	}
    }

    public static void main(String[] args) {
	int[] a = new int[5]; // declare an array
	// initialization of array
	for (int i = 0; i < a.length; i++) {
	    a[i] = i;
	}
	OrderedLinearSearch ols = new OrderedLinearSearch();
	ols.print(a);
	int orderedSearch = ols.orderedSearch(a, 8);
	if (orderedSearch != -1)
	    System.out.println("\nFound at index : " + orderedSearch);
	else
	    System.out.println("\nNot Found");

    }
}
