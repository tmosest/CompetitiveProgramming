package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {

  /**
   * Determines if word matches the pattern.
   * @param queries A query of words.
   * @param pattern The pattern they need to match.
   * @return A list of booleans that determine the result of the query.
   */
  public List<Boolean> camelMatch(String[] queries, String pattern) {
    List<Boolean> result = new ArrayList<>();
    for (String query : queries) {
      result.add(isMatch(query, pattern));
    }
    return result;
  }

  private boolean isMatch(String query, String pattern) {
    int pi = 0;
    for (int i = 0; i < query.length(); i++) {
      char curr = query.charAt(i);
      if (pi < pattern.length() && curr == pattern.charAt(pi)) {
        pi++;
      } else if (Character.isUpperCase(curr) ) {
        return false;
      }
    }
    return pi == pattern.length();
  }
}
