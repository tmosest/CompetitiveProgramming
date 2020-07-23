package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class ReorderRoutesToMakeAllPathsLeadToTheCityZero {

  int minReorder(int num, int[][] connections) {
    Map<Integer, Set<Integer>> graph = new HashMap<>();
    Map<Integer, Set<Integer>> map = new HashMap<>();

    for (int[] ele : connections) {
      if (graph.containsKey(ele[0]) == false) {
        graph.put(ele[0], new HashSet<>());
      }
      if (graph.containsKey(ele[1]) == false) {
        graph.put(ele[1], new HashSet<>());
      }
      graph.get(ele[0]).add(ele[1]);
      graph.get(ele[1]).add(ele[0]);

      if (map.containsKey(ele[0]) == false) {
        map.put(ele[0], new HashSet<>());
      }
      map.get(ele[0]).add(ele[1]);
    }

    Set<Integer> set = new HashSet<>();
    set.add(0);
    Queue<Integer> queue = new LinkedList<>();
    queue.add(0);

    int count = 0;
    while (queue.size() != 0) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        int curEle = queue.poll();
        if (!graph.containsKey(curEle)) {
          continue;
        }

        for (int nextEle : graph.get(curEle)) {
          if (set.contains(nextEle)) {
            continue;
          }
          if (map.containsKey(curEle) && map.get(curEle).contains(nextEle)) {
            count++;
          }
          set.add(nextEle);
          queue.add(nextEle);
        }
      }
    }

    return count;
  }
}
