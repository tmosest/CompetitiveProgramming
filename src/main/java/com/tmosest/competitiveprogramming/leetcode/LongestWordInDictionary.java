package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.utils.UtilTrie;

public class LongestWordInDictionary {

  /**
   * Find the longest word that can be made of other words.
   * @param words An array of strings.
   * @return The longest word that is also lexicographically smallest.
   */
  public String longestWord(String[] words) {
    UtilTrie utilTrie = new UtilTrie(words);
    return utilTrie.getLongestWordMadeOfOtherWords();
  }
}
