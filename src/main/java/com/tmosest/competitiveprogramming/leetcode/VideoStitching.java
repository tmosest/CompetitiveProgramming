package com.tmosest.competitiveprogramming.leetcode;

import java.util.PriorityQueue;
import java.util.Stack;

public class VideoStitching {

  /**
   * Determine the minimum number of clips to make a film from [0, time].
   * @param clips An array of "intervals".
   * @param time The time to cover.
   * @return The minimum number of clips needed.
   */
  public int videoStitching(int[][] clips, int time) {
    PriorityQueue<int[]> pq = new PriorityQueue<>((one, two) -> {
      if (one[0] != two[0]) {
        return one[0] - two[0];
      }
      return two[1] - one[1];
    });
    for (int[] clip : clips) {
      pq.offer(clip);
    }
    Stack<int[]> stack = new Stack<>();
    stack.push(new int[]{ -1, 0 });
    int min = Integer.MAX_VALUE;
    while (!pq.isEmpty()) {
      if (stack.peek()[1] >= time) {
        min = Math.min(min, stack.size() - 1);
      }
      int[] clip = pq.poll();
      if (!stack.isEmpty() && clip[0] <= stack.peek()[0] && clip[1] >= stack.peek()[1]) {
        stack.pop();
      }
      if (clip[0] > stack.peek()[1]) {
        return min == Integer.MAX_VALUE ? -1 : min;
      }
      if (stack.peek()[1] >= clip[1]) {
        continue;
      }
      stack.push(new int[]{ stack.peek()[1], clip[1] });
    }
    if (stack.peek()[1] >= time) {
      min = Math.min(min, stack.size() - 1);
    }
    return min == Integer.MAX_VALUE ? -1 : min;
  }
}
