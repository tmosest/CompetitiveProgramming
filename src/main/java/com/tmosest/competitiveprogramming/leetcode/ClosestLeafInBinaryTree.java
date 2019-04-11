package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ClosestLeafInBinaryTree {

  /**
   * Find the value of the leaf that is closest (distance) to the node given.
   * @param root The root of the tree.
   * @param search The value of the node to search from.
   * @return The value of the closest leaf (distance).
   */
  public int findClosestLeaf(TreeNode root, int search) {
    List<Node> nodes = createGraph(root);
    for (Node node : nodes) {
      if (node.val == search) {
        // perform bfs
        boolean[] visited = new boolean[nodes.size()];
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
          Node runner = queue.poll();
          if (runner.isLeaf) {
            return runner.val;
          }
          for (Node neighbor : runner.neighbors) {
            if (!visited[neighbor.id]) {
              queue.add(neighbor);
            }
          }
          visited[runner.id] = true;
        }
      }
    }
    return -1;
  }

  private class Node {
    private int id;
    private int val;
    private boolean isLeaf;
    private ArrayList<Node> neighbors;

    private Node(int id, int val, boolean isLeaf) {
      this.id = id;
      this.val = val;
      this.isLeaf = isLeaf;
      neighbors = new ArrayList<>();
    }
  }

  private List<Node> createGraph(TreeNode root) {
    List<Node> nodes = new ArrayList<>();
    createGraph(root, null, nodes);
    return nodes;
  }

  private void createGraph(TreeNode root, Node parent, List<Node> nodes) {
    if (root == null) {
      return;
    }
    boolean isLeaf = root.left == null && root.right == null;
    Node node = new Node(nodes.size(), root.val, isLeaf);
    if (parent != null) {
      node.neighbors.add(parent);
      parent.neighbors.add(node);
    }
    nodes.add(node);
    createGraph(root.left, node, nodes);
    createGraph(root.right, node, nodes);
  }
}
