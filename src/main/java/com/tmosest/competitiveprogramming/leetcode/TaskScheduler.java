package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TaskScheduler {

  /**
   * Determine the number of cycles it would take to complete the processes.
   * @param tasks The tasks.
   * @param coolDown The cool down time between two of the same task.
   * @return The number of cycles needed.
   */
  public int leastInterval(char[] tasks, int coolDown) {
    int[] map = new int[26];
    for (char c : tasks) {
      map[c - 'A']++;
    }
    PriorityQueue<Integer> queue = new PriorityQueue<>(26, Collections.reverseOrder());
    for (int count : map) {
      if (count > 0) {
        queue.add(count);
      }
    }
    int time = 0;
    while (!queue.isEmpty()) {
      int temp = 0;
      List<Integer> list = new ArrayList<>();
      while (temp <= coolDown) {
        if (!queue.isEmpty()) {
          if (queue.peek() > 1) {
            list.add(queue.poll() - 1);
          } else {
            queue.poll();
          }
        }
        time++;
        if (queue.isEmpty() && list.size() == 0) {
          break;
        }
        temp++;
      }
      for (int i : list) {
        queue.add(i);
      }
    }
    return time;
  }
}
