package com.tmosest.competitiveprogramming.leetcode.easy;

class DuplicateZeros {

  /**
   * Shifts numbers after zeros.
   *
   * @param arr The array of numbers.
   */
  void duplicateZeros(int[] arr) {
    int len = arr.length;
    for (int i = 0; i < len - 1; i++) {
      if (arr[i] == 0) {
        Integer prev = null;
        for (int j = i + 1; j < len; j++) {
          if (prev == null) {
            prev = arr[j];
            continue;
          }
          int temp = prev;
          prev = arr[j];
          arr[j] = temp;
        }
        arr[++i] = 0;
      }
    }
  }
}
