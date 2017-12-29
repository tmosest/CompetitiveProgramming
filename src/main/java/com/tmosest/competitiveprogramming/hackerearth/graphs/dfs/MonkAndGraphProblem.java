package com.tmosest.competitiveprogramming.hackerearth.graphs.dfs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * <h1>Hacker Earth: Depth First Search: Depth First Search</h1> <h2>name: Monk and Graph
 * Problem</h2> <p>max score: 20pts</p> <p>link: https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/monk-and-graph-problem/</p>
 */
public class MonkAndGraphProblem {

  public static boolean debugMode = false;

  /**
   * Scans in graph and outputs the # of edges in the largest connected component.
   *
   * @return number of edges in largest component.
   */
  public static int solve() {
    Scanner in = new Scanner(System.in);
    int nodes = in.nextInt();
    int edges = in.nextInt();
    Graph graph = new Graph(nodes);
    for (int e = 0; e < edges; e++) {
      graph.addEdge(in.nextInt() - 1, in.nextInt() - 1);
    }
    in.close();
    DepthFirstSearch dfs = new DepthFirstSearch(graph);
    return dfs.getMaxComponentLength();
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }

  private static class DepthFirstSearch {

    private boolean[] marked;
    private int maxComponentLength;

    DepthFirstSearch(Graph graph) {
      marked = new boolean[graph.nodes()];
      maxComponentLength = Integer.MIN_VALUE;
      for (int n = 0; n < marked.length; n++) {
        if (!marked[n]) {
          dfs(graph, n);
        }
      }
    }

    private void dfs(Graph graph, int source) {
      if (marked[source]) {
        maxComponentLength = Math.max(0, maxComponentLength);
        return;
      }
      int components = 0;
      Stack<Integer> stack = new Stack<Integer>();
      marked[source] = true;
      stack.add(source);
      while (!stack.empty()) {
        int node = stack.pop();
        for (int link : graph.adj(node)) {
          components++;
          if (!marked[link]) {
            stack.add(link);
            marked[link] = true;
          }
        }
      }
      maxComponentLength = Math.max(components / 2, maxComponentLength);
    }

    public int getMaxComponentLength() {
      return maxComponentLength;
    }
  }

  private static class Graph {

    int nodes;
    int edges;
    ArrayList<Integer>[] adj;

    Graph(int nodes) {
      this.nodes = nodes;
      edges = 0;
      adj = (ArrayList<Integer>[]) new ArrayList[nodes];
      for (int n = 0; n < nodes; n++) {
        adj[n] = new ArrayList<Integer>();
      }
    }

    public void addEdge(int node1, int node2) {
      edges++;
      adj[node1].add(node2);
      adj[node2].add(node1);
    }

    public int nodes() {
      return nodes;
    }

    public Iterable<Integer> adj(int node) {
      return adj[node];
    }
  }
}
