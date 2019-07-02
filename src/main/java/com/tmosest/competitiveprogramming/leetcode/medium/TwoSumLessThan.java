package com.tmosest.competitiveprogramming.leetcode.medium;

class TwoSumLessThan {

  /**
   * Determine the max sum less than K.
   *
   * @param arr The inputs.
   * @param limit The limiting sum.
   * @return TThe max less than the limit.
   */
  int twoSumLessThanK(int[] arr, int limit) {
    int result = -1;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int sum = arr[i] + arr[j];
        if (sum < limit) {
          result = Math.max(result, sum);
        }
      }
    }
    return result;
  }
}
