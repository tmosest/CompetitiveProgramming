package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class CourseSchedule {

  /**
   * Determine if all the courses can be completed.
   *
   * @param numCourses The number of courses.
   * @param prerequisites The prerequisites.
   * @return True if all the courses can be taken.
   */
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    Map<Integer, Integer> degreeByNode = new HashMap<>();
    Map<Integer, List<Integer>> connsByNode = new HashMap<>();
    fillGraphInfo(numCourses, prerequisites, degreeByNode, connsByNode);
    topologicalSort(degreeByNode, connsByNode);
    for (Map.Entry<Integer, Integer> entry : degreeByNode.entrySet()) {
      if (entry.getValue() != 0) {
        return false;
      }
    }
    return true;
  }

  private void fillGraphInfo(int nodes, int[][] pre, Map<Integer, Integer> degreeByNode,
      Map<Integer, List<Integer>> connsByNode) {
    for (int[] item : pre) {
      int src = item[0];
      int dest = item[1];
      degreeByNode.put(dest, degreeByNode.getOrDefault(dest, 0) + 1);
      List<Integer> conns = connsByNode.getOrDefault(src, new ArrayList<>());
      conns.add(dest);
      connsByNode.put(src, conns);
    }
    for (int i = 0; i < nodes; i++) {
      if (!degreeByNode.containsKey(i)) {
        degreeByNode.put(i, 0);
      }
      if (!connsByNode.containsKey(i)) {
        connsByNode.put(i, new ArrayList<>());
      }
    }
  }

  private void topologicalSort(Map<Integer, Integer> degreeByNode,
      Map<Integer, List<Integer>> connsByNode) {
    Deque<Integer> readyToProcess = new ArrayDeque<>();
    Set<Integer> visited = new HashSet<>();
    for (Map.Entry<Integer, Integer> entry : degreeByNode.entrySet()) {
      if (entry.getValue() == 0) {
        readyToProcess.offerLast(entry.getKey());
      }
    }
    while (!readyToProcess.isEmpty()) {
      int current = readyToProcess.pollFirst();
      visited.add(current);
      for (int conn : connsByNode.get(current)) {
        degreeByNode.put(conn, degreeByNode.get(conn) - 1);
        if (degreeByNode.get(conn) == 0) {
          if (!visited.contains(conn)) {
            readyToProcess.offerLast(conn);
          }
        }
      }
    }
  }
}
