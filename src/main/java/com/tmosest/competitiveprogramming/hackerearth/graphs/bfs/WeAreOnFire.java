package com.tmosest.competitiveprogramming.hackerearth.graphs.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class WeAreOnFire {

  public static boolean debugMode = false;

  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }

  /**
   * Uses Scanner to read cities and oceans and then determines what cities where burned by a
   * fireball.
   *
   * @return Returns an array of cities left after each fireball.
   */
  public static int[] solve() {
    Scanner in = new Scanner(System.in);
    int rows = in.nextInt();
    int columns = in.nextInt();
    int fireballs = in.nextInt();
    int[] results = new int[fireballs];
    int[][] matrix = new int[rows][columns];
    int cityCount = 0;
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < columns; c++) {
        matrix[r][c] = in.nextInt();
        if (matrix[r][c] == 1) {
          ++cityCount;
        }
      }
    }
    if (debugMode) {
      System.out.println("city count: " + cityCount);
    }
    Graph graph = new Graph(rows * columns);
    BreadthFirstSearch bfs = new BreadthFirstSearch(graph);
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < columns; c++) {
        int from = convertToNode(r, c, rows, columns);
        if (debugMode) {
          System.out.println("from: " + from);
        }
        if (matrix[r][c] == 1) {
          int to;
          if (r > 0 && matrix[r - 1][c] == 1) {
            to = convertToNode(r - 1, c, rows, columns);
            if (debugMode) {
              System.out.println("to: " + to);
            }
            graph.addEdge(from, to);
          }
          if (r < rows - 1 && matrix[r + 1][c] == 1) {
            to = convertToNode(r + 1, c, rows, columns);
            if (debugMode) {
              System.out.println("to: " + to);
            }
            graph.addEdge(from, to);
          }
          if (c > 0 && matrix[r][c - 1] == 1) {
            to = convertToNode(r, c - 1, rows, columns);
            if (debugMode) {
              System.out.println("to: " + to);
            }
            graph.addEdge(from, to);
          }
          if (c < columns - 1 && matrix[r][c + 1] == 1) {
            to = convertToNode(r, c + 1, rows, columns);
            if (debugMode) {
              System.out.println("to: " + to);
            }
            graph.addEdge(from, to);
          }
        } else {
          bfs.setOcean(from);
        }
      }
    }
    for (int f = 0; f < fireballs; f++) {
      int row = in.nextInt();
      int column = in.nextInt();
      int node = convertToNode(row - 1, column - 1, rows, columns);
      if (debugMode) {
        System.out.println("row: " + row + " column:" + column + " node: " + node);
      }
      if (f > 0 && matrix[row - 1][column - 1] == 0) {
        results[f] = results[f - 1];
      } else {
        results[f] = bfs.countCities(node);
      }
      if (debugMode) {
        System.out.println("f: " + f + " results: " + results[f]);
      }
    }
    return results;
  }

  private static int convertToNode(int row, int column, int rows, int columns) {
    return row * columns + column;
  }

  private static class Graph {

    int verticies;
    int edges;
    ArrayList<Integer>[] adj;

    public Graph(int verticies) {
      this.verticies = verticies;
      edges = 0;
      adj = (ArrayList<Integer>[]) new ArrayList[verticies];
      for (int v = 0; v < verticies; v++) {
        adj[v] = new ArrayList<Integer>();
      }
    }

    public void addEdge(int from, int to) {
      edges++;
      adj[from].add(to);
      adj[to].add(from);
    }

    public int verticies() {
      return verticies;
    }

    public Iterable<Integer> adj(int node) {
      return adj[node];
    }
  }

  private static class BreadthFirstSearch {

    int notMarkedCount;
    boolean[] marked;
    Graph graph;

    BreadthFirstSearch(Graph graph) {
      this.graph = graph;
      marked = new boolean[graph.verticies()];
      notMarkedCount = graph.verticies();
    }

    private void bfs(int source) {
      Queue<Integer> queue = new LinkedList<Integer>();
      queue.add(source);
      if (marked[source]) {
        return;
      }
      marked[source] = true;
      notMarkedCount--;
      if (debugMode) {
        System.out.println("source: " + source);
      }
      while (!queue.isEmpty()) {
        int node = queue.poll();
        if (debugMode) {
          System.out.println("node: " + node);
        }
        for (int link : graph.adj(node)) {
          if (debugMode) {
            System.out.print("link: " + link + " marked: " + marked[link]);
          }
          if (!marked[link]) {
            notMarkedCount--;
            marked[link] = true;
            queue.add(link);
          }
        }
        if (debugMode) {
          System.out.println();
        }
      }
    }

    public int countCities(int source) {
      bfs(source);
      return notMarkedCount;
    }

    public void setOcean(int source) {
      marked[source] = true;
      notMarkedCount--;
    }
  }
}
