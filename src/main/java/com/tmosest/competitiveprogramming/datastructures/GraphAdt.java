package com.tmosest.competitiveprogramming.datastructures;

/**
 * Graph Interface.
 */
public interface GraphAdt {

  /**
   * Add a new edge to the graph.
   *
   * @param firstNode First node to add.
   * @param secondNode Second node to add.
   */
  void addEdge(int firstNode, int secondNode);

  /**
   * Iterate over the adjacency list of a node.
   *
   * @param node Index of the node to get.
   * @return The adjacency matrix of that node.
   */
  Iterable<Integer> adj(int node);

  /**
   * Number of vertices.
   *
   * @return Number of nodes.
   */
  int nodes();

  /**
   * Number of edges.
   *
   * @return Number of nodes.
   */
  int edges();
}
