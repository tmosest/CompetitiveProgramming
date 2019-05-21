package com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ComradesI {

  public static boolean debugMode = false;

  /**
   * Function to solve the problem bro.
   *
   * @return Return a matrix containing all the results for each case.
   */
  public static int[][] solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    int[][] testResults = new int[tests][];
    for (int t = 0; t < tests; t++) {
      int nodes = in.nextInt();
      DiGraph graph = new DiGraph(nodes);
      for (int i = 0; i < nodes; i++) {
        int superior = in.nextInt();
        if (superior != 0) {
          if (debugMode) {
            System.out.println("i: " + i + " superior: " + (superior - 1));
          }
          graph.addEdge(i, superior - 1);
        }
      }
      int reviews = in.nextInt();
      int[] reviewsNeeded = new int[reviews];
      for (int r = 0; r < reviews; r++) {
        int parent = in.nextInt() - 1;
        BreadthFirstSearch bfs = new BreadthFirstSearch(graph, parent);
        int child = in.nextInt() - 1;
        int distance = bfs.getDistTo(child);
        if (debugMode) {
          System.out.println("parent: " + parent + " child: " + child + " distance: " + distance);
        }
        reviewsNeeded[r] = (distance == -1) ? -1 : distance - 1;
      }
      testResults[t] = reviewsNeeded;
    }
    return testResults;
  }

  /**
   * Main function.
   *
   * @param args Main string array.
   */
  public static void main(String[] args) {
    int[][] result = solve();
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        System.out.println(result[i][j]);
      }
    }
  }

  private static class BreadthFirstSearch {

    public static final int INFINITY = -1;
    boolean[] marked;
    int[] disTo;

    public BreadthFirstSearch(DiGraph graph, int source) {
      marked = new boolean[graph.nodes()];
      disTo = new int[graph.nodes()];
      for (int n = 0; n < graph.nodes(); n++) {
        disTo[n] = INFINITY;
      }
      bfs(graph, source);
    }

    private void bfs(DiGraph graph, int source) {
      Queue<Integer> queue = new LinkedList<Integer>();
      marked[source] = true;
      disTo[source] = 0;
      queue.add(source);
      while (!queue.isEmpty()) {
        int parent = queue.poll();
        for (int child : graph.adj(parent)) {
          if (!marked[child]) {
            marked[child] = true;
            disTo[child] = disTo[parent] + 1;
            queue.add(child);
          }
        }
      }
    }

    public int getDistTo(int node) {
      return disTo[node];
    }
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

    public void addEdge(int from, int to) {
      edges++;
      adj[from].add(to);
    }

    public Iterable<Integer> adj(int node) {
      return adj[node];
    }

    public int nodes() {
      return nodes;
    }
  }
}
