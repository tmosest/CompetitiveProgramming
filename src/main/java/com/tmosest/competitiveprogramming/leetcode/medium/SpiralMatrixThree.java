package com.tmosest.competitiveprogramming.leetcode.medium;

class SpiralMatrixThree {

  int[][] spiralMatrix(int rows, int cols, int rowStart, int colStart) {
    int[][] result = new int[rows * cols][2];
    int[] pos = {rowStart, colStart};
    int direction = 4;
    int moveAmount = 1;
    int index = 0;

    result[index++] = copy(pos);

    boolean[][] visited = new boolean[rows][cols];
    visited[pos[0]][pos[1]] = true;
    while (index < result.length) {
      while (direction != 0) {
        for (int mov = 0; mov < moveAmount; mov++) {
          switch (direction) {
            case 4:
              pos[1] += 1;
              break;
            case 3:
              pos[0] += 1;
              break;
            case 2:
              pos[1] -= 1;
              break;
            default:
              pos[0] -= 1;
          }
          if (index < result.length && pos[0] >= 0 && pos[0] < rows && pos[1] >= 0 && pos[1] < cols
              && !visited[pos[0]][pos[1]]) {
            result[index++] = copy(pos);
            visited[pos[0]][pos[1]] = true;
          }
        }
        if (direction == 3 || direction == 1) {
          ++moveAmount;
        }
        --direction;
      }
      direction = 4;
    }

    return result;
  }

  private int[] copy(int[] pos) {
    int[] res = new int[pos.length];

    for (int i = 0; i < pos.length; i++) {
      res[i] = pos[i];
    }

    return res;
  }
}
