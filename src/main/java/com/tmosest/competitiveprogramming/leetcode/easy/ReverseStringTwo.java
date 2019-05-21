package com.tmosest.competitiveprogramming.leetcode.easy;

class ReverseStringTwo {
  /* Write code here. */

  /**
   * Weird reversal rules.
   *
   * @param str The string to reverse.
   * @param count The count for reversal rules.
   * @return Return the reversed string thing.
   */
  public String reverseStr(String str, int count) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i += 2 * count) {
      if (count + i >= str.length()) {
        for (int j = Math.min(i + count - 1, str.length() - 1); j >= i; j--) {
          result.append(str.charAt(j));
        }
      } else {
        for (int j = Math.min(i + count - 1, str.length() - 1); j >= i; j--) {
          result.append(str.charAt(j));
        }
        for (int j = i + count; j < Math.min(str.length(), i + 2 * count); j++) {
          result.append(str.charAt(j));
        }
      }
    }
    return result.toString();
  }


}
