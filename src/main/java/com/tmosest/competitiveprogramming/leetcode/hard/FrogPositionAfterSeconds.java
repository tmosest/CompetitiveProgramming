package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class FrogPositionAfterSeconds {

  double frogPosition(int num, int[][] edges, int time, int target) {

    List<List<Integer>> adjanceyList = new ArrayList<>();

    for (int i = 0; i < num; i++) {
      adjanceyList.add(new ArrayList<>());
    }

    for (int[] edge : edges) {
      adjanceyList.get(edge[0] - 1).add(edge[1] - 1);
      adjanceyList.get(edge[1] - 1).add(edge[0] - 1);
    }

    Map<Integer, List<Integer>> paths = new HashMap<>();
    for (int i = 0; i < num; i++) {
      paths.put(i, new ArrayList<>());
    }

    Queue<Integer> queue = new LinkedList<>();
    queue.add(0);

    boolean[] visited = new boolean[num];
    visited[0] = true;

    while (!queue.isEmpty()) {
      int curr = queue.poll();
      List<Integer> currPath = paths.get(curr);
      currPath.add(curr);
      for (int child : adjanceyList.get(curr)) {
        if (!visited[child]) {
          visited[child] = true;
          queue.add(child);
          paths.get(child).addAll(currPath);
        }
      }
    }

    double percent = 1.0;

    List<Integer> pathToTarget = paths.get(target - 1);

    if (pathToTarget == null || pathToTarget.size() == 0) {
      return 0.0;
    }

    for (Integer curr : pathToTarget) {
      --time;
      int children = adjanceyList.get(curr).size();
      if (curr != 0) {
        --children;
      }
      if (children > 0 && curr + 1 != target) {
        percent *= (1.0 / children);
      }
    }

    if (time < -1) {
      return 0.0;
    }

    if (time >= 0 && target == 1 && adjanceyList.get(target - 1).size() > 0) {
      return 0.0;
    }

    if (time >= 0 && adjanceyList.get(target - 1).size() > 1) {
      return 0.0;
    }

    return percent;
  }
}
