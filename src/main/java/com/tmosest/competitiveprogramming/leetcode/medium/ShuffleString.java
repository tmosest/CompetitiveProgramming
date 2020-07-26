package com.tmosest.competitiveprogramming.leetcode.medium;

class ShuffleString {

  String restoreString(String str, int[] indices) {
    char[] arr = new char[str.length()];
    for (int i = 0; i < indices.length; i++) {
      arr[indices[i]] = str.charAt(i);
    }
    return String.valueOf(arr);
  }
}
