package com.tmosest.competitiveprogramming.leetcode.medium;

class SplitTwoStringsToMakePalindrome {

  boolean checkPalindromeFormation(String one, String two) {
    return checkPalidronHelper(one, two) || checkPalidronHelper(two, one);
  }

  private boolean checkPalidronHelper(String one, String two) {
    int len = one.length();
    int left = (len - 1) / 2;
    int right = len / 2;
    boolean switched = false;

    while (left >= 0 && right < len) {
      if (!switched) {
        if (one.charAt(left) != one.charAt(right)) {
          switched = true;
          left++;
          right--;
        }
      } else {
        return palin(one, two, left, right) || palin(two, one, left, right);
      }
      left--;
      right++;
    }
    return true;
  }

  private boolean palin(String one, String two, int left, int right) {
    while (left >= 0 && right < one.length()) {
      if (one.charAt(left) != two.charAt(right)) {
        return false;
      }
      left--;
      right++;
    }
    return true;
  }
}
