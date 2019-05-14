package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

class ZeroOneMatrix {
  /* Write code here. */

  private int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

  /**
   * Determine each points closest distance to zero.
   *
   * @param matrix The matrix of ones and zeros.
   * @return A matrix of min distance from zero for each point.
   */
  public int[][] updateMatrix(int[][] matrix) {
    Queue<Point> queue = new LinkedList<>();

    // Fill 1 with -1
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 1) {
          matrix[i][j] = -1;
        } else {
          queue.offer(new Point(i, j));
        }
      }
    }

    // BFS starting from each 0 cell
    int length = 0;
    while (!queue.isEmpty()) {
      int size = queue.size();
      length++;
      for (int i = 0; i < size; i++) {
        Point curPoint = queue.poll();
        for (int[] dir : dirs) {
          int ii = curPoint.row + dir[0];
          int jj = curPoint.col + dir[1];

          if (ii >= 0 && jj >= 0 && ii < matrix.length && jj < matrix[0].length) {
            if (matrix[ii][jj] == -1) {
              matrix[ii][jj] = length;
              queue.offer(new Point(ii, jj));
            }
          }
        }
      }
    }

    return matrix;
  }

  private class Point {

    int row;
    int col;

    private Point(int row, int col) {
      this.row = row;
      this.col = col;
    }
  }


}
