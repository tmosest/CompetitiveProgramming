package com.tmosest.competitiveprogramming.leetcode.easy;

class FindTheDistanceValueBetweenTwoArrays {

  int findTheDistanceValue(int[] arr1, int[] arr2, int diff) {
    int res = 0;

    for (int num : arr1) {
      res++;
      for (int other : arr2) {
        if (Math.abs(num - other) <= diff) {
          res--;
          break;
        }
      }
    }

    return res;
  }
}
