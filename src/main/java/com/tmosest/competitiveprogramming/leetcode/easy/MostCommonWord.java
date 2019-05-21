package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;

class MostCommonWord {
  /* Write code here. */

  /**
   * Determines what the most common word is in a paragraph given an array of banned words.
   *
   * @param paragraph The paragraph to look through.
   * @param banned An array of banned words.
   * @return The most common word that isn't banned.
   */
  public String mostCommonWord(String paragraph, String[] banned) {
    HashMap<String, Integer> wordCounts = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    for (Character c : paragraph.toCharArray()) {
      if (Character.isAlphabetic(c)) {
        sb.append(Character.toLowerCase(c));
      } else {
        if (sb.length() > 0) {
          String str = sb.toString();
          Integer count = wordCounts.get(str);
          count = (count == null) ? 1 : count + 1;
          wordCounts.put(str, count);
          sb = new StringBuilder();
        }
      }
    }
    if (sb.length() > 0) {
      String str = sb.toString();
      Integer count = wordCounts.get(str);
      count = (count == null) ? 1 : count + 1;
      wordCounts.put(str, count);
    }
    HashSet<String> set = new HashSet<>();
    for (String ban : banned) {
      set.add(ban);
    }
    String result = "";
    int max = 0;
    for (String word : wordCounts.keySet()) {
      int count = wordCounts.get(word);
      if (!set.contains(word) && count > max) {
        max = count;
        result = word;
      }
    }
    return result;
  }


}
