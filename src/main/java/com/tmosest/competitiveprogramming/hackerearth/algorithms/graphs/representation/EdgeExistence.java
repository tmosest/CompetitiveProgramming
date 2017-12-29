package com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.representation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EdgeExistence {

  public static boolean debugMode = false;

  private static class Graph {
    private ArrayList<Integer>[] adj;

    public Graph(int V) {
      adj = (ArrayList<Integer>[]) new ArrayList[V];
      for (int v = 0; v < V; v++)
        adj[v] = new ArrayList<Integer>();
    }

    public void addEdge(int v, int w) {
      adj[v].add(w);
      adj[w].add(v);
    }

    public boolean hasEdge(int v, int w) {
      for (int x : adj[v]) {
        if (x == w)
          return true;
      }
      return false;
    }
  }

  public static String[] solve() {
    Scanner in = new Scanner(System.in);
    int nodes = in.nextInt();
    int edges = in.nextInt();
    if (debugMode)
      System.out.println("nodes: " + nodes + " edges: " + edges);
    Graph g = new Graph(nodes);
    for (int e = 0; e < edges; e++) {
      g.addEdge(in.nextInt() - 1, in.nextInt() - 1);
    }
    int queries = in.nextInt();
    String[] results = new String[queries];
    for (int q = 0; q < queries; q++) {
      results[q] = g.hasEdge(in.nextInt() - 1, in.nextInt() - 1) ? "YES" : "NO";
      if (debugMode)
        System.out.println("q: " + q + " result: " + results[q]);
    }
    in.close();
    return results;
  }

  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }
}
