package org.harish.datastructure.graph;

public class GraphRepresentedAsAdjacenyMatrix {

    private boolean adjMatrix[][];
    private int vertexCount;

    // Constructor
    public GraphRepresentedAsAdjacenyMatrix(int vertexCount) {
	this.vertexCount = vertexCount;
	this.adjMatrix = new boolean[vertexCount][vertexCount];
    }

    public void addEdge(int i, int j) {
	if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount) {
	    adjMatrix[i][j] = true;
	    adjMatrix[j][i] = true;
	    System.out.println("Edge added between : (" + i + "," + j + ") and (" + j + "," + i + ")");
	}
    }

    public void removeEdge(int i, int j) {
	if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount) {
	    adjMatrix[i][j] = false;
	    adjMatrix[j][i] = false;
	}
    }

    public boolean isEdge(int i, int j) {
	if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount) {
	    return adjMatrix[i][j];
	} else
	    return false;
    }

    public static void main(String[] args) {
	GraphRepresentedAsAdjacenyMatrix graph = new GraphRepresentedAsAdjacenyMatrix(4);
	boolean isEdge = graph.isEdge(1, 2);
	System.out.println("Is Edge ? : " + isEdge);
	graph.addEdge(1, 2);
	graph.isEdge(1, 2);
	System.out.println("Is Edge ? :" + graph.isEdge(2, 1));

    }
}
