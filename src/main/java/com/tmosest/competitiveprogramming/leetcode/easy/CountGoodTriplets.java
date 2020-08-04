package com.tmosest.competitiveprogramming.leetcode.easy;

class CountGoodTriplets {

  int countGoodTriplets(int[] arr, int one, int two, int three) {
    int res = 0;
    int len = arr.length;
    for (int i = 0; i < len - 2; i++) {
      for (int j = i + 1; j < len - 1; j++) {
        if (Math.abs(arr[i] - arr[j]) > one) {
          continue;
        }
        for (int k = j + 1; k < len; k++) {
          if (Math.abs(arr[j] - arr[k]) <= two && Math.abs(arr[k] - arr[i]) <= three) {
            res++;
          }
        }
      }
    }
    return res;
  }
}
