package com.tmosest.competitiveprogramming.leetcode.easy;

class LicenseKeyFormatting {
  /* Write code here. */

  /**
   * Formats a string....
   *
   * @param str The string.
   * @param size The size between dashes.
   * @return formatted string.
   */
  public String licenseKeyFormatting(String str, int size) {
    StringBuilder result = new StringBuilder();

    int count = 0;
    for (int i = str.length() - 1; i >= 0; i--) {
      char letter = str.charAt(i);
      if (letter != '-') {
        if (count == size) {
          result.append('-');
          count = 0;
        }
        result.append(Character.toUpperCase(letter));
        count++;
      }
    }

    return result.reverse().toString();
  }


}
