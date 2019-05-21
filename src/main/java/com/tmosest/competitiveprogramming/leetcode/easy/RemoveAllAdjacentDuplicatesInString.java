package com.tmosest.competitiveprogramming.leetcode.easy;

class RemoveAllAdjacentDuplicatesInString {

  /**
   * Removes all duplicate adjacent letters from it.
   *
   * @param str The string to check.
   * @return The string with the duplicates removed.
   */
  public String removeDuplicates(String str) {
    int index;
    while ((index = firstDuplicateIndex(str)) != -1) {
      str = removeDuplicate(str, index);
    }
    return str;
  }

  private int firstDuplicateIndex(String str) {
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1)) {
        return i;
      }
    }
    return -1;
  }

  private String removeDuplicate(String str, int index) {
    if (str.length() + 1 > index) {
      return str.substring(0, index) + str.substring(index + 2);
    }
    return "";
  }
}
