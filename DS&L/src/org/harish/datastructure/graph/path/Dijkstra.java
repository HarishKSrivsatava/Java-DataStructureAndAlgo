package org.harish.datastructure.graph.path;

import org.harish.datastructure.graph.Graph;

/**
 * @author Harish Kumar Dijkstra algorithm is about finding the single source's
 *         shortest path in graph.
 * 
 */
public class Dijkstra {

    void dijkstra(Graph graph, int source) {
	int v = graph.getV();
	/**
	 * Output array dis[]. dis[i] will hold the distance of vertex i from
	 * source
	 */
	int dist[] = new int[v];
	/**
	 * Use an array for identity the already visited vertices. Initialize
	 * this array with empty.
	 */
	Boolean vistedSet[] = new Boolean[v];
	/**
	 * Initialize this distance array. Note: The distance with source from
	 * itself would be zero , for other user infinite for initialization
	 */
	for (int i = 0; i < v; i++) {
	    if (i != source) {
		dist[i] = Integer.MAX_VALUE;
		vistedSet[i] = false;
	    } else {
		dist[i] = 0;
	    }
	}

    }
}
