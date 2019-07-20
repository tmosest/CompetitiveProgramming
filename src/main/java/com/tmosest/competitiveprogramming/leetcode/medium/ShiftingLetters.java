package com.tmosest.competitiveprogramming.leetcode.medium;

class ShiftingLetters {

  /**
   * Determine number of shifts.
   *
   * @param str The string.
   * @param shifts The value shifts.
   * @return String!
   */
  String shiftingLetters(String str, int[] shifts) {
    StringBuilder ans = new StringBuilder();
    int temp = 0;
    for (int shift : shifts) {
      temp = (temp + shift) % 26;
    }

    for (int i = 0; i < str.length(); ++i) {
      int index = str.charAt(i) - 'a';
      ans.append((char) ((index + temp) % 26 + 97));
      temp = Math.floorMod(temp - shifts[i], 26);
    }

    return ans.toString();
  }
}
