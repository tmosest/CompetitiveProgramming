package com.tmosest.competitiveprogramming.leetcode.medium;

class BombEnemy {

  private int[][] deltas = {
      {1, 0},
      {-1, 0},
      {0, 1},
      {0, -1}
  };

  /**
   * Determine the max number of enemies killed by one bomb.
   *
   * @param grid The grid.
   * @return Max that can be killed via one bomb.
   */
  int maxKilledEnemies(char[][] grid) {
    int max = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        // Empty Cell.
        if (grid[i][j] == '0') {
          int killCount = 0;
          for (int[] delta : deltas) {
            for (int r = i, c = j;
                r > -1 && r < grid.length && c > -1 && c < grid[0].length && grid[r][c] != 'W';
                r += delta[0], c += delta[1]
            ) {
              if (grid[r][c] == 'E') {
                ++killCount;
              }
            }
          }
          max = Math.max(killCount, max);
        }
      }
    }
    return max;
  }
}
