package com.tmosest.competitiveprogramming.leetcode;

import java.util.HashSet;
import java.util.Set;

class UniqueSubstringsInWraparoundString {

  /**
   * Determine number of words in wrap around of "...zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd...".
   * @param word to look for letters in the above string.
   * @return The number of unique occurances in the substring.
   */
  int findSubstringInWraproundString(String word) {
    char[] letters = word.toCharArray();
    Set<String> usedWords = new HashSet<>();
    for (int i = 0; i < letters.length; i++) {
      StringBuilder stringBuilder = new StringBuilder();
      char letter = letters[i];
      stringBuilder.append(letter);
      usedWords.add(stringBuilder.toString());
      for (int j = i + 1; j < letters.length && (letters[j] == letter + 1 || letter == 'z' && letters[j] == 'a'); j++) {
        letter = letters[j];
        stringBuilder.append(letter);
        usedWords.add(stringBuilder.toString());
      }
    }
    return usedWords.size();
  }
}
