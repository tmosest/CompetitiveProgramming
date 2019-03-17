package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

  /**
   * Return the elements of a matrix in spiral order.
   * @param matrix The matrix.
   * @return A list of elements in spiral order.
   */
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    if (matrix.length < 1) {
      return result;
    }
    int topBound = 1;
    int leftBound = 0;
    int bottomBound = matrix.length;
    int rightBound = matrix[0].length;

    int[] position = {0, 0};

    while (topBound <= bottomBound && leftBound <= rightBound) {
      boolean wentRight = false;
      while (position[1] < rightBound) {
        result.add(matrix[position[0]][position[1]]);
        position[1]++;
        wentRight = true;
      }
      if (wentRight) {
        position[0]++;
        position[1]--;
      }
      rightBound--;

      boolean wentDown = false;
      while (wentRight && position[0] < bottomBound) {
        result.add(matrix[position[0]][position[1]]);
        position[0]++;
        wentDown = true;
      }
      if (wentDown) {
        position[0]--;
        position[1]--;
      }
      bottomBound--;

      boolean wentLeft = false;
      while (wentDown && position[1] >= leftBound) {
        result.add(matrix[position[0]][position[1]]);
        position[1]--;
        wentLeft = true;
      }
      if (wentLeft) {
        position[0]--;
        position[1]++;
      }
      leftBound++;


      boolean wentUp = false;
      while (wentLeft && position[0] >= topBound) {
        result.add(matrix[position[0]][position[1]]);
        position[0]--;
        wentUp = true;
      }
      if (wentUp) {
        position[0]++;
        position[1]++;
      }
      topBound++;
    }

    return result;
  }
}
