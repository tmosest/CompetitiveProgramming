package com.tmosest.competitiveprogramming.leetcode.medium;

class BreakPalindrome {

  String breakPalindrome(String palindrome) {
    if (palindrome == null || palindrome.length() < 2) {
      return "";
    }

    char[] arr = palindrome.toCharArray();
    int len = arr.length;
    int index = 0;
    for (; index < len; index++) {
      if (arr[index] != 'a') {
        if (index == len / 2) {
          continue;
        }
        arr[index] = 'a';
        break;
      }
    }

    if (index == len) {
      arr[len - 1] = 'b';
    }

    return new String(arr);
  }
}
