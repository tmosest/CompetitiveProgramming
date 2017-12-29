package com.tmosest.competitiveprogramming.hackerearth.graphs.dfs;

import java.util.ArrayList;
import java.util.Scanner;

public class TreeQuery {

  public static boolean debugMode = false;

  /**
   * Determines the number of sinks in a graph or reversed graph.
   *
   * @return number of sinks.
   */
  public static int solve() {
    Scanner in = new Scanner(System.in);
    int nodes = in.nextInt();
    int edges = in.nextInt();
    DiGraph normal = new DiGraph(nodes);
    DiGraph reversed = new DiGraph(nodes);
    for (int i = 0; i < edges; i++) {
      int node1 = in.nextInt() - 1;
      int node2 = in.nextInt() - 1;
      normal.addEdge(node1, node2);
      reversed.addEdge(node2, node1);
    }
    return Math.max(normal.getSinkCount(), reversed.getSinkCount());
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }

  private static class DiGraph {

    int nodes;
    int edges;
    ArrayList<Integer>[] adj;

    public DiGraph(int nodes) {
      this.nodes = nodes;
      edges = 0;
      adj = (ArrayList<Integer>[]) new ArrayList[nodes];
      for (int n = 0; n < nodes; n++) {
        adj[n] = new ArrayList<Integer>();
      }
    }

    public void addEdge(int to, int from) {
      edges++;
      adj[to].add(from);
    }

    public Iterable<Integer> adj(int node) {
      return adj[node];
    }

    public int nodes() {
      return nodes;
    }

    public int getSinkCount() {
      int sinkCount = 0;
      for (int i = 0; i < adj.length; i++) {
        if (adj[i].size() == 0) {
          sinkCount++;
        }
      }
      return sinkCount;
    }
  }
}
