package org.harish.datastructure.graph;

import java.util.ArrayList;

/**
 * 
 * @author Harish Kumar 0-----1 | /| \ | / | 2 | / | / | / | / 4-----3
 */
public class GraphRepresentedAsAdjacenyList {

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
	adj.get(u).add(v);
	adj.get(v).add(u);// Since this is a undirected graph
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> adj) {
	for (int i = 0; i < adj.size(); i++) {
	    System.out.print("Adjaceny List of vertex " + i + ": ");
	    for (Integer item : adj.get(i)) {
		System.out.print(item + " ");
		;
	    }
	    System.out.print("\n");
	}
    }

    public static void main(String[] args) {
	// create a graph with 5 vertices
	int V = 5;
	ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
	for (int i = 0; i < V; i++) {
	    adj.add(new ArrayList<Integer>());
	}

	// Now add edge one by one
	addEdge(adj, 0, 1);
	addEdge(adj, 0, 4);
	addEdge(adj, 1, 2);
	addEdge(adj, 1, 3);
	addEdge(adj, 1, 4);
	addEdge(adj, 2, 3);
	addEdge(adj, 3, 4);

	printGraph(adj);

    }
}
