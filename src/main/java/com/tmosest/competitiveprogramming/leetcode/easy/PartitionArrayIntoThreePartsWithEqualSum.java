package com.tmosest.competitiveprogramming.leetcode.easy;

class PartitionArrayIntoThreePartsWithEqualSum {
  /* Write code here. */

  /**
   * Determine if the array can be split into three equal sums.
   *
   * @param arr The array of integers.
   * @return True if it can be split into three equal sums.
   */
  public boolean canThreePartsEqualSum(int[] arr) {
    int[] sumArray = new int[arr.length];
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      sumArray[i] = sum;
    }
    for (int i = 0; i < arr.length - 1; i++) {
      int leftSum = sumArray[i];
      for (int j = i + 1; j < arr.length; j++) {
        int middleSum = sumArray[j] - sumArray[i];
        int rightSum = sumArray[arr.length - 1] - sumArray[j];
        if (leftSum == middleSum && middleSum == rightSum) {
          return true;
        }
      }
    }
    return false;
  }


}
