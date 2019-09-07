package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Stack;

class MostStonesRemovedWithSameRowOrColumn {

  int removeStones(int[][] stones) {
    int len = stones.length;

    // graph[i][0] = the length of the 'list' graph[i][1:]
    int[][] graph = new int[len][len];
    for (int i = 0; i < len; ++i) {
      for (int j = i + 1; j < len; ++j) {
        if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
          graph[i][++graph[i][0]] = j;
          graph[j][++graph[j][0]] = i;
        }
      }
    }

    int ans = 0;
    boolean[] seen = new boolean[len];
    for (int i = 0; i < len; ++i) {
      if (!seen[i]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(i);
        seen[i] = true;
        ans--;
        while (!stack.isEmpty()) {
          int node = stack.pop();
          ans++;
          for (int k = 1; k <= graph[node][0]; ++k) {
            int nei = graph[node][k];
            if (!seen[nei]) {
              stack.push(nei);
              seen[nei] = true;
            }
          }
        }
      }
    }
    return ans;
  }
}
