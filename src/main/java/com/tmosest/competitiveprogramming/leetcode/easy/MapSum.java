package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.utils.UtilTrie;

import java.util.ArrayList;
import java.util.List;

class MapSum {
  /* Write code here. */

  private UtilTrie utilTrie = new UtilTrie();
  private List<String> words = new ArrayList<>();
  private List<Integer> wordValues = new ArrayList<>();

  MapSum() {
  }

  /**
   * Insert a new word into the MapSum.
   *
   * @param key A string.
   * @param val A value for this string.
   */
  void insert(String key, int val) {
    utilTrie.addWord(key);
    words.add(key);
    wordValues.add(val);
  }

  /**
   * The sum of all words with this prefix.
   *
   * @param prefix The prefix string.
   * @return The sum of all values for words with the prefix.
   */
  int sum(String prefix) {
    int sum = 0;
    List<String> wordsWithPrefix = utilTrie.getWordsWithPrefix(prefix);
    for (String word : wordsWithPrefix) {
      sum += wordValues.get(words.indexOf(word));
    }
    return sum;
  }


}
