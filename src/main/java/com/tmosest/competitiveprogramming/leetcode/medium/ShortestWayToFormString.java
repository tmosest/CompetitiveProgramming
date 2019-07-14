package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class ShortestWayToFormString {

  /**
   * Determine the shortest way to make the string.
   *
   * @param source The source string.
   * @param target The target string.
   * @return The min number of moves needed.
   */
  public int shortestWay(String source, String target) {
    char[] str = source.toCharArray();

    int len = str.length;

    // Build inverted index for source
    int[][] dict = new int[len][26];

    Arrays.fill(dict[len - 1], -1); // -1 represents no occurrence of the character

    dict[len - 1][str[len - 1] - 'a'] = len - 1;
    for (int x = len - 2; x >= 0; --x) {
      dict[x] = Arrays.copyOf(dict[x + 1], 26);
      dict[x][str[x] - 'a'] = x;
    }

    int ans = 0;
    int idx = 0;
    // Go through target and account for each character
    char[] temp = target.toCharArray();
    for (char c : temp) {
      // If there are no occurrences of c with index greater than 0
      // then it doesn't occur at all. Hence, we cannot get that letter from
      // a subsequence of source.
      if (dict[0][c - 'a'] == -1) {
        return -1;
      }

      // If there are no c's left in source that occur >= idx
      // but there are c's from earlier in the subsequence
      // add 1 to subsequence count and reset idx of source to 0.
      if (dict[idx][c - 'a'] == -1) {
        ++ans;
        idx = 0;
      }

      // Then continue taking letters from the subsequence
      idx = dict[idx][c - 'a'] + 1;

      if (idx == len) {
        ++ans;
        idx = 0;
      }
    }

    return ans + (idx == 0 ? 0 : 1);
  }
}
