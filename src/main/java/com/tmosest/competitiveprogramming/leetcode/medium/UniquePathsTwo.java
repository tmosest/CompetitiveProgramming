package com.tmosest.competitiveprogramming.leetcode.medium;

class UniquePathsTwo {

  /**
   * Find unique paths with obstacles.
   *
   * @param obstacleGrid The grid with obstacles.
   * @return The number of unique paths.
   */
  int uniquePathsWithObstacles(int[][] obstacleGrid) {
    // If the starting cell has an obstacle, then simply return as there would be
    // no paths to the destination.
    if (obstacleGrid[0][0] == 1) {
      return 0;
    }

    // Number of ways of reaching the starting cell = 1.
    obstacleGrid[0][0] = 1;

    int row = obstacleGrid.length;
    int col = obstacleGrid[0].length;

    // Filling the values for the first column
    for (int i = 1; i < row; i++) {
      obstacleGrid[i][0] = (obstacleGrid[i][0] == 0 && obstacleGrid[i - 1][0] == 1) ? 1 : 0;
    }

    // Filling the values for the first row
    for (int i = 1; i < col; i++) {
      obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i - 1] == 1) ? 1 : 0;
    }

    // Starting from cell(1,1) fill up the values
    // No. of ways of reaching cell[i][j] = cell[i - 1][j] + cell[i][j - 1]
    // i.e. From above and left.
    for (int i = 1; i < row; i++) {
      for (int j = 1; j < col; j++) {
        if (obstacleGrid[i][j] == 0) {
          obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
        } else {
          obstacleGrid[i][j] = 0;
        }
      }
    }

    // Return value stored in rightmost bottommost cell. That is the destination.
    return obstacleGrid[row - 1][col - 1];
  }
}
