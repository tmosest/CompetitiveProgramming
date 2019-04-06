package com.tmosest.competitiveprogramming.codejam.jam2019;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class YouCanGoAllTheWay {

  private static class Node {
    int id;
    int row;
    int col;
    ArrayList<Node> neighbors;

    private Node(int id, int row, int col) {
      this.id = id;
      this.row = row;
      this.col = col;
      neighbors = new ArrayList<>();
    }
  }

  private static int getId(int row, int col, int cols) {
    return row * cols + col;
  }

  /**
   * Determine a unique path.
   * @param pathToAvoid Path to avoid.
   * @param length The size of the board.
   * @return A unique path to the end.
   */
  public static String getUniquePath(String pathToAvoid, int length) {
    List<String> neighborhoods = new ArrayList<>();
    // generating the list of all possible moves
    ArrayList<Node> nodes = new ArrayList<>();
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        nodes.add(new Node(getId(i, j, length), i, j));
      }
    }
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        Node node = nodes.get(getId(i, j, length));
        if (i + 1 < length) {
          node.neighbors.add(nodes.get(getId(i + 1, j, length)));
        }
        if (j + 1 < length) {
          node.neighbors.add(nodes.get(getId(i, j + 1, length)));
        }
      }
    }
    // remove nodes
    Node root = nodes.get(0);
    for (char letter : pathToAvoid.toCharArray()) {
      Node toRemove;
      if (letter == 'S') {
        toRemove = nodes.get(getId(root.row + 1, root.col, length));
      } else {
        toRemove = nodes.get(getId(root.row, root.col + 1, length));
      }
      root.neighbors.remove(toRemove);
      root = toRemove;
    }
    // Generate our own path;
    root = nodes.get(0);
    boolean[] visited = new boolean[nodes.size()];
    String[] moves = new String[nodes.size()];
    moves[0] = "";
    Stack<Node> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      root = stack.pop();
      String mov = moves[root.id];
      for (Node node : root.neighbors) {
        if (!visited[node.id]) {
          stack.push(node);
          moves[node.id] = (node.row == root.row + 1) ? mov + "S" : mov + "E";
          if (node.id == getId(length - 1, length - 1, length)) {
            return moves[node.id];
          }
        }
      }
      visited[root.id] = true;
    }
    return "";
  }

  /**
   * Read from input and solve.
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int tests = Integer.parseInt(in.nextLine());
    for (int i = 1; i <= tests; ++i) {
      int length = Integer.parseInt(in.nextLine());
      String path = in.nextLine();
      System.out.println("Case #" + i + ": " + getUniquePath(path, length));
    }
  }
}
