package com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.dfs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class HappyVertices {

  public static boolean debugMode = false;

  /**
   * Function to count the number of happy children in a graph.
   *
   * @return Count of happy children.
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
    return dfs.getHappyCount();
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }

  private static class DepthFirstSearch {

    boolean[] marked;
    int happyCount;

    public DepthFirstSearch(Graph graph) {
      marked = new boolean[graph.nodes()];
      happyCount = 0;
      for (int n = 0; n < marked.length; n++) {
        dfs(graph, n);
      }
    }

    private void dfs(Graph graph, int source) {
      Stack<Integer> stack = new Stack<Integer>();
      // marked[source] = true;
      stack.add(source);
      while (!stack.empty()) {
        int parent = stack.pop();
        int parentChildrenSize = graph.adj(parent).size();
        for (int child : graph.adj(parent)) {
          if (!marked[child]) {
            int childChildrenSize = graph.adj(child).size();
            if (childChildrenSize > parentChildrenSize) {
              happyCount++;
            }
            marked[child] = true;
            stack.add(child);
          }
        }
      }
    }

    public int getHappyCount() {
      return happyCount;
    }
  }

  private static class Graph {

    int nodes;
    int edges;
    ArrayList<Integer>[] adj;

    public Graph(int nodes) {
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

    public ArrayList<Integer> adj(int node) {
      return adj[node];
    }
  }
}
