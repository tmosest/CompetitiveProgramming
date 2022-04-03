package com.tmosest.competitiveprogramming.codejam.jam2022;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class ChainReactions {

  private static List<List<Integer>> generateReversedPaths(int[] vals, int[] pts) {
    Queue<Integer> queue = new LinkedList<>();
    Map<Integer, List<Integer>> nodePointerMap = new HashMap<>();
    for (int i = 0; i < pts.length; i++) {
      if (pts[i] == 0) {
        queue.add(i + 1);
      }
    }
    List<Integer> terminatingNodes = new ArrayList<>();
    while (!queue.isEmpty()) {
      int index = queue.poll();
      List<Integer> pointers = new ArrayList<>();
      // all paths that point ot
      for (int i = 0; i < pts.length; i++) {
        if (pts[i] == index) {
          pointers.add(i + 1);
          queue.add(i + 1);
        }
      }
      nodePointerMap.put(index, pointers);
      if (pointers.size() == 0) {
        terminatingNodes.add(index);
      }
    }
    Map<Integer, List<Integer>> maxSoFar = new HashMap<>();
    for (int node : terminatingNodes) {
      // set up max so far for terminating nodes.
      List<Integer> values = maxSoFar.getOrDefault(node, new ArrayList<>());
      values.add(vals[node - 1]);
      maxSoFar.put(node, values);
      // DFS
      Queue<Integer> newQueue = new LinkedList<>();
      newQueue.add(pts[node - 1]);
      int previous = node;
      while (!newQueue.isEmpty()) {
        int queuedNode = newQueue.poll();
        if (queuedNode == 0) {
          continue;
        }
        values = maxSoFar.getOrDefault(previous, new ArrayList<>());
        List<Integer> newValues = maxSoFar.getOrDefault(queuedNode, new ArrayList<>());
        for (int val : values) {
          newValues.add(Math.max(val, vals[queuedNode - 1]));
        }
        maxSoFar.put(queuedNode, newValues);
        previous = queuedNode;
        if (pts[queuedNode] > 0) {
          newQueue.add(pts[queuedNode - 1]);
        }
      }
    }
    List<List<Integer>> results = new ArrayList<>();
    for (int i = 0; i < pts.length; i++) {
      if (pts[i] == 0) {
        queue.add(i + 1);
      }
    }
    return results;
  }

  /**
   * Function to run the program.
   *
   * @param args The args for the program.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int tests = Integer.parseInt(in.nextLine());
    for (int t = 1; t <= tests; ++t) {
      try {
        System.out.print("Case #" + t + ": ");
        Integer.parseInt(in.nextLine());
        int[] vals = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] ptrs = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        generateReversedPaths(vals, ptrs);
      } catch (Exception e) {
        System.out.println("Case #" + t + ": Error!!!");
        System.out.println(e);
      }
      System.out.println();
    }
  }
}
