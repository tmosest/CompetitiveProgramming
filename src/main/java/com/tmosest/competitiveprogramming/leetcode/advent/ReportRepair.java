package com.tmosest.competitiveprogramming.leetcode.advent;

class ReportRepair {

  int findMultipleOfSum(int[] arrs, int sum) {

    int length = arrs.length;

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if (i == j) {
          continue;
        }
        if (arrs[i] + arrs[j] == sum) {
          return arrs[i] * arrs[j];
        }
      }
    }

    return -1;
  }

  int findMultipleOfThreeSum(int[] arrs, int sum) {

    int length = arrs.length;

    for (int i = 0; i < length; i++) {
      int target = sum - arrs[i];
      int mult = findMultipleOfSum(arrs, target);
      if (mult > -1) {
        return mult * arrs[i];
      }
    }

    return -1;
  }
}
