package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.utils.UtilTrie;

class WordDictionary {
  /* Write code here. */

  private UtilTrie utilTrie = new UtilTrie();

  /**
   * Initialize your data structure here.
   */
  WordDictionary() {
  }

  /**
   * Adds a word into the data structure.
   */
  void addWord(String word) {
    utilTrie.addWord(word);
  }

  /**
   * Returns if the word is in the data structure. A word could contain the dot character '.' to
   * represent any one letter.
   */
  boolean search(String word) {
    return utilTrie.isWord(word);
  }


}
