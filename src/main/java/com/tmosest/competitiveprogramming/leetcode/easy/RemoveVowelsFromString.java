package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

class RemoveVowelsFromString {

  /**
   * Remove the vowels from a word.
   *
   * @param str The word.
   * @return The word with no vowels.
   */
  String removeVowels(String str) {
    if (str == null || str.length() == 0) {
      return "";
    }

    Set<Character> set = new HashSet<>();
    set.add('a');
    set.add('e');
    set.add('i');
    set.add('o');
    set.add('u');

    StringBuilder sb = new StringBuilder();
    for (char c : str.toCharArray()) {
      if (!set.contains(c)) {
        sb.append(c);
      }
    }
    return sb.toString();
  }
}
