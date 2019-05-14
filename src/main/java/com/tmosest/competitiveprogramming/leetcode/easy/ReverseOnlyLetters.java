package com.tmosest.competitiveprogramming.leetcode.easy;

class ReverseOnlyLetters {
  /* Write code here. */

  /**
   * Reverse only the letters in a string.
   *
   * @param str The string to reverse.
   * @return A reversed string.
   */
  public String reverseOnlyLetters(String str) {
    char[] strArray = str.toCharArray();

    int left = 0;
    int right = strArray.length - 1;

    while (left < right) {
      while (left < right && !Character.isLetter(strArray[left])) {
        left++;
      }
      while (right > left && !Character.isLetter(strArray[right])) {
        right--;
      }
      char temp = strArray[left];
      strArray[left] = strArray[right];
      strArray[right] = temp;

      left++;
      right--;
    }

    return new String(strArray);
  }


}
