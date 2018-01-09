package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.GraphAdt;

public class UndirectedGraph implements GraphAdt {

  private int nodes;
  private int edges;
  private ArrayList<Integer>[] adj;

  /**
   * Create a new undirected graph with no edges.
   *
   * @param nodes How many vertices or nodes.
   */
  public UndirectedGraph(int nodes) {
    this.nodes = nodes;
    edges = 0;
    adj = (ArrayList<Integer>[]) new ArrayList[nodes];
    for (int n = 0; n < nodes; n++) {
      adj[n] = new ArrayList<Integer>();
    }
  }

  /**
   * Add a new edge to the graph.
   *
   * @param firstNode First node to add.
   * @param secondNode Second node to add.
   */
  public void addEdge(int firstNode, int secondNode) {
    edges++;
    adj[firstNode].add(secondNode);
    adj[secondNode].add(firstNode);
  }

  /**
   * Iterate over the edges connected to the node.
   *
   * @param node Index of the node to get.
   * @return Iterable Array List.
   */
  public Iterable<Integer> adj(int node) {
    return adj[node];
  }

  /**
   * Number of edges.
   *
   * @return The number of edges.
   */
  public int edges() {
    return edges;
  }

  /**
   * Number of nodes.
   *
   * @return The number of nodes.
   */
  public int nodes() {
    return nodes;
  }

}
