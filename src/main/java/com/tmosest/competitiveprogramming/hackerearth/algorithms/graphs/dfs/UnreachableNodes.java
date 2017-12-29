package com.tmosest.competitiveprogramming.hackerearth.algorithms.graphs.dfs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * <h1>Hacker Earth: Depth First Search: Depth First Search</h2> <p>link:
 * https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/tutorial/</p>
 */
public class UnreachableNodes {

  public static boolean debugMode = false;

  /**
   * Function to read in Graph and find unvisited nodes from a source.
   *
   * @return Number of unvisited cities.
   */
  public static int solve() {
    Scanner in = new Scanner(System.in);
    int nodes = in.nextInt();
    int edges = in.nextInt();
    Graph graph = new Graph(nodes);
    for (int e = 0; e < edges; e++) {
      int node1 = in.nextInt() - 1;
      int node2 = in.nextInt() - 1;
      graph.addEdge(node1, node2);
    }
    int headNode = in.nextInt() - 1;
    DepthFirstSearch dfs = new DepthFirstSearch(graph, headNode);
    return dfs.unVisitedCitiesCount();
  }

  /**
   * Main Function.
   *
   * @param args String array
   */
  public static void main(String[] args) {
    System.out.println(solve());
  }

  private static class DepthFirstSearch {

    boolean[] marked;

    DepthFirstSearch(Graph graph, int source) {
      marked = new boolean[graph.nodes()];
      dfs(graph, source);
    }

    private void dfs(Graph graph, int source) {
      Stack<Integer> stack = new Stack<Integer>();
      marked[source] = true;
      stack.add(source);
      while (!stack.empty()) {
        int node = stack.pop();
        for (int link : graph.adj(node)) {
          if (!marked[link]) {
            marked[link] = true;
            stack.add(link);
          }
        }
      }
    }

    /**
     * Function to get the count of cities that cannot be visited.
     *
     * @return integer representing the number of cities that can't be visited from source node.
     */
    public int unVisitedCitiesCount() {
      int count = 0;
      for (int c = 0; c < marked.length; c++) {
        if (!marked[c]) {
          ++count;
        }
      }
      return count;
    }
  }

  private static class Graph {

    int nodes;
    int edges;
    ArrayList<Integer>[] adj;

    /**
     * Function to create a new Graph.
     *
     * @param nodes number of vertices.
     */
    public Graph(int nodes) {
      this.nodes = nodes;
      edges = 0;
      adj = (ArrayList<Integer>[]) new ArrayList[nodes];
      for (int n = 0; n < nodes; n++) {
        adj[n] = new ArrayList<Integer>();
      }
    }

    /**
     * Function to add a new edge.
     *
     * @param node1 first node id.
     * @param node2 second node id.
     */
    public void addEdge(int node1, int node2) {
      edges++;
      adj[node1].add(node2);
      adj[node2].add(node1);
    }

    /**
     * Functon to get the number of nodes.
     *
     * @return Node count.
     */
    public int nodes() {
      return nodes;
    }

    /**
     * Function to get all links to a node.
     *
     * @param node the id of the source node.
     * @return ArrayList of all linked nodes.
     */
    public Iterable<Integer> adj(int node) {
      return adj[node];
    }
  }
}
