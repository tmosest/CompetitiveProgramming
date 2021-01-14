package com.tmosest.competitiveprogramming.leetcode.easy;

class DecodeXoredArray {

  int[] decode(int[] encoded, int first) {
    int len = encoded.length;
    int[] arr = new int[len + 1];

    arr[0] = first;
    for (int i = 1; i <= len; i++) {
      arr[i] = encoded[i - 1] ^ arr[i - 1];
    }

    return arr;
  }
}
