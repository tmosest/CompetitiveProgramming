package com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BishuAndHisGirlfriend {

  public static boolean debugMode = false;

  /**
   * Prints the bride who is minimum distance away.
   *
   * @return Id of city where bride lives.
   */
  public static int solve() {
    Scanner in = new Scanner(System.in);
    int nodes = in.nextInt();
    Graph graph = new Graph(nodes);
    for (int e = 0; e < nodes - 1; e++) {
      graph.addEdge(in.nextInt() - 1, in.nextInt() - 1);
    }
    BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 0);
    int min = Integer.MAX_VALUE;
    int minNode = 0;
    int queries = in.nextInt();
    for (int q = 0; q < queries; q++) {
      int node = in.nextInt();
      int nodeDistance = bfs.getDistTo(node - 1);
      if (nodeDistance < min) {
        min = nodeDistance;
        minNode = node;
      } else if (nodeDistance == min) {
        minNode = Math.min(minNode, node);
      }
    }
    in.close();
    return minNode;
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }

  private static class BreadthFirstSearch {

    private static final int INFINITY = Integer.MAX_VALUE;
    boolean[] marked;
    int[] distTo;

    public BreadthFirstSearch(Graph graph, int source) {
      marked = new boolean[graph.nodes()];
      distTo = new int[graph.nodes()];
      for (int i = 0; i < graph.nodes(); i++) {
        distTo[i] = INFINITY;
      }
      bfs(graph, source);
    }

    private void bfs(Graph graph, int source) {
      Queue<Integer> queue = new LinkedList<Integer>();
      marked[source] = true;
      distTo[source] = 0;
      queue.add(source);
      while (!queue.isEmpty()) {
        int parent = queue.poll();
        for (int child : graph.adj(parent)) {
          if (!marked[child]) {
            distTo[child] = distTo[parent] + 1;
            marked[child] = true;
            queue.add(child);
          }
        }
      }
    }

    private int getDistTo(int node) {
      return distTo[node];
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
      for (int i = 0; i < nodes; i++) {
        adj[i] = new ArrayList<Integer>();
      }
    }

    public void addEdge(int node1, int node2) {
      edges++;
      adj[node1].add(node2);
      adj[node2].add(node1);
    }

    public Iterable<Integer> adj(int node) {
      return adj[node];
    }

    public int nodes() {
      return nodes;
    }
  }
}
