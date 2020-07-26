package com.tmosest.competitiveprogramming.leetcode.medium;

class CountTripletsThatCanFormTwoArraysOfEqualXor {

  int countTriplets(int[] arr) {
    int count = 0;
    int len = arr.length;
    int[] xors = new int[len + 1];
    // xors[i] stores xor till i-1 element
    for (int i = 0; i < len; i++) {
      xors[i + 1] = xors[i] ^ arr[i];
    }
    for (int i = 0; i < len; i++) {
      for (int k = i + 1; k < len; k++) {
        if ((xors[k + 1] ^ xors[i]) == 0) {
          count += (k - i);
        }
      }
    }
    return count;
  }
}
