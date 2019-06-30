package com.tmosest.competitiveprogramming.leetcode.medium;

class UniqueWordAbbreviation {

  private final String[] dict;

  UniqueWordAbbreviation(String[] dictionary) {
    dict = dictionary;
  }

  boolean isUnique(String word) {
    int len = word.length();
    for (String s : dict) {
      if (word.equals(s)) {
        continue;
      }
      int len2 = s.length();
      if (len2 == len
          && s.charAt(0) == word.charAt(0)
          && s.charAt(len2 - 1) == word.charAt(len - 1)) {
        return false;
      }
    }
    return true;
  }
}
