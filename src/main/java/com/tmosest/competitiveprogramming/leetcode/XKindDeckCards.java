package com.tmosest.competitiveprogramming.leetcode;

public class XKindDeckCards {

  /**
   * Determine if you can partition the deck into groups of X.
   * @param deck An array of integers representing the deck.
   * @return True if can be partitioned.
   */
  public boolean hasGroupsSizeX(int[] deck) {
    int[] counts = new int[10001];

    for (int card : deck) {
      counts[card]++;
    }

    int group = -1;
    for (int i = 0; i < 10001; ++i) {
      if (counts[i] > 0) {
        if (group == -1) {
          group = counts[i];
        } else {
          group = gcd(group, counts[i]);
        }
      }
    }
    return group >= 2;
  }

  private int gcd(int one, int two) {
    return one == 0 ? two : gcd(two % one, one);
  }
}
