package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class FindAndReplaceInString {

  /**
   * Find and replace.
   *
   * @param str The source string.
   * @param indexes The indexes to override.
   * @param sources The sources to replace.
   * @param targets The values to replace sources with.
   */
  public String findReplaceString(
      String str, int[] indexes, String[] sources, String[] targets
  ) {
    int len = str.length();
    int[] match = new int[len];
    Arrays.fill(match, -1);

    for (int i = 0; i < indexes.length; ++i) {
      int ix = indexes[i];
      if (str.substring(ix, ix + sources[i].length()).equals(sources[i])) {
        match[ix] = i;
      }
    }

    StringBuilder ans = new StringBuilder();
    int ix = 0;
    while (ix < len) {
      if (match[ix] >= 0) {
        ans.append(targets[match[ix]]);
        ix += sources[match[ix]].length();
      } else {
        ans.append(str.charAt(ix++));
      }
    }
    return ans.toString();
  }
}
