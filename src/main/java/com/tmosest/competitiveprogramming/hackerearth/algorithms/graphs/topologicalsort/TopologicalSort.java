package com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.topologicalsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class TopologicalSort {

  public static boolean debugMode = false;

  /**
   * Scan in a directed graph.
   *
   * @return Return topological order of that graph.
   */
  public static int[] solve() {
    Scanner in = new Scanner(System.in);
    int nodes = in.nextInt();
    int edges = in.nextInt();
    DiGraph graph = new DiGraph(nodes);
    for (int e = 0; e < edges; e++) {
      graph.addEdge(in.nextInt() - 1, in.nextInt() - 1);
    }
    in.close();
    DepthFirstOrder dfs = new DepthFirstOrder(graph);
    return dfs.reversePost();
  }

  /**
   * Function to print results.
   *
   * @param args Main string array.
   */
  public static void main(String[] args) {
    Arrays.stream(solve()).forEach((index) -> {
      System.out.print(index + " ");
    });
  }

  private static class DepthFirstOrder {

    Stack<Integer> reversePost;
    private boolean[] marked;

    public DepthFirstOrder(DiGraph graph) {
      reversePost = new Stack<Integer>();
      marked = new boolean[graph.nodes()];
      for (int v = 0; v < graph.nodes(); v++) {
        if (!marked[v]) {
          dfs(graph, v);
        }
      }
    }

    private void dfs(DiGraph graph, int node) {
      marked[node] = true;
      for (int child : graph.adj(node)) {
        if (!marked[child]) {
          dfs(graph, child);
        }
      }
      reversePost.push(node);
    }

    public int[] reversePost() {
      int index = 0;
      int[] order = new int[reversePost.size()];
      for (int num : reversePost) {
        order[index++] = num;
      }
      return order;
    }
  }

  private static class DiGraph {

    private int nodes;
    private int edges;
    private ArrayList<Integer>[] adj;

    public DiGraph(int nodes) {
      this.nodes = nodes;
      edges = 0;
      adj = (ArrayList<Integer>[]) new ArrayList[nodes];
      for (int n = 0; n < nodes; n++) {
        adj[n] = new ArrayList<Integer>();
      }
    }

    public void addEdge(int nodeTo, int nodeFrom) {
      edges++;
      adj[nodeTo].add(nodeFrom);
    }

    public Iterable<Integer> adj(int node) {
      return adj[node];
    }

    public int nodes() {
      return nodes;
    }
  }
}
