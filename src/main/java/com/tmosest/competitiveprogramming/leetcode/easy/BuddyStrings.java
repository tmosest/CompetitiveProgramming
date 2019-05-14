package com.tmosest.competitiveprogramming.leetcode.easy;

class BuddyStrings {
  /* Write code here. */

  /**
   * Determine if the strings could match with a single swap.
   *
   * @param one The first string.
   * @param two The second string.
   * @return True if we could swap two letters in the first to make the second.
   */
  public boolean buddyStrings(String one, String two) {
    if (one.length() != two.length()) {
      return false;
    }
    if (one.equals(two)) {
      int[] count = new int[26];
      for (int i = 0; i < one.length(); ++i) {
        count[one.charAt(i) - 'a']++;
      }

      for (int c : count) {
        if (c > 1) {
          return true;
        }
      }
      return false;
    }
    int first = -1;
    int second = -1;
    for (int i = 0; i < one.length(); ++i) {
      if (one.charAt(i) != two.charAt(i)) {
        if (first == -1) {
          first = i;
        } else if (second == -1) {
          second = i;
        } else {
          return false;
        }
      }
    }
    return (second != -1 && one.charAt(first) == two.charAt(second)
        && one.charAt(second) == two.charAt(first));
  }


}
