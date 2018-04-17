package com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MonkAndTheIslands {

  public static boolean debugMode = false;

  /**
   * Function for testing.
   *
   * @return int[] results.
   */
  public static int[] solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    int[] results = new int[tests];
    for (int t = 0; t < tests; t++) {
      int nodes = in.nextInt();
      int edges = in.nextInt();
      Graph graph = new Graph(nodes);
      for (int e = 0; e < edges; e++) {
        graph.addEdge(in.nextInt() - 1, in.nextInt() - 1);
      }
      BreadthFirstPaths bfs = new BreadthFirstPaths(graph, 0);
      results[t] = bfs.distTo(nodes - 1);
    }
    in.close();
    return results;
  }

  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }

  private static class Graph {

    private int nodes;
    private ArrayList<Integer>[] adj;

    public Graph(int nodes) {
      this.nodes = nodes;
      adj = (ArrayList<Integer>[]) new ArrayList[nodes];
      for (int i = 0; i < nodes; i++) {
        adj[i] = new ArrayList<Integer>();
      }
    }

    public int nodes() {
      return nodes;
    }

    public void addEdge(int node1, int node2) {
      adj[node1].add(node2);
      adj[node2].add(node1);
    }

    public Iterable<Integer> adj(int node) {
      return adj[node];
    }
  }

  private static class BreadthFirstPaths {

    private static final int INFINITY = Integer.MAX_VALUE;
    private boolean[] marked;
    private int[] edgeTo;
    private int[] distTo;

    public BreadthFirstPaths(Graph graph, int source) {
      marked = new boolean[graph.nodes()];
      edgeTo = new int[graph.nodes()];
      distTo = new int[graph.nodes()];
      for (int v = 0; v < graph.nodes(); v++) {
        distTo[v] = INFINITY;
      }
      bfs(graph, source);
    }

    private void bfs(Graph graph, int source) {
      Queue<Integer> queue = new LinkedList<Integer>();
      distTo[source] = 0;
      marked[source] = true;
      queue.add(source);
      while (!queue.isEmpty()) {
        int node = queue.poll();
        for (int child : graph.adj(node)) {
          if (!marked[child]) {
            edgeTo[child] = node;
            distTo[child] = distTo[node] + 1;
            marked[child] = true;
            queue.add(child);
          }
        }
      }
    }

    public int distTo(int node) {
      return distTo[node];
    }
  }
}
