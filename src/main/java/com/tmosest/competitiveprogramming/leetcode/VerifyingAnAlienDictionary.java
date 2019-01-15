package com.tmosest.competitiveprogramming.leetcode;

import java.util.HashMap;
import java.util.Map;

public class VerifyingAnAlienDictionary {

  private boolean compareTwoWordsInForeignDictionary(
      String word1,
      String word2,
      Map<Character, Integer> order
  ) {
    for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
      if (order.get(word1.charAt(i)) > order.get(word2.charAt(i))) {
        return false;
      } else if (order.get(word1.charAt(i)) < order.get(word2.charAt(i))) {
        return true;
      }
    }
    return !word1.contains(word2);
  }

  /**
   * Determines if an array of words is sorted based on an alien dictionary.
   * @param words An array of words.
   * @param order The order of the letters in the alien dictionary.
   * @return True if the words are in order and false otherwise.
   */
  public boolean isAlienSorted(String[] words, String order) {
    if (words != null && words.length > 1) {
      Map<Character, Integer> map = new HashMap<>();
      for (int i = 0; i < order.length(); i++) {
        map.put(order.charAt(i), i);
      }
      for (int i = 0; i < words.length - 1; i++) {
        if (!compareTwoWordsInForeignDictionary(words[i], words[i + 1], map)) {
          return false;
        }
      }
    }
    return true;
  }
}
