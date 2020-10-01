package org.harish.datastructure.graph;

public class Graph {

    class Edge {
	int source, destination, weight;

	Edge() {
	    source = destination = weight = 0;
	}
    }

    int V, E;
    Edge edges[];

    Graph(int v, int e) {
	V = v;
	E = e;
	for (int i = 0; i < e; i++) {
	    edges[i] = new Edge();
	}
    }

    public int getV() {
	return V;
    }

    public void setV(int v) {
	V = v;
    }

    public int getE() {
	return E;
    }

    public void setE(int e) {
	E = e;
    }

    public Edge[] getEdges() {
	return edges;
    }

    public void setEdges(Edge[] edges) {
	this.edges = edges;
    }

    public static void main(String[] args) {
	int V = 5; // Number of vertices in Graph
	int E = 8; // Number of edges in Graph

	Graph graph = new Graph(V, E);
	// https://www.geeksforgeeks.org/bellman-ford-algorithm-dp-23/
	// add edge 0-1 (or A-B in above figure)
	graph.edges[0].source = 0;
	graph.edges[0].destination = 1;
	graph.edges[0].weight = -1;

	// add edge 0-2 (or A-C in above figure)
	graph.edges[1].source = 0;
	graph.edges[1].destination = 2;
	graph.edges[1].weight = 4;

    }
}
