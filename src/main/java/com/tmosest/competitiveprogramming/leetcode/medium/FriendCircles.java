package com.tmosest.competitiveprogramming.leetcode.medium;

class FriendCircles {

  int findCircleNum(int[][] matrix) {
    int[] visited = new int[matrix.length];
    int count = 0;
    for (int i = 0; i < matrix.length; i++) {
      if (visited[i] == 0) {
        dfs(matrix, visited, i);
        count++;
      }
    }
    return count;
  }

  private void dfs(int[][] matrix, int[] visited, int index) {
    for (int j = 0; j < matrix.length; j++) {
      if (matrix[index][j] == 1 && visited[j] == 0) {
        visited[j] = 1;
        dfs(matrix, visited, j);
      }
    }
  }
}
