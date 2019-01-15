package com.tmosest.competitiveprogramming.leetcode;

public class FairCandySwap {

  /**
   * Determines which candy bars need to be traded to have equal values.
   * @param personA Person A's candy bar sizes.
   * @param personB Person B's candy bar sizes.
   * @return An array showing what value each person needs to trade.
   */
  public int[] fairCandySwap(int[] personA, int[] personB) {
    int[] result = new int[2];
    int sumA = 0;
    for (int i : personA) {
      sumA += i;
    }
    int sumB = 0;
    for (int i : personB) {
      sumB += i;
    }
    for (int i : personA) {
      int val = (sumB - sumA) / 2 + i;
      for (int j : personB) {
        if (j == val) {
          result[0] = i;
          result[1] = j;
          return result;
        }
      }
    }
    return result;
  }
}
