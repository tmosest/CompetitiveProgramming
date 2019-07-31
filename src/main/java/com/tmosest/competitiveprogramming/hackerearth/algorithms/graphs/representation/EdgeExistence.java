package com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.representation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EdgeExistence {

  public static boolean debugMode = false;

  /**
   * Function to test.
   *
   * @return String array.
   */
  public static String[] solve() {
    Scanner in = new Scanner(System.in);
    int nodes = in.nextInt();
    int edges = in.nextInt();
    if (debugMode) {
      System.out.println("nodes: " + nodes + " edges: " + edges);
    }
    Graph graph = new Graph(nodes);
    for (int e = 0; e < edges; e++) {
      graph.addEdge(in.nextInt() - 1, in.nextInt() - 1);
    }
    int queries = in.nextInt();
    String[] results = new String[queries];
    for (int q = 0; q < queries; q++) {
      results[q] = graph.hasEdge(in.nextInt() - 1, in.nextInt() - 1) ? "YES" : "NO";
      if (debugMode) {
        System.out.println("search: " + q + " result: " + results[q]);
      }
    }
    in.close();
    return results;
  }

  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }

  private static class Graph {

    private ArrayList<Integer>[] adj;

    public Graph(int nodes) {
      adj = (ArrayList<Integer>[]) new ArrayList[nodes];
      for (int v = 0; v < nodes; v++) {
        adj[v] = new ArrayList<Integer>();
      }
    }

    public void addEdge(int node1, int node2) {
      adj[node1].add(node2);
      adj[node2].add(node1);
    }

    public boolean hasEdge(int node1, int node2) {
      for (int x : adj[node1]) {
        if (x == node2) {
          return true;
        }
      }
      return false;
    }
  }
}
