package com.tmosest.competitiveprogramming.leetcode.medium;

class BeautifulArrangement {

  private int count = 0;

  /**
   * Count the number of beautiful arrangements.
   * @param num The size.
   * @return Number of beautiful arrangements.
   */
  int countArrangement(int num) {
    boolean[] visited = new boolean[num + 1];
    calculate(num, 1, visited);
    return count;
  }

  private void calculate(int num, int pos, boolean[] visited) {
    if (pos > num) {
      count++;
    }
    for (int i = 1; i <= num; i++) {
      if (!visited[i] && (pos % i == 0 || i % pos == 0)) {
        visited[i] = true;
        calculate(num, pos + 1, visited);
        visited[i] = false;
      }
    }
  }
}
