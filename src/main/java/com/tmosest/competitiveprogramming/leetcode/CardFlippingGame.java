package com.tmosest.competitiveprogramming.leetcode;

import java.util.HashSet;
import java.util.Set;

class CardFlippingGame {

  /**
   * Determine the min number that works for a card flip.
   * @param fronts The front values.
   * @param backs The back values.
   * @return The min value.
   */
  int flipgame(int[] fronts, int[] backs) {
    Set<Integer> same = new HashSet<>();
    for (int i = 0; i < fronts.length; ++i) {
      if (fronts[i] == backs[i]) {
        same.add(fronts[i]);
      }
    }

    int ans = 9999;
    for (int x: fronts) {
      if (!same.contains(x)) {
        ans = Math.min(ans, x);
      }
    }

    for (int x: backs) {
      if (!same.contains(x)) {
        ans = Math.min(ans, x);
      }
    }

    return ans % 9999;
  }
}
