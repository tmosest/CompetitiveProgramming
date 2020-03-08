package com.tmosest.competitiveprogramming.leetcode.medium;

class BulbSwitcherThree {

  int numTimesAllBlue(int[] light) {
    int blueCount = 0;
    boolean[] bulbStates = new boolean[light.length];

    for (int index : light) {
      bulbStates[index - 1] = true;
      if (isBlue(bulbStates)) {
        ++blueCount;
      }
    }

    return blueCount;
  }

  private boolean isBlue(boolean[] bulbStates) {
    for (int i = 1; i < bulbStates.length; i++) {
      if (bulbStates[i] && !bulbStates[i - 1]) {
        return false;
      }
    }
    return true;
  }
}
