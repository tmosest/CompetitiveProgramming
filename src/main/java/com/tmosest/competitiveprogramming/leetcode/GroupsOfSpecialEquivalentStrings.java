package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GroupsOfSpecialEquivalentStrings {

  /**
   * Determine the number of special groups.
   * @param array An array of strings.
   * @return The number of groups.
   */
  public int numSpecialEquivGroups(String[] array) {
    Set<String> seen = new HashSet<>();
    for (String str: array) {
      int[] count = new int[52];
      for (int i = 0; i < str.length(); ++i) {
        count[str.charAt(i) - 'a' + 26 * (i % 2)]++;
      }
      seen.add(Arrays.toString(count));
    }
    return seen.size();
  }
}
