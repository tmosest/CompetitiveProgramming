package com.tmosest.competitiveprogramming.leetcode;

public class ExcelSheetColumnNumber {

  /**
   * Takes an excel sheet column header ("AAB") and converts it to a number.
   * @param str The column header.
   * @return The integer value of that column.
   */
  public int titleToNumber(String str) {
    int result = 0;

    for (int i = str.length() - 1; i >= 0; i--) {
      char letter = str.charAt(i);
      int value = (letter - 'A') + 1;
      if (i == str.length() - 1) {
        result += value;
      } else {
        int multiplier = (int) Math.pow(26, str.length() - 1 - i);
        result += multiplier * value;
      }
    }

    return result;
  }
}
