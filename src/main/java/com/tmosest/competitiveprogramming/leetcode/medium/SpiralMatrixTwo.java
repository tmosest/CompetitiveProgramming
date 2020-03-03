package com.tmosest.competitiveprogramming.leetcode.medium;

class SpiralMatrixTwo {

  int[][] generateMatrix(int num) {
    int[][] result = new int[num][num];

    int topBound = 1;
    int leftBound = 0;
    int bottomBound = result.length;
    int rightBound = result[0].length;
    int val = 1;

    int[] position = {0, 0};

    while (topBound <= bottomBound && leftBound <= rightBound) {
      boolean wentRight = false;
      while (position[1] < rightBound) {
        result[position[0]][position[1]] = val++;
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
        result[position[0]][position[1]] = val++;
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
        result[position[0]][position[1]] = val++;
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
        result[position[0]][position[1]] = val++;
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
