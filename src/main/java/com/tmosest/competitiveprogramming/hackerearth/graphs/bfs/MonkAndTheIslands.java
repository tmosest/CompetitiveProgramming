package com.tmosest.competitiveprogramming.hackerearth.graphs.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MonkAndTheIslands {

  public static boolean debugMode = false;

  private static class Graph {
    private int V;
    private int E;
    private ArrayList<Integer>[] adj;

    public Graph(int V) {
      this.V = V;
      this.E = 0;
      adj = (ArrayList<Integer>[]) new ArrayList[V];
      for (int i = 0; i < V; i++)
        adj[i] = new ArrayList<Integer>();
    }

    public int V() {
      return V;
    }

    public void addEdge(int v, int w) {
      E++;
      adj[v].add(w);
      adj[w].add(v);
    }

    public Iterable<Integer> adj(int v) {
      return adj[v];
    }
  }

  private static class BreadthFirstPaths {
    private static final int INFINITY = Integer.MAX_VALUE;
    private boolean[] marked;
    private int[] edgeTo;
    private int[] distTo;

    public BreadthFirstPaths(Graph G, int s) {
      marked = new boolean[G.V()];
      edgeTo = new int[G.V()];
      distTo = new int[G.V()];
      for (int v = 0; v < G.V(); v++)
        distTo[v] = INFINITY;
      bfs(G, s);
    }

    private void bfs(Graph G, int s) {
      Queue<Integer> q = new LinkedList<Integer>();
      for (int v = 0; v < G.V(); v++)
        distTo[v] = INFINITY;
      distTo[s] = 0;
      marked[s] = true;
      q.add(s);
      while (!q.isEmpty()) {
        int v = q.poll();
        for (int w : G.adj(v)) {
          if (!marked[w]) {
            edgeTo[w] = v;
            distTo[w] = distTo[v] + 1;
            marked[w] = true;
            q.add(w);
          }
        }
      }
    }

    public int distTo(int v) {
      return distTo[v];
    }
  }

  public static int[] solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    int[] results = new int[tests];
    for (int t = 0; t < tests; t++) {
      int nodes = in.nextInt();
      int edges = in.nextInt();
      Graph g = new Graph(nodes);
      for (int e = 0; e < edges; e++)
        g.addEdge(in.nextInt() - 1, in.nextInt() - 1);
      BreadthFirstPaths bfs = new BreadthFirstPaths(g, 0);
      results[t] = bfs.distTo(nodes - 1);
    }
    in.close();
    return results;
  }

  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }
}
