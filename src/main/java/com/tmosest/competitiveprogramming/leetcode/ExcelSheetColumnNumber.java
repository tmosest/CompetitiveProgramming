package com.tmosest.competitiveprogramming.leetcode;

public class ExcelSheetColumnNumber {

  /**
   * Takes an excel sheet column header ("AAB") and converts it to a number.
   * @param str The column header.
   * @return The integer value of that column.
   */
  public int titleToNumber(String str) {
    int result = 0;
    int exp = 0;

    for (int i = str.length() - 1; i >= 0; i--) {
      result += (str.charAt(i) - 'A' + 1) * Math.pow(26, exp++);
    }

    return result;
  }
}
