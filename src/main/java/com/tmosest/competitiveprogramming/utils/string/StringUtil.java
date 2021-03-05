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

  /**
   * Takes strings that were separated by line breaks and makes them space separated.
   * @param list List of strings that are grouped by line breaks.
   * @return List of strings that are grouped by spaces.
   */
  public static List<String> fromLineSeperatedToSpaceSeperated(List<String> list) {
    List<String> results = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();

    for (String line : list) {
      line = line.trim();
      if (line.length() < 1) {
        results.add(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        continue;
      }
      stringBuilder.append(line).append(" ");
    }

    results.add(stringBuilder.toString());

    return results;
  }

  /**
   * Determines if a string is a number or not.
   * @param str The string
   * @return True if it is a number
   */
  public static boolean isNumber(String str) {
    try {
      Long.valueOf(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  /**
   * Takes a string and reverses it.
   * @param str The string to reverse.
   * @return The reversed string.
   */
  public static String reverse(String str) {
    StringBuilder stringBuilder = new StringBuilder();

    for (char letter : str.toCharArray()) {
      stringBuilder.insert(0, letter);
    }

    return stringBuilder.toString();
  }
}
