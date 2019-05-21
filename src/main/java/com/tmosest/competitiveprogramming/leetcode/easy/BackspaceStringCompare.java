package com.tmosest.competitiveprogramming.leetcode.easy;

class BackspaceStringCompare {
  /* Write code here. */

  /**
   * Determine if two strings are equal when # means a backspace.
   *
   * @param stringOne First String.
   * @param stringTwo Second String.
   * @return True if they are equal and false otherwise.
   */
  public boolean backspaceCompare(String stringOne, String stringTwo) {
    return backSpaceString(stringOne).equals(backSpaceString(stringTwo));
  }

  private String backSpaceString(String string) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < string.length(); i++) {
      char letter = string.charAt(i);
      if (letter == '#') {
        if (stringBuilder.length() > 0) {
          stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
      } else {
        stringBuilder.append(letter);
      }
    }
    return stringBuilder.toString();
  }


}
