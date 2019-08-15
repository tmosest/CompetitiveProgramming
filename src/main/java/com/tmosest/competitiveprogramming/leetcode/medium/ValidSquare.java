package com.tmosest.competitiveprogramming.leetcode.medium;

class ValidSquare {

  private double dist(int[] p1, int[] p2) {
    return (p2[1] - p1[1]) * (p2[1] - p1[1]) + (p2[0] - p1[0]) * (p2[0] - p1[0]);
  }

  private boolean check(int[] p1, int[] p2, int[] p3, int[] p4) {
    return dist(p1, p2) > 0 && dist(p1, p2) == dist(p2, p3) && dist(p2, p3) == dist(p3, p4)
        && dist(p3, p4) == dist(p4, p1) && dist(p1, p3) == dist(p2, p4);
  }

  boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
    int[][] input = {p1, p2, p3, p4};
    return checkAllPermutations(input, 0);
  }

  private boolean checkAllPermutations(int[][] arr, int len) {
    if (len == 4) {
      return check(arr[0], arr[1], arr[2], arr[3]);
    } else {
      boolean res = false;
      for (int i = len; i < 4; i++) {
        swap(arr, len, i);
        res |= checkAllPermutations(arr, len + 1);
        swap(arr, len, i);
      }
      return res;
    }
  }

  private void swap(int[][] arr, int one, int two) {
    int[] temp = arr[one];
    arr[one] = arr[two];
    arr[two] = temp;
  }
}
