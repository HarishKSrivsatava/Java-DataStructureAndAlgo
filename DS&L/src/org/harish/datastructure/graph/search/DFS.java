package org.harish.datastructure.graph.search;

import java.util.Stack;

class Vertex {
    public char label;
    public boolean visited;

    public Vertex(char label) {
	this.label = label;
	this.visited = false;
    }
}

/*
 * This algo pre-assume the adjacency matrix representation of graph.
 * 
 */
public class DFS {

    private Vertex vertexList[];
    private int adjMatrix[][];
    private int vertexCount;
    private final int maxVertexCount = 20;
    private Stack stack;

    DFS() {
	vertexList = new Vertex[maxVertexCount];
	adjMatrix = new int[maxVertexCount][maxVertexCount];
	vertexCount = 0;
	for (int i = 0; i < maxVertexCount; i++) {
	    for (int j = 0; j < maxVertexCount; j++) {
		adjMatrix[i][j] = 0;
	    }
	}
	stack = new Stack();
    }// constructor

    public void addVertex(char label) {
	vertexList[vertexCount++] = new Vertex(label);
    }

    public void addEdge(int source, int destination) {
	adjMatrix[source][destination] = 1;
	adjMatrix[destination][source] = 1; // Since this is undirected graph
    }

    public void displayVertex(int v) {
	System.out.print(vertexList[v].label + " ");
    }

    public void dfs() {
	vertexList[0].visited = true;
	displayVertex(0);
	stack.push(0);
	while (!stack.isEmpty()) {
	    // Get an unvisited vertex adjacent to stack top
	    int adjUnvisitedVertex = getAdjUnvisitedVertex((int) stack.peek());
	    if (adjUnvisitedVertex == -1) {
		stack.pop();
	    } else {
		vertexList[adjUnvisitedVertex].visited = true;
		displayVertex(adjUnvisitedVertex);
		stack.push(adjUnvisitedVertex);
	    }

	}
	// reset flag
	for (int i = 0; i < vertexCount; i++) {
	    vertexList[i].visited = false;
	}

    }

    public int getAdjUnvisitedVertex(int v) {
	for (int i = 0; i < vertexCount; i++) {
	    if (adjMatrix[v][i] == 1 && !vertexList[i].visited) {
		return i;
	    }
	}
	return -1;
    }

    public static void main(String[] args) {
	DFS graph = new DFS();
	// Adding vertices of graph
	graph.addVertex('A'); // At index 0
	graph.addVertex('B'); // At index 1
	graph.addVertex('C'); // At index 2
	graph.addVertex('D'); // At index 3
	graph.addVertex('E'); // At index 4
	// Adding vertices of graph
	graph.addEdge(0, 1); // Edge A -- B
	graph.addEdge(0, 3); // Edge A -- D
	graph.addEdge(1, 2); // Edge B -- C
	graph.addEdge(2, 0); // Edge C -- A
	graph.addEdge(2, 3); // Edge C -- D
	graph.addEdge(1, 4); // Edge B -- E
	graph.addEdge(2, 4); // Edge C -- E

	System.out.println("======== Depth Search Search (DFS) ========");
	graph.dfs();
	System.out.print("\n===========================================");
    }

}
