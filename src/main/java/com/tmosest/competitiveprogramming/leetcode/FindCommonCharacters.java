package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

  /**
   * Determine the common characters among words.
   * @param words The words.
   * @return A list of common letters.
   */
  public List<String> commonChars(String[] words) {
    int[] letterCounts = new int[26];
    char[] word = words[0].toCharArray();
    for (char letter : word) {
      letterCounts[letter - 'a']++;
    }
    for (int i = 1; i < words.length; i++) {
      int[] newLetterCounts = new int[26];
      word = words[i].toCharArray();
      for (char letter : word) {
        int index = letter - 'a';
        if (letterCounts[index] > 0) {
          letterCounts[index]--;
          newLetterCounts[index]++;
        }
      }
      letterCounts = newLetterCounts;
    }
    List<String> result = new ArrayList<>();
    for (int i = 0; i < letterCounts.length; i++) {
      int count = letterCounts[i];
      if (count > 0) {
        char letter = (char)(i + 'a');
        while (count > 0) {
          result.add(Character.toString(letter));
          --count;
        }
      }
    }
    return result;
  }
}
