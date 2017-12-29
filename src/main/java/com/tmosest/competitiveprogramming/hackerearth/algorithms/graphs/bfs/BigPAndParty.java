package com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BigPAndParty {

  public static boolean debugMode = false;

  private static class Graph {
    private int vertices;
    private int edges;
    private ArrayList<Integer>[] adj;

    Graph(int vertices) {
      this.vertices = vertices;
      edges = 0;
      adj = (ArrayList<Integer>[]) new ArrayList[this.vertices];
      for (int v = 0; v < vertices; v++) {
        adj[v] = new ArrayList<Integer>();
      }
    }

    public int vertices() {
      return vertices;
    }

    public void addEdge(int toNode, int fromNode) {
      edges++;
      adj[toNode].add(fromNode);
      adj[fromNode].add(toNode);
    }

    public Iterable<Integer> adj(int node) {
      return adj[node];
    }
  }

  private static class BreadthFirstSearch {
    private static final int INFINITY = Integer.MAX_VALUE;
    private boolean[] marked;
    private int[] edgeTo;
    private int[] distTo;

    public BreadthFirstSearch(Graph graph, int source) {
      marked = new boolean[graph.vertices()];
      edgeTo = new int[graph.vertices()];
      distTo = new int[graph.vertices()];
      for (int v = 0; v < graph.vertices(); v++) {
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
        if (debugMode) {
          System.out.println("node: " + node + " distTo: " + distTo[node]);
        }
        for (int link : graph.adj(node)) {
          if (!marked[link]) {
            marked[link] = true;
            distTo[link] = distTo[node] + 1;
            edgeTo[link] = node;
            queue.add(link);
          }
        }
      }
    }

    public int distTo(int node) {
      if (debugMode) {
        System.out.println("node: " + node + " distTo: " + distTo[node]);
      }
      return distTo[node];
    }
  }

  /**
   * Computes the Erdos Number for each person.
   * 
   * @return Returns an array containing the Erdos number for each person.
   */
  public static int[] solve() {
    Scanner in = new Scanner(System.in);
    int node = in.nextInt();
    int edges = in.nextInt();
    Graph graph = new Graph(node);
    int[] results = new int[node - 1];
    for (int i = 0; i < edges; i++) {
      graph.addEdge(in.nextInt(), in.nextInt());
    }
    in.close();
    BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 0);
    for (int i = 0; i < results.length; i++) {
      results[i] = bfs.distTo(i + 1);
    }
    return results;
  }

  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }
}
