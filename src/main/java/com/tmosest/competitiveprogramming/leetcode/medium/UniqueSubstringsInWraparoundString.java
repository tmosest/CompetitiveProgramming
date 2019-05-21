package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class UniqueSubstringsInWraparoundString {
  /* Write code here. */

  /**
   * Determine number of words in wrap around of.
   * "...zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd...".
   *
   * @param word to look for letters in the above string.
   * @return The number of unique occurances in the substring.
   */
  int findSubstringInWraproundString(String word) {
    int[] subStringsStartingWith = new int[26];
    int indexOne = 0;
    int indexTwo = 1;
    while (indexTwo < word.length()) {
      while (indexTwo < word.length()
          && ((word.charAt(indexTwo - 1) == 'z' && word.charAt(indexTwo) == 'a')
          || word.charAt(indexTwo) - word.charAt(indexTwo - 1) == 1)) {
        indexTwo++;
      }
      while (indexOne < indexTwo) {
        subStringsStartingWith[word.charAt(indexOne) - 'a'] =
            Math.max(subStringsStartingWith[word.charAt(indexOne) - 'a'], indexTwo - indexOne);
        indexOne++;
      }
      indexTwo++;
    }
    while (indexOne < word.length()) {
      subStringsStartingWith[word.charAt(indexOne) - 'a'] =
          Math.max(subStringsStartingWith[word.charAt(indexOne) - 'a'], word.length() - indexOne);
      indexOne++;
    }
    return Arrays.stream(subStringsStartingWith).sum();
  }


}
