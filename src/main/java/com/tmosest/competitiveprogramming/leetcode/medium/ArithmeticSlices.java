package com.tmosest.competitiveprogramming.leetcode.medium;

class ArithmeticSlices {

  /**
   * Determine how many slices are arithmetic sequences.
   *
   * @param arr The array of data.
   * @return The number of arithmetic slices.
   */
  public int numberOfArithmeticSlices(int[] arr) {
    int count = 0;
    int sum = 0;
    for (int i = 2; i < arr.length; i++) {
      if (arr[i] - arr[i - 1] == arr[i - 1] - arr[i - 2]) {
        count++;
      } else {
        sum += (count + 1) * (count) / 2;
        count = 0;
      }
    }
    return sum += count * (count + 1) / 2;
  }
}
