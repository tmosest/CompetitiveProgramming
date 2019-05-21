package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class CloneGraph {

  /* Write code here. */
  private Map<Node, Node> map;
  private Set<Node> deepCloned;

  /**
   * Create a deep copy of a simple graph.
   *
   * @param node String node in the graph.
   * @return The starting node of the deep copy.
   */
  public Node cloneGraph(Node node) {
    map = new HashMap<>();
    deepCloned = new HashSet<>();
    dfsClone(node);
    cloneNeighbors(node);
    return map.get(node);
  }

  private void dfsClone(Node node) {
    if (map.containsKey(node)) {
      return;
    }
    map.put(node, new Node(node.val, null));
    for (Node neighbor : node.neighbors) {
      dfsClone(neighbor);
    }
  }

  private void cloneNeighbors(Node node) {
    if (deepCloned.contains(node)) {
      return;
    }
    deepCloned.add(node);
    Node clone = map.get(node);
    clone.neighbors = new ArrayList<>();
    for (Node neighbor : node.neighbors) {
      clone.neighbors.add(map.get(neighbor));
      cloneNeighbors(neighbor);
    }
  }

  public static class Node {

    public int val;
    public List<Node> neighbors;

    /**
     * Create an empty graph node.
     */
    public Node() {
    }

    /**
     * Creates a node in the graph.
     *
     * @param val Value for the node.
     * @param neighbors The list of neighbors.
     */
    public Node(int val, List<Node> neighbors) {
      this.val = val;
      this.neighbors = neighbors;
    }
  }


}
