package com.tmosest.competitiveprogramming.leetcode.medium;

class PathWithMaximumProbability {

  /*
    Floyd–Warshall algorithm
    https://en.wikipedia.org/wiki/Floyd%E2%80%93Warshall_algorithm
   */
  double maxProbability(int num, int[][] edges, double[] succProb, int start, int end) {
    double[][] probs = new double[num][num];

    for (int i = 0; i < succProb.length; ++i) {
      int one = edges[i][0];
      int two = edges[i][1];
      probs[one][two] = probs[two][one] = succProb[i];
    }

    for (int k = 0; k < num; ++k) {
      for (int i = 0; i < num; ++i) {
        for (int j = 0; j < num; ++j) {
          probs[i][j] = Math.max(probs[i][j], probs[i][k] * probs[k][j]);
        }
      }
    }

    return probs[start][end];
  }
}
