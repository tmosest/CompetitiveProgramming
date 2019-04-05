package com.tmosest.competitiveprogramming.leetcode;

public class FourKeysKeyboard {

  /**
   * Determine the most number of A's that can be printed on the screen.
   * Given four actions: 1) Print A, 2) Select whole screen, 3) Copy, 4) Paste
   * @param keyStrokes Number of key strokes.
   * @return The max number of A's.
   */
  public int maxA(int keyStrokes) {
    int[] best = new int[keyStrokes + 1];
    for (int k = 1; k <= keyStrokes; ++k) {
      best[k] = best[k - 1] + 1;
      for (int x = 0; x < k - 1; ++x) {
        best[k] = Math.max(best[k], best[x] * (k - x - 1));
      }
    }
    return best[keyStrokes];
  }
}
