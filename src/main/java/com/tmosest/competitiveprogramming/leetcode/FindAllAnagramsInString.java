package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInString {

  /**
   * Find the starting index of every anagram of word in search.
   * @param search String to look through.
   * @param word String that we want anagrams of.
   * @return A list of containing the index of each anagram.
   */
  public List<Integer> findAnagrams(String search, String word) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < search.length() - word.length() + 1; i++) {
      String sub = search.substring(i, i + word.length());
      if (isAnagram(sub, word)) {
        result.add(i);
      }
    }
    return result;
  }

  private boolean isAnagram(String toCheck, String word) {
    if (toCheck.length() != word.length()) {
      return false;
    }
    char[] letterCounts = new char[26];
    for (int i = 0; i < word.length(); i++) {
      letterCounts[word.charAt(i) - 'a']++;
    }
    for (int i = 0; i < toCheck.length(); i++) {
      letterCounts[toCheck.charAt(i) - 'a']--;
    }
    for (int i : letterCounts) {
      if (i != 0) {
        return false;
      }
    }
    return true;
  }
}
