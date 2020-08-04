package com.tmosest.competitiveprogramming.leetcode.medium;

class FindTheWinnerOfAnArrayGame {

  int getWinner(int[] arr, int diff) {
    int cur = arr[0];
    int win = 0;
    for (int i = 1; i < arr.length; ++i) {
      if (arr[i] > cur) {
        cur = arr[i];
        win = 0;
      }
      if (++win == diff) {
        break;
      }
    }
    return cur;
  }
}
