package com.tmosest.CompetitiveProgramming.hackerrank.woc.week35;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

public class MatrixLand {

  public static boolean debugMode = false;

  /**
   * Class Node
   * 
   * @author tmosest
   */
  private static class Node {
    private int id;
    private boolean hasVisited;

    public Node(int id) {
      this.id = id;
    }

    public int getId() {
      return this.id;
    }

    public boolean getHasVisited() {
      return this.hasVisited;
    }

    public void setHasVisited(boolean hasVisited) {
      this.hasVisited = hasVisited;
    }

    public String toString() {
      return "Node " + id + " hasVisited " + hasVisited;
    }
  }

  /**
   * Class DirectedEdge
   * 
   * @author tmosest
   */
  private static class DirectedEdge {
    private Node from;
    private Node to;
    private int weight;

    public DirectedEdge(Node from, Node to, int weight) {
      this.from = from;
      this.to = to;
      this.weight = weight;
    }

    public int from() {
      return from.getId();
    }

    public int to() {
      return to.getId();
    }

    public int weight() {
      return (to.getHasVisited()) ? 0 : weight;
    }

    public String toString() {
      return from.toString() + "->" + to.toString() + " " + weight;
    }
  }

  /**
   * Class EdgeWeightedDigraph
   * 
   * @author tmosest
   */
  private static class EdgeWeightedDigraph {
    private int vertices;
    private int edges;
    private ArrayList<DirectedEdge>[] adj;
    private int[] indegree;

    public EdgeWeightedDigraph(int n) {
      this.vertices = n;
      this.edges = 0;
      this.indegree = new int[vertices];
      adj = (ArrayList<DirectedEdge>[]) new ArrayList[vertices];
      for (int i = 0; i < vertices; i++)
        adj[i] = new ArrayList<DirectedEdge>();
    }

    public int V() {
      return vertices;
    }

    public int E() {
      return edges;
    }

    public void addEdge(DirectedEdge e) {
      int to = e.to();
      int from = e.from();
      adj[from].add(e);
      indegree[to]++;
      edges++;
    }

    public Iterable<DirectedEdge> adj(int v) {
      return adj[v];
    }

    public Iterable<DirectedEdge> edges() {
      ArrayList<DirectedEdge> list = new ArrayList<DirectedEdge>();
      for (int v = 0; v < vertices; v++) {
        for (DirectedEdge e : adj(v)) {
          list.add(e);
        }
      }
      return list;
    }

    public int outdegree(int v) {
      return adj[v].size();
    }

    public int indegree(int v) {
      return indegree[v];
    }

    public String toString() {
      StringBuilder s = new StringBuilder();
      s.append(vertices + " " + edges + "\n");
      for (int v = 0; v < vertices; v++) {
        s.append(v + ": ");
        for (DirectedEdge e : adj[v]) {
          s.append(e.toString() + "  ");
        }
        s.append("\n");
      }
      return s.toString();
    }
  }

  private static class SpecialMatrix {
    private int rows;
    private int columns;
    private EdgeWeightedDigraph graph;
    private Node[][] nodes;

    public SpecialMatrix(int[][] grid) {
      buildGraph(grid);
    }

    public EdgeWeightedDigraph getEdgeWeightedDigraph() {
      return graph;
    }

    private void buildGraph(int[][] grid) {
      rows = grid.length;
      columns = grid[0].length;
      nodes = new Node[rows][columns];
      graph = new EdgeWeightedDigraph(rows * columns);
      if (debugMode) {
        System.out.println(graph.toString());
      }
      int nodeId = 0;
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          nodes[i][j] = new Node(nodeId++);
        }
      }
      DirectedEdge e;
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          if (j - 1 > -1) {
            e = new DirectedEdge(nodes[i][j], nodes[i][j - 1], grid[i][j - 1]);
            graph.addEdge(e);
          }
          if (j + 1 < columns) {
            e = new DirectedEdge(nodes[i][j], nodes[i][j + 1], grid[i][j + 1]);
            graph.addEdge(e);
          }
          if (i - 1 > -1) {
            e = new DirectedEdge(nodes[i][j], nodes[i - 1][j], grid[i - 1][j]);
            graph.addEdge(e);
          }
          if (i + 1 > rows) {
            e = new DirectedEdge(nodes[i][j], nodes[i + 1][j], grid[i + 1][j]);
            graph.addEdge(e);
          }
        }
      }
      if (debugMode) {
        System.out.println(graph.toString());
      }
    }

  }

  private static class IndexMinPQ<Key extends Comparable<Key>> implements Iterable<Integer> {
    private int maxN;
    private int n;
    private int[] pq;
    private int[] qp;
    private Key[] keys;

    public IndexMinPQ(int maxN) {
      if (maxN < 0)
        throw new IllegalArgumentException();
      this.maxN = maxN;
      n = 0;
      keys = (Key[]) new Comparable[maxN + 1]; // make this of length maxN??
      pq = new int[maxN + 1];
      qp = new int[maxN + 1]; // make this of length maxN??
      for (int i = 0; i <= maxN; i++)
        qp[i] = -1;
    }

    public boolean isEmpty() {
      return n == 0;
    }

    public boolean contains(int i) {
      if (i < 0 || i >= maxN)
        throw new IllegalArgumentException();
      return qp[i] != -1;
    }

    public int size() {
      return n;
    }

    public void insert(int i, Key key) {
      if (i < 0 || i >= maxN)
        throw new IllegalArgumentException();
      if (contains(i))
        throw new IllegalArgumentException("index is already in the priority queue");
      n++;
      qp[i] = n;
      pq[n] = i;
      keys[i] = key;
      swim(n);
    }

    public int minIndex() {
      if (n == 0)
        throw new NoSuchElementException("Priority queue underflow");
      return pq[1];
    }

    public Key minKey() {
      if (n == 0)
        throw new NoSuchElementException("Priority queue underflow");
      return keys[pq[1]];
    }

    public int delMin() {
      if (n == 0)
        throw new NoSuchElementException("Priority queue underflow");
      int min = pq[1];
      exch(1, n--);
      sink(1);
      assert min == pq[n + 1];
      qp[min] = -1; // delete
      keys[min] = null; // to help with garbage collection
      pq[n + 1] = -1; // not needed
      return min;
    }

    public Key keyOf(int i) {
      if (i < 0 || i >= maxN)
        throw new IllegalArgumentException();
      if (!contains(i))
        throw new NoSuchElementException("index is not in the priority queue");
      else
        return keys[i];
    }

    public void changeKey(int i, Key key) {
      if (i < 0 || i >= maxN)
        throw new IllegalArgumentException();
      if (!contains(i))
        throw new NoSuchElementException("index is not in the priority queue");
      keys[i] = key;
      swim(qp[i]);
      sink(qp[i]);
    }

    public void decreaseKey(int i, Key key) {
      if (i < 0 || i >= maxN)
        throw new IllegalArgumentException();
      if (!contains(i))
        throw new NoSuchElementException("index is not in the priority queue");
      if (keys[i].compareTo(key) <= 0)
        throw new IllegalArgumentException(
            "Calling decreaseKey() with given argument would not strictly decrease the key");
      keys[i] = key;
      swim(qp[i]);
    }


    private boolean greater(int i, int j) {
      return keys[pq[i]].compareTo(keys[pq[j]]) > 0;
    }

    private void exch(int i, int j) {
      int swap = pq[i];
      pq[i] = pq[j];
      pq[j] = swap;
      qp[pq[i]] = i;
      qp[pq[j]] = j;
    }

    private void swim(int k) {
      while (k > 1 && greater(k / 2, k)) {
        exch(k, k / 2);
        k = k / 2;
      }
    }

    private void sink(int k) {
      while (2 * k <= n) {
        int j = 2 * k;
        if (j < n && greater(j, j + 1))
          j++;
        if (!greater(k, j))
          break;
        exch(k, j);
        k = j;
      }
    }

    public Iterator<Integer> iterator() {
      return new HeapIterator();
    }

    private class HeapIterator implements Iterator<Integer> {
      // create a new pq
      private IndexMinPQ<Key> copy;

      // add all elements to copy of heap
      // takes linear time since already in heap order so no keys move
      public HeapIterator() {
        copy = new IndexMinPQ<Key>(pq.length - 1);
        for (int i = 1; i <= n; i++)
          copy.insert(pq[i], keys[pq[i]]);
      }

      public boolean hasNext() {
        return !copy.isEmpty();
      }

      public void remove() {
        throw new UnsupportedOperationException();
      }

      public Integer next() {
        if (!hasNext())
          throw new NoSuchElementException();
        return copy.delMin();
      }
    }
  }

  

  public static int solve() {
    Scanner in = new Scanner(System.in);
    int rows = in.nextInt();
    int columns = in.nextInt();
    int[][] grid = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        grid[i][j] = in.nextInt();
      }
    }
    in.close();
    SpecialMatrix matrix = new SpecialMatrix(grid);
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }

}
