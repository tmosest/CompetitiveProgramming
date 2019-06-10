package com.tmosest.competitiveprogramming.leetcode.medium;

class BombEnemy {

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
          for (int r = i; r < grid.length && grid[r][j] != 'W'; r++) {
            if (grid[r][j] == 'E') {
              ++killCount;
            }
          }
          for (int r = i; r > -1 && grid[r][j] != 'W'; r--) {
            if (grid[r][j] == 'E') {
              ++killCount;
            }
          }
          for (int c = j; c < grid[0].length && grid[i][c] != 'W'; c++) {
            if (grid[i][c] == 'E') {
              ++killCount;
            }
          }
          for (int c = j; c > -1 && grid[i][c] != 'W'; c--) {
            if (grid[i][c] == 'E') {
              ++killCount;
            }
          }
          max = Math.max(killCount, max);
        }
      }
    }
    return max;
  }
}
