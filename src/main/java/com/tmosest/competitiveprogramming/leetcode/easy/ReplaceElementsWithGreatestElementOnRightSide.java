package com.tmosest.competitiveprogramming.leetcode.easy;

class ReplaceElementsWithGreatestElementOnRightSide {

  int[] replaceElements(int[] arr) {
    int[] res = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      int max = -1;
      if (i != arr.length - 1) {
        max = arr[i + 1];
        for (int j = i + 1; j < arr.length; j++) {
          max = Math.max(max, arr[j]);
        }
      }
      res[i] = max;
    }

    return res;
  }
}
