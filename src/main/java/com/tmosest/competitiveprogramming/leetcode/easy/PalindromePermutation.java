package com.tmosest.competitiveprogramming.leetcode.easy;

class PalindromePermutation {
  /* Write code here. */

  /**
   * Function to determine if a string is a permutation of a palindrome.
   *
   * @param str The string.
   * @return True if we could rearrange the string into a palindrome.
   */
  public boolean canPermutePalindrome(String str) {
    if (str == null || str.length() < 1) {
      return true;
    }
    int[] letterCounts = new int[2000];
    char[] strArray = str.toCharArray();

    for (int i = 0; i < strArray.length; i++) {
      letterCounts[(int) strArray[i]]++;
    }

    int oddCount = 0;
    boolean isOdd = letterCounts.length % 2 == 0;
    for (int i = 0; i < letterCounts.length; i++) {
      if (letterCounts[i] % 2 == 1) {
        oddCount++;
        if (!isOdd || (isOdd && oddCount > 1)) {
          return false;
        }
      }
    }

    return true;
  }


}
