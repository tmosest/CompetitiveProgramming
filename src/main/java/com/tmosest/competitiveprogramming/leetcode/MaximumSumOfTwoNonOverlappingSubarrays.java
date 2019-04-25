package com.tmosest.competitiveprogramming.leetcode;

class MaximumSumOfTwoNonOverlappingSubarrays {

  /**
   * Find the max sum of two non-overlapping sub-arrays with two different lengths.
   * @param arr The array of integers.
   * @param lengthFirst The first length.
   * @param lengthSecond The second length.
   * @return The max sum of both arrays.
   */
  int maxSumTwoNoOverlap(int[] arr, int lengthFirst, int lengthSecond) {
    int sum = 0;
    int max = Integer.MIN_VALUE;
    int leftMax = Integer.MIN_VALUE;
    int rightMax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (i >= lengthFirst - 1) {
        leftMax = Math.max(
            leftMax,
            helper(
                arr,
                i - lengthSecond - lengthFirst + 1,
                i - lengthFirst, leftMax
            )
        );
        max = Math.max(max, leftMax + sum);
        sum -= arr[i - lengthFirst + 1];
      }
    }
    sum = 0;
    for (int i = arr.length - 1; i >= 0; i--) {
      sum += arr[i];
      if (i <= arr.length - lengthFirst) {
        rightMax = Math.max(
            rightMax,
            helper(
                arr,
                i + lengthFirst,
                i + lengthSecond + lengthFirst - 1,
                rightMax
            )
        );
        max = Math.max(max, rightMax + sum);
        sum -= arr[i + lengthFirst - 1];
      }
    }
    return max;
  }

  private int helper(int[] arr, int left, int right, int preMax) {
    if (left < 0 || right >= arr.length) {
      return Integer.MIN_VALUE;
    }
    int sum = 0;
    for (int i = left; i <= right; i++) {
      sum += arr[i];
    }
    return Math.max(sum, preMax);
  }
}
