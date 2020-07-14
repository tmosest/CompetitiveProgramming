package com.tmosest.competitiveprogramming.leetcode.medium;

class LastMomentBeforeAllAntsFallOutOfPlank {

  int getLastMoment(int len, int[] left, int[] right) {
    int res = 0;

    for (int ant : left) {
      res = Math.max(res, timeForAnt(len, ant, false));
    }

    for (int ant : right) {
      res = Math.max(res, timeForAnt(len, ant, true));
    }

    return res;
  }

  private int timeForAnt(int len, int pos, boolean isRight) {
    int endpoint = isRight ? len : 0;
    return Math.abs(endpoint - pos);
  }
}
