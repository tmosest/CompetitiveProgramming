package com.tmosest.competitiveprogramming.leetcode.easy;

class RemovePalindromicSubsequences {

  int removePalindromeSub(String str) {
    if (str.length() == 0) {
      return 0;
    }
    if (isPalindrome(str)) {
      return 1;
    }
    return 2;
  }

  private boolean isPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;
    while (left < right) {
      if (!(str.charAt(left++) == str.charAt(right--))) {
        return false;
      }
    }
    return true;
  }
}
