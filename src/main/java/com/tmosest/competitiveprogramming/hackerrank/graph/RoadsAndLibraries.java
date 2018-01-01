package com.tmosest.competitiveprogramming.hackerrank.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class RoadsAndLibraries {

  public static boolean debugMode = false;

  /**
   * Function to read in a graph of roads and determine the cost of connecting cities to libraries.
   *
   * @return integer array with the costs for each test case.
   */
  public static long[] solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    long[] results = new long[tests];
    for (int t = 0; t < tests; t++) {
      if (debugMode) {
        System.out.println("\n==========================");
        System.out.print("Test Case: " + t);
      }
      int cities = in.nextInt();
      int roads = in.nextInt();
      long costLibrary = in.nextInt();
      long costRoad = in.nextInt();
      Graph graph = new Graph(cities);
      for (int r = 0; r < roads; r++) {
        graph.addEdge(in.nextInt() - 1, in.nextInt() - 1);
      }
      // Libraries are cheaper than roads
      if (costLibrary < costRoad) {
        // Just build libraries everywhere
        results[t] = cities * costLibrary;
        if (debugMode) {
          System.out.print("Building all libraries at cost of : " + results[t]);
        }
      } else {
        // Determine number of connected components
        ConnectedComponents connectedComponents = new ConnectedComponents(graph);
        long cost = 0;
        if (debugMode) {
          System.out.print("connectedComponents.count: " + connectedComponents.count);
        }
        for (int c = 0; c < connectedComponents.count; c++) {
          Integer sizeOfComponent = connectedComponents.connectedCounts.get(c);
          if (debugMode) {
            System.out.print("component: " + c + " size: " + sizeOfComponent);
          }
          if (sizeOfComponent != null) {
            long componentCost = costLibrary + ((sizeOfComponent - 1) * costRoad);
            cost += componentCost;
          }
        }
        results[t] = cost;
      }
    }
    in.close();
    return results;
  }

  /**
   * Main function.
   *
   * @param args Takes a main string array.
   */
  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }

  private static class ConnectedComponents {

    int count;
    boolean[] marked;
    HashMap<Integer, Integer> connectedCounts;

    ConnectedComponents(Graph graph) {
      count = 0;
      marked = new boolean[graph.nodes()];
      connectedCounts = new HashMap<Integer, Integer>();
      for (int n = 0; n < graph.nodes(); n++) {
        if (!marked[n]) {
          dfs(graph, n);
          ++count;
        }
      }
    }

    void dfs(Graph graph, int source) {
      Stack<Integer> stack = new Stack<Integer>();
      marked[source] = true;
      Integer connectedCount = connectedCounts.get(count);
      if (connectedCount == null) {
        connectedCounts.put(count, 1);
      } else {
        connectedCounts.put(count, ++connectedCount);
      }
      stack.push(source);
      while (!stack.empty()) {
        int node = stack.pop();
        for (int child : graph.adj(node)) {
          if (!marked[child]) {
            marked[child] = true;
            connectedCount = connectedCounts.get(count);
            if (connectedCount == null) {
              connectedCounts.put(count, 1);
            } else {
              connectedCounts.put(count, ++connectedCount);
            }
            stack.push(child);
          }
        }
      }
    }
  }

  private static class Graph {

    int nodes;
    int edges;
    ArrayList<Integer>[] adj;

    Graph(int nodes) {
      this.nodes = nodes;
      edges = 0;
      adj = (ArrayList<Integer>[]) new ArrayList[nodes];
      for (int n = 0; n < nodes; n++) {
        adj[n] = new ArrayList<Integer>();
      }
    }

    void addEdge(int node1, int node2) {
      edges++;
      adj[node1].add(node2);
      adj[node2].add(node1);
    }

    Iterable<Integer> adj(int node) {
      return adj[node];
    }

    int nodes() {
      return nodes;
    }
  }
}
