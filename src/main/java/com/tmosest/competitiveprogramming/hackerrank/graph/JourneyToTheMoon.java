package com.tmosest.competitiveprogramming.hackerrank.graph;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class JourneyToTheMoon {

  public static boolean debugMode = false;

  /**
   * Function to test this problem.
   *
   * @return BigInteger representing ways to choose two astronauts from different countries.
   */
  public static BigInteger solve() {
    Scanner in = new Scanner(System.in);
    int astronauts = in.nextInt();
    int connections = in.nextInt();
    Graph graph = new Graph(astronauts);
    for (int c = 0; c < connections; c++) {
      graph.addEdges(in.nextInt(), in.nextInt());
    }
    ConnectedComponents connectedComponents = new ConnectedComponents(graph);
    BigInteger total = chooseTwo(astronauts);
    for (int c = 0; c < connectedComponents.componentCount(); c++) {
      total = total.subtract(chooseTwo(connectedComponents.componentSize(c)));
    }
    return total;
  }

  /**
   * Main function.
   *
   * @param args Main string array.
   */
  public static void main(String[] args) {
    System.out.println(solve());
  }

  private static BigInteger chooseTwo(int number) {
    BigInteger bigNumber = BigInteger.valueOf(number);
    BigInteger two = BigInteger.ONE.add(BigInteger.ONE);
    return bigNumber.multiply(bigNumber.add(BigInteger.ONE)).divide(two);
  }

  private static class ConnectedComponents {

    int count;
    boolean[] marked;
    HashMap<Integer, Integer> sizes;

    ConnectedComponents(Graph graph) {
      count = 0;
      marked = new boolean[graph.nodes()];
      sizes = new HashMap<Integer, Integer>();
      for (int n = 0; n < graph.nodes(); n++) {
        if (!marked[n]) {
          dfs(graph, n);
          ++count;
        }
      }
    }

    void dfs(Graph graph, int source) {
      Stack<Integer> stack = new Stack<Integer>();
      Integer componentSize = sizes.get(count);
      if (componentSize == null) {
        sizes.put(count, 1);
      } else {
        sizes.put(count, ++componentSize);
      }
      marked[source] = true;
      stack.push(source);
      while (!stack.empty()) {
        int node = stack.pop();
        for (int child : graph.adj(node)) {
          if (!marked[child]) {
            marked[child] = true;
            componentSize = sizes.get(count);
            if (componentSize == null) {
              sizes.put(count, 1);
            } else {
              sizes.put(count, ++componentSize);
            }
            stack.push(child);
          }
        }
      }
    }

    public int componentCount() {
      return count;
    }

    public int componentSize(int component) {
      Integer size = sizes.get(component);
      if (size == null) {
        return 0;
      }
      return size;
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

    void addEdges(int node1, int node2) {
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
