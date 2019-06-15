package com.tmosest.competitiveprogramming.utils.graph;

import com.tmosest.competitiveprogramming.utils.tree.UtilTreeNode;

import java.util.ArrayList;
import java.util.List;

public class UtilGraph<T> {

  // The nodes in the UtilGraph.
  public List<UtilGraphNode<T>> nodes = new ArrayList<>();

  /**
   * Create a UtilGraph from a tree.
   *
   * @param root The root of the tree.
   */
  public UtilGraph(UtilTreeNode<T> root) {
    createFromTree(root, null);
  }

  /**
   * Create a graph from a list of node values and edges.
   *
   * @param values The values of edge node.
   * @param edges An array of edges.
   */
  public UtilGraph(List<T> values, int[][] edges) {
    for (int i = 0; i < values.size(); i++) {
      T val = values.get(i);
      UtilGraphNode<T> node = new UtilGraphNode<>(i, val);
      nodes.add(node);
    }
    for (int[] edge : edges) {
      nodes.get(edge[0]).neighbors.add(nodes.get(edge[1]));
      nodes.get(edge[1]).neighbors.add(nodes.get(edge[0]));
    }
  }

  private void createFromTree(UtilTreeNode<T> root, UtilGraphNode<T> parent) {
    if (root == null) {
      return;
    }
    UtilGraphNode<T> node = new UtilGraphNode<>(nodes.size(), root.val);
    if (parent != null) {
      node.neighbors.add(parent);
      parent.neighbors.add(node);
    }
    nodes.add(node);
    createFromTree(root.left, node);
    createFromTree(root.right, node);
  }

  /**
   * Create a UtilBreathFirstSearch iterator class from the string point of the utilGraph.
   *
   * @param start The starting point for Breath First Search.
   * @return An iteration of bfs over a graph.
   */
  public UtilBreathFirstSearch<T> breathFirstSearch(UtilGraphNode<T> start) {
    return new UtilBreathFirstSearch<>(this, start);
  }

  /**
   * Find the first node with the value.
   *
   * @param val The value of the node we are searching for.
   * @return A node of the utilGraph with the search value or null.
   */
  public UtilGraphNode<T> find(T val) {
    for (UtilGraphNode<T> node : nodes) {
      if (node.val == val) {
        return node;
      }
    }
    return null;
  }

  /**
   * Determine how many components are in this graph.
   *
   * @return The number of connected components.
   */
  public int countConnetedComponents() {
    // Keep track of all the visited nodes.
    boolean[] visited = new boolean[nodes.size()];
    int count = 0;
    for (UtilGraphNode<T> node : nodes) {
      if (visited[node.id]) {
        continue;
      }
      ++count;
      visited[node.id] = true;
      for (UtilGraphNode<T> neighbor : breathFirstSearch(node)) {
        visited[neighbor.id] = true;
      }
    }
    return count;
  }
}
