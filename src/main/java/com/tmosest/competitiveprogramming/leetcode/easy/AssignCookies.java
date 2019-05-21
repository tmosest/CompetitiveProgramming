package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class AssignCookies {
  /* Write code here. */

  /**
   * Assign cookies.
   *
   * @param arr Array of children.
   * @param more Array of cookies.
   * @return Cookies!!!
   */
  public int findContentChildren(int[] arr, int[] more) {
    if (more.length == 0 || arr.length == 0) {
      return 0;
    }
    int count = 0;
    Arrays.sort(more);
    Arrays.sort(arr);
    if (more[more.length - 1] < arr[0]) {
      return 0;
    }
    int temp = arr.length - 1;
    for (int i = more.length - 1; i >= 0; i--) {
      for (int j = temp; j >= 0; j--) {
        if (more[i] >= arr[j]) {
          count++;
          temp--;
          break;
        } else {
          temp--;
        }
      }
    }
    return count;
  }


}
