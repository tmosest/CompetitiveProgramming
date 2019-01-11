package com.tmosest.competitiveprogramming.leetcode;

public class ReverseOnlyLetters {

  /**
   *
   * @param str
   * @return
   */
  public String reverseOnlyLetters(String str) {
    char[] strArray = str.toCharArray();

    int left = 0;
    int right = strArray.length - 1;

    while (left < right) {
      char leftChar = strArray[left];
      char rightChar = strArray[right];
      boolean leftIsLetter = Character.isLetter(leftChar);
      boolean rightIsLetter = Character.isLetter(rightChar);
      if (leftIsLetter && rightIsLetter) {
        strArray[left] = rightChar;
        strArray[right] = leftChar;
        left++;
        right--;
      } else if (leftIsLetter) {
        right--;
      } else if (rightIsLetter) {
        left++;
      } else {
        left++;
        right--;
      }
    }

    return new String(strArray);
  }
}
