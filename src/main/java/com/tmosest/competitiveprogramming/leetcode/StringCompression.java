package com.tmosest.competitiveprogramming.leetcode;

public class StringCompression {

  /**
   * Compresses a string in place.
   * @param chars The array of characters.
   * @return The new end of the array.
   */
  public int compress(char[] chars) {
    int index = 1;
    int compressionIndex = 0;
    char prev = chars[0];
    int count = 1;

    while (index < chars.length) {
      char curr = chars[index];
      if (curr == prev) {
        ++count;
      } else {
        chars[compressionIndex++] = prev;
        if (count > 1) {
          String strCount = String.valueOf(count);
          for (int i = 0; i < strCount.length(); i++) {
            chars[compressionIndex++] = strCount.charAt(i);
          }
        }
        prev = curr;
        count = 1;
      }
      ++index;
    }
    // Don't forget to handle the last letter in the string.
    chars[compressionIndex++] = prev;
    if (count > 1) {
      String strCount = String.valueOf(count);
      for (int i = 0; i < strCount.length(); i++) {
        chars[compressionIndex++] = strCount.charAt(i);
      }
    }

    return compressionIndex;
  }
}
