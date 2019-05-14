package com.tmosest.competitiveprogramming.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for string utility methods.
 */
public class StringUtil {

  /**
   * Determines if a string is a camel case match.
   * @param query The string to check if it is a part of the pattern.
   * @param pattern The pattern we are matching against.
   * @return True if the word matches.
   */
  static boolean isCamelCaseMatch(String query, String pattern) {
    int pi = 0;
    for (int i = 0; i < query.length(); i++) {
      char curr = query.charAt(i);
      if (pi < pattern.length() && curr == pattern.charAt(pi)) {
        pi++;
      } else if (Character.isUpperCase(curr)) {
        return false;
      }
    }
    return pi == pattern.length();
  }

  /**
   * isCamelCaseMatch for an array of queries.
   * @param queries The queries.
   * @param pattern The patterns.
   * @return A list of booleans.
   */
  public static List<Boolean> isCamelCaseMatches(String[] queries, String pattern) {
    List<Boolean> result = new ArrayList<>();
    for (String query : queries) {
      result.add(StringUtil.isCamelCaseMatch(query, pattern));
    }
    return result;
  }
}
