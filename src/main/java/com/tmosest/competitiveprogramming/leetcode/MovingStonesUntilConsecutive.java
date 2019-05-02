package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;

class MovingStonesUntilConsecutive {

  /**
   * Determine moves in stone game.
   *
   * @param one one.
   * @param two two.
   * @param three three.
   * @return The result.
   */
  int[] numMovesStones(int one, int two, int three) {
    int[] temp = new int[3];
    temp[0] = one;
    temp[1] = two;
    temp[2] = three;
    if (!(temp[0] <= temp[1] && temp[1] <= temp[2])) {
      Arrays.sort(temp);
      return numMovesStones(temp[0], temp[1], temp[2]);
    }
    if (two - one == 1 && three - two == 1) {
      return new int[]{0, 0};
    }
    int min = two - one == 1 || three - two == 1 || two - one == 2 || three - two == 2 ? 1 : 2;
    int max = three - one - 2;
    return new int[]{min, max};
  }
}
