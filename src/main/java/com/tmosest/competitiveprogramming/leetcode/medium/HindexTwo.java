package com.tmosest.competitiveprogramming.leetcode.medium;

class HindexTwo {

  int hindex(int[] citations) {
    int len = citations.length;
    int left = 0;
    int right = len;
    while (left < right) {
      int mid = left + right + 1 >>> 1;
      if (citations[len - mid] >= mid) {
        left = mid;
      } else {
        right = mid - 1;
      }
    }
    return right;
  }
}
