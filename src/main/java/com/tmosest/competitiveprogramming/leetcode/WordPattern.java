package com.tmosest.competitiveprogramming.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

  /**
   * Function to determine if the words in the sentence match a pattern.
   * @param pattern The pattern.
   * @param str The sentence to search.
   * @return True if the words match the pattern.
   */
  public boolean wordPattern(String pattern, String str) {
    if (pattern == null && str == null) {
      return true;
    }
    if (pattern == null || str == null) {
      return false;
    }
    if (pattern.isEmpty()) {
      return str.isEmpty();
    }
    String[] strs = str.split(" ");
    if (strs.length != pattern.length()) {
      return false;
    }
    Map<Character, String> map = new HashMap<>();
    Map<String, Character> map2 = new HashMap<>();
    for (int i = 0; i < pattern.length(); i++) {
      char letter = pattern.charAt(i);
      str = map.get(letter);
      if (str != null && !str.equals(strs[i])) {
        return false;
      }
      Character let = map2.get(strs[i]);
      if (let != null && let != letter) {
        return false;
      }
      map2.put(strs[i], letter);
      map.put(letter, strs[i]);
    }
    return true;
  }
}
