package com.tmosest.competitiveprogramming.utils.string;

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

  /**
   * Creates a string that is a repeat of another string.
   * @param repeat The string to repeat.
   * @param times The number of times to repeat.
   * @return The string repeated.
   */
  public static String createRepeatString(String repeat, int times) {
    StringBuilder sb = new StringBuilder();
    for (; times >= 1; times--) {
      sb.append(repeat);
    }
    return sb.toString();
  }

  /**
   * Takes a string and makes the first character lowercase.
   * @param word The string to convert.
   * @return Only makes the first letter lower case but leaves the rest in tac.
   */
  public static String uncapitalize(String word) {
    if (word == null) {
      return null;
    }
    return  word.substring(0, 1).toLowerCase() + word.substring(1);
  }

  /**
   * Takes a string and converts it to Proper name.
   * @param word The string to convert.
   * @return "Word".
   */
  static String toProperName(String word) {
    if (word == null) {
      return null;
    }
    return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
  }
}
