package com.tmosest.competitiveprogramming.leetcode.medium;

class PalindromicSubstrings {

  // TODO refactor to Manacher's Algorithm.
  int countSubstrings(String str) {
    char[] arr = new char[2 * str.length() + 3];
    arr[0] = '@';
    arr[1] = '#';
    arr[arr.length - 1] = '$';
    int index = 2;
    for (char c : str.toCharArray()) {
      arr[index++] = c;
      arr[index++] = '#';
    }

    int[] temp = new int[arr.length];
    int center = 0;
    int right = 0;
    for (int i = 1; i < temp.length - 1; ++i) {
      if (i < right) {
        temp[i] = Math.min(right - i, temp[2 * center - i]);
      }
      while (arr[i + temp[i] + 1] == arr[i - temp[i] - 1]) {
        temp[i]++;
      }
      if (i + temp[i] > right) {
        center = i;
        right = i + temp[i];
      }
    }
    int ans = 0;
    for (int v : temp) {
      ans += (v + 1) / 2;
    }
    return ans;
  }
}
