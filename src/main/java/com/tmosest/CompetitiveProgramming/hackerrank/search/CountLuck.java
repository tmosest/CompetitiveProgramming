package com.tmosest.CompetitiveProgramming.hackerrank.search;

import java.util.ArrayList;
import java.util.Scanner;

public class CountLuck {

  public static boolean debugMode = false;

  private static class Graph {
    private int verticies;
    private int edges;
    private ArrayList<Integer>[] adj;

    public Graph(int verticies) {
      this.verticies = verticies;
      this.edges = 0;
      adj = (ArrayList<Integer>[]) new ArrayList[verticies];
      for (int i = 0; i < verticies; i++) {
        adj[i] = new ArrayList<Integer>();
      }
    }

    public int verticies() {
      return verticies;
    }

    public int edges() {
      return edges;
    }

    public void addEdge(int v, int w) {
      edges++;
      adj[v].add(w);
      adj[w].add(v);
    }

    public Iterable<Integer> adj(int v) {
      return adj[v];
    }
  }

  private static class DepthFirstPaths {
    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    public DepthFirstPaths(Graph G, int s) {
      this.s = s;
      edgeTo = new int[G.verticies()];
      marked = new boolean[G.verticies()];
      dfs(G, s);
    }

    private void dfs(Graph G, int v) {
      marked[v] = true;
      for (int w : G.adj(v)) {
        if (!marked[w]) {
          edgeTo[w] = v;
          dfs(G, w);
        }
      }
    }

    public boolean hasPathTo(int v) {
      return marked[v];
    }

    public ArrayList<Integer> pathTo(int v) {
      if (!hasPathTo(v))
        return null;
      ArrayList<Integer> path = new ArrayList<Integer>();
      for (int x = v; x != s; x = edgeTo[x])
        path.add(x);
      path.add(s);
      return path;
    }
  }

  private static class LuckyGraphSearch {
    private int rows;
    private int columns;
    private int finishNode;
    private char[][] grid;
    private Graph graph;
    private DepthFirstPaths dfs;

    public LuckyGraphSearch(char[][] grid) {
      this.grid = grid;
      rows = grid.length;
      columns = grid[0].length;
      int startNode = 0;
      finishNode = 0;

      graph = new Graph(rows * columns);

      if (debugMode) {
        printGrid();
      }

      for (int r = 0; r < rows; r++) {
        for (int c = 0; c < columns; c++) {
          char spot = grid[r][c];
          int node = matrixToNodeIndex(r, c);
          switch (spot) {
            case '*':
              finishNode = node;
              break;
            case 'M':
              startNode = node;
              break;
          }
          if (grid[r][c] != 'X') {
            if (r - 1 > -1 && grid[r - 1][c] != 'X') {
              int altNode = matrixToNodeIndex(r - 1, c);
              graph.addEdge(node, altNode);
              graph.addEdge(altNode, node);
            }
            if (c - 1 > -1 && grid[r][c - 1] != 'X') {
              int altNode = matrixToNodeIndex(r, c - 1);
              graph.addEdge(node, altNode);
              graph.addEdge(altNode, node);
            }
            if (r + 1 < rows && grid[r + 1][c] != 'X') {
              int altNode = matrixToNodeIndex(r + 1, c);
              graph.addEdge(node, altNode);
              graph.addEdge(altNode, node);
            }
            if (c + 1 < columns && grid[r][c + 1] != 'X') {
              int altNode = matrixToNodeIndex(r, c + 1);
              graph.addEdge(node, altNode);
              graph.addEdge(altNode, node);
            }
          }
        }
      }
      dfs = new DepthFirstPaths(graph, startNode);
    }

    private void printGrid() {
      System.out.println("\n====================");
      System.out.println("Grid");
      System.out.println("====================\n");
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          String s = matrixToNodeIndex(i, j) + " : " + grid[i][j];
          System.out.print(String.format("%-8s ", s));
        }
        System.out.println();
      }
    }

    private int[] nodeIndexToMatrix(int node) {
      int[] position = new int[2];
      position[0] = node / columns;
      position[1] = node % columns;
      if (node < 0) {
        position[0] = -1;
        position[1] = -1;
      }
      return position;
    }

    private boolean existsMoreThanOnePath(int node, int previousNode) {
      int count = 0;
      int[] position = nodeIndexToMatrix(node);
      int[] previousPosition = nodeIndexToMatrix(previousNode);
      int r = position[0];
      int c = position[1];
      int pR = previousPosition[0];
      int pC = previousPosition[1];
      if (debugMode) {
        System.out.println("\n====================");
        System.out.println("Exists More Than One Path:");
        System.out.println("====================");
        System.out.println("\nnode: " + node + " previousNode: " + previousNode);
        System.out.println("r: " + r + " c: " + c + " pR: " + pR + " pC: " + pC);
      }
      if (r - 1 > -1 && r - 1 != pR && grid[r - 1][c] != 'X') {
        count++;
        if (debugMode) {
          System.out.println("up? " + count);
        }
      }
      if (c - 1 > -1 && c - 1 != pC && grid[r][c - 1] != 'X') {
        count++;
        if (debugMode) {
          System.out.println("left? " + count);
        }
      }
      if (r + 1 < rows && r + 1 != pR && grid[r + 1][c] != 'X') {
        count++;
        if (debugMode) {
          System.out.println("down? " + count);
        }
      }
      if (c + 1 < columns && c + 1 != pC && grid[r][c + 1] != 'X') {
        count++;
        if (debugMode) {
          System.out.println("right? " + count);
        }
      }
      if (debugMode)
        System.out.println(
            "final count " + count + "\n");
      return (count > 1);
    }

    private int matrixToNodeIndex(int row, int column) {
      return (row * columns + column);
    }

    public boolean wasGuessCorrect(int guess) {

      if (debugMode) {
        System.out.println("\n====================");
        System.out.println("Path");
        System.out.println("====================\n");
        for (int w : dfs.pathTo(finishNode)) {
          System.out.print("node : " + w + " -> ");
        }
        System.out.println();
      }

      ArrayList<Integer> path = dfs.pathTo(finishNode);
      int pathLength = path.size();

      int count = 0;

      if (existsMoreThanOnePath(path.get(pathLength - 1), -1))
        count++;

      if (debugMode) {
        System.out.println("\n====================");
        System.out.println("Count: " + count);
        System.out.println("====================\n");
      }

      for (int i = pathLength - 2; i > 0; --i) {
        if (existsMoreThanOnePath(path.get(i), path.get(i - 1)))
          count++;
        if (debugMode) {
          System.out.println("\n====================");
          System.out.println("Count: " + count);
          System.out.println("====================\n");
        }
      }
      return guess == count;
    }
  }

  public static boolean[] solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    boolean[] results = new boolean[tests];
    for (int t = 0; t < tests; t++) {
      if (debugMode) {
        System.out.println("\n=======================================");
        System.out.println("Test Case: " + t);
        System.out.println("=======================================\n");
      }
      int rows = in.nextInt();
      int columns = in.nextInt();
      char[][] grid = new char[rows][columns];
      for (int i = 0; i < rows; i++) {
        String row = in.next();
        grid[i] = row.toCharArray();
      }
      LuckyGraphSearch luckyGraph = new LuckyGraphSearch(grid);
      results[t] = luckyGraph.wasGuessCorrect(in.nextInt());
    }
    in.close();
    return results;
  }

  public static void main(String[] args) {
    boolean[] results = solve();
    for (int i = 0; i < results.length; i++) {
      String result = (results[i]) ? "Impressed" : "Oops!";
      System.out.println(result);
    }
  }

}
