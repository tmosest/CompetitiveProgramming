package com.tmosest.competitiveprogramming.hackerearth.graphs.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelNodes {

  public static boolean debugMode = false;

  public static int solve() {
    Scanner in = new Scanner(System.in);
    int nodes = in.nextInt();
    if (debugMode)
      System.out.println("nodes: " + nodes);
    Graph g = new Graph(nodes);
    for (int i = 0; i < nodes - 1; i++) {
      g.addEdge(in.nextInt() - 1, in.nextInt() - 1);
    }
    BreadthFirstPath bfs = new BreadthFirstPath(g, 0);
    int levelCount = bfs.countNodesAtLevel(in.nextInt());
    if (debugMode)
      System.out.println("level count: " + levelCount);
    in.close();
    return levelCount;
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }

  private static class Graph {
    private int V;
    private int E;
    private ArrayList<Integer>[] adj;

    public Graph(int V) {
      this.V = V;
      E = 0;
      adj = (ArrayList<Integer>[]) new ArrayList[V];
      for (int v = 0; v < V; v++)
        adj[v] = new ArrayList<Integer>();
    }

    public void addEdge(int v, int w) {
      E++;
      adj[v].add(w);
      adj[w].add(v);
    }

    public int E() {
      return E;
    }

    public int V() {
      return V;
    }

    public Iterable<Integer> adj(int v) {
      return adj[v];
    }
  }

  private static class BreadthFirstPath {
    private static final int INFINITY = Integer.MAX_VALUE;
    private boolean[] marked;
    private int[] edgeTo;
    private int[] distTo;


    public BreadthFirstPath(Graph G, int s) {
      marked = new boolean[G.V()];
      edgeTo = new int[G.V()];
      distTo = new int[G.V()];
      for (int v = 0; v < G.V(); v++)
        distTo[v] = INFINITY;
      bfs(G, s);
    }

    private void bfs(Graph G, int s) {
      Queue<Integer> q = new LinkedList<Integer>();
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

    public int countNodesAtLevel(int level) {
      int count = 0;
      if (debugMode)
        System.out.println("looking for level: " + level);
      // root is level 1 which has distance of 0
      for (int v = 0; v < distTo.length; v++) {
        if (debugMode) {
          System.out.println("v: " + v + " disTo: " + distTo[v]);
        }
        if (distTo[v] == level - 1)
          ++count;
      }
      return count;
    }
  }
}
