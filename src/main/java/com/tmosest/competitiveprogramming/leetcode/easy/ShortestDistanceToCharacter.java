package com.tmosest.competitiveprogramming.leetcode.easy;

class ShortestDistanceToCharacter {
  /* Write code here. */

  /**
   * Determine the shortest distance to a character in a string for each spot.
   *
   * @param str The string.
   * @param letter The character.
   * @return An array of distances from each spot to the nearest index of the character.
   */
  public int[] shortestToChar(String str, char letter) {
    int length = str.length();
    int[] ans = new int[length];
    int prev = Integer.MIN_VALUE / 2;

    for (int i = 0; i < length; ++i) {
      if (str.charAt(i) == letter) {
        prev = i;
      }
      ans[i] = i - prev;
    }

    prev = Integer.MAX_VALUE / 2;
    for (int i = length - 1; i >= 0; --i) {
      if (str.charAt(i) == letter) {
        prev = i;
      }
      ans[i] = Math.min(ans[i], prev - i);
    }

    return ans;
  }


}
