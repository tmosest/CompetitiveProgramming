package com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelNodes {

  public static boolean debugMode = false;

  /**
   * Function for testing.
   *
   * @return level count.
   */
  public static int solve() {
    Scanner in = new Scanner(System.in);
    int nodes = in.nextInt();
    if (debugMode) {
      System.out.println("nodes: " + nodes);
    }
    Graph graph = new Graph(nodes);
    for (int i = 0; i < nodes - 1; i++) {
      graph.addEdge(in.nextInt() - 1, in.nextInt() - 1);
    }
    BreadthFirstPath bfs = new BreadthFirstPath(graph, 0);
    int levelCount = bfs.countNodesAtLevel(in.nextInt());
    if (debugMode) {
      System.out.println("level count: " + levelCount);
    }
    in.close();
    return levelCount;
  }

  public static void main(String[] args) {
    System.out.println(solve());
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

  private static class BreadthFirstPath {

    private static final int INFINITY = Integer.MAX_VALUE;
    private boolean[] marked;
    private int[] edgeTo;
    private int[] distTo;


    public BreadthFirstPath(Graph graph, int source) {
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
        for (int w : graph.adj(node)) {
          if (!marked[w]) {
            edgeTo[w] = node;
            distTo[w] = distTo[node] + 1;
            marked[w] = true;
            queue.add(w);
          }
        }
      }
    }

    public int countNodesAtLevel(int level) {
      int count = 0;
      if (debugMode) {
        System.out.println("looking for level: " + level);
      }
      // root is level 1 which has distance of 0
      for (int v = 0; v < distTo.length; v++) {
        if (debugMode) {
          System.out.println("v: " + v + " disTo: " + distTo[v]);
        }
        if (distTo[v] == level - 1) {
          ++count;
        }
      }
      return count;
    }
  }
}
