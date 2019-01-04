package com.tmosest.competitiveprogramming.leetcode;

public class ShortestWordDistance {

  /**
   * Find the min distance in the array between the two desired words.
   * @param words An array of words.
   * @param word1 The first word we are looking for.
   * @param word2 The second word we are looking for.
   * @return The distance between the two words.
   */
  public int shortestDistance(String[] words, String word1, String word2) {
    int index1 = - 1;
    int index2 = -1;
    int res = Integer.MAX_VALUE;
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      if (word.equals(word1)) {
        index1 = i;
      } else if (word.equals(word2)) {
        index2 = i;
      }
      if (index1 != -1 && index2 != -1) {
        res = Math.min(res, Math.abs(index1 - index2));
      }
    }
    return res;
  }
}
