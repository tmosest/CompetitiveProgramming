package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.utils.UtilTrie;

class LongestWordInDictionary {
  /* Write code here. */

  /**
   * Find the longest word that can be made of other words.
   *
   * @param words An array of strings.
   * @return The longest word that is also lexicographically smallest.
   */
  public String longestWord(String[] words) {
    UtilTrie utilTrie = new UtilTrie(words);
    return utilTrie.getLongestWordMadeOfOtherWords();
  }


}
