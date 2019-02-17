package com.tmosest.competitiveprogramming.leetcode;

public class ConvertNumberHexadecimal {

  /**
   * Converts a number to the hex string of it.
   * @param num An integer to convert.
   * @return The hex string.
   */
  public String toHex(int num) {
    if (num == 0) {
      return "0";
    }
    char[] result = new char[8];
    int position = 7;
    char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    while (num != 0) {
      int index = num & 0xF;
      result[position--] = chars[index];
      num >>>= 4;
    }
    return new String(result, position + 1, 7 - position);
  }
}
