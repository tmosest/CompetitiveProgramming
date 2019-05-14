package com.tmosest.competitiveprogramming.leetcode.easy;

class NumberOfLinesToWriteString {
  /* Write code here. */

  /**
   * Determine the number of lines it would take to write the string.
   *
   * @param widths Array of character widths.
   * @param str The string to write.
   * @return Number of lines.
   */
  public int[] numberOfLines(int[] widths, String str) {
    int lines = 1;
    int width = 0;
    for (char c : str.toCharArray()) {
      int charWidth = widths[c - 'a'];
      width += charWidth;
      if (width > 100) {
        lines++;
        width = charWidth;
      }
    }
    return new int[]{lines, width};
  }


}
