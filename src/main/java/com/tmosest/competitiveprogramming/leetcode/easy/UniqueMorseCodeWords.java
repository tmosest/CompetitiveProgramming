package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashSet;

class UniqueMorseCodeWords {
  /* Write code here. */

  private String getMorseCodeForLetter(char letter) {
    String result = "";
    String[] maps = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
        ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
        "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    };
    if (letter >= 'a' && letter <= 'z') {
      result = maps[letter - 'a'];
    }
    return result;
  }

  private String convertToMoreseCode(String word) {
    StringBuilder sb = new StringBuilder();
    for (Character c : word.toCharArray()) {
      sb.append(getMorseCodeForLetter(Character.toLowerCase(c)));
    }
    return sb.toString();
  }

  /**
   * Determine the number of unique morse code strings generated for an array of words.
   *
   * @param words The array of words to look at.
   * @return The number of unique strings that would be generated.
   */
  public int uniqueMorseRepresentations(String[] words) {
    HashSet<String> set = new HashSet<>();
    for (String word : words) {
      set.add(convertToMoreseCode(word));
    }
    return set.size();
  }


}
