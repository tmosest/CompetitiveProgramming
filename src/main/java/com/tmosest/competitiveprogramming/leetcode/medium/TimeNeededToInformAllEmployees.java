package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class TimeNeededToInformAllEmployees {

  int numOfMinutes(int numEmployees, int headId, int[] manager, int[] informTime) {

    List<List<Integer>> adjanceyMatrix = new ArrayList<>();
    for (int i = 0; i < numEmployees; i++) {
      adjanceyMatrix.add(new ArrayList<>());
    }

    for (int i = 0; i < manager.length; i++) {
      int managerId = manager[i];
      if (managerId != -1) {
        adjanceyMatrix.get(managerId).add(i);
      }
    }

    boolean[] visited = new boolean[numEmployees];
    visited[headId] = true;

    Map<Integer, Integer> timeToHear = new HashMap<>();
    timeToHear.put(headId, 0);

    Queue<Integer> queue = new LinkedList<>();
    queue.add(headId);

    int result = 0;

    while (!queue.isEmpty()) {
      int managerId = queue.poll();
      int managerTime = informTime[managerId] + timeToHear.getOrDefault(managerId, 0);
      for (Integer employeeId : adjanceyMatrix.get(managerId)) {
        if (!visited[employeeId]) {
          visited[employeeId] = true;
          timeToHear.put(employeeId, managerTime);
          result = Math.max(result, managerTime);
          queue.add(employeeId);
        }
      }
    }

    return result;
  }
}
