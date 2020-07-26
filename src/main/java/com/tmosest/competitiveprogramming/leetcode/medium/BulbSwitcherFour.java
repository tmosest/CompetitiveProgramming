package com.tmosest.competitiveprogramming.leetcode.medium;

class BulbSwitcherFour {

  int minFlips(String target) {
    int flips = 0;
    for (int i = 0, b = 1; i < target.length(); ++i) {
      if (target.charAt(i) == '0' + b) {
        ++flips;
        b = 1 - b;
      }
    }
    return flips;
  }
}
