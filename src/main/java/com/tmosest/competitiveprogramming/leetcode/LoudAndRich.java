package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

class LoudAndRich {

  private ArrayList<Integer>[] graph;
  private int[] answer;
  private int[] quiet;

  /**
   * Determine the rich silent people.
   * @param richer A set of relationships where x is richer that y.
   * @param quiet An array of quiet values.
   * @return An array of quiet rich people?
   */
  int[] loudAndRich(int[][] richer, int[] quiet) {
    int people = quiet.length;
    graph = new ArrayList[people];
    answer = new int[people];
    this.quiet = quiet;

    for (int node = 0; node < people; ++node) {
      graph[node] = new ArrayList<>();
    }

    for (int[] edge: richer) {
      graph[edge[1]].add(edge[0]);
    }

    Arrays.fill(answer, -1);

    for (int node = 0; node < people; ++node) {
      dfs(node);
    }
    return answer;
  }

  private int dfs(int node) {
    if (answer[node] == -1) {
      answer[node] = node;
      for (int child: graph[node]) {
        int cand = dfs(child);
        if (quiet[cand] < quiet[answer[node]]) {
          answer[node] = cand;
        }
      }
    }
    return answer[node];
  }
}
