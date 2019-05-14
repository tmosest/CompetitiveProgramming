package com.tmosest.competitiveprogramming.leetcode.easy;

class ShortestCompletingWord {
  /* Write code here. */

  private boolean areEqual(int[] one, int[] two) {
    for (int i = 0; i < one.length; i++) {
      if (one[i] > two[i]) {
        return false;
      }
    }
    return true;
  }

  private int[] letterCounts(String word) {
    int[] counts = new int[26];
    for (char letter : word.toCharArray()) {
      if (Character.isAlphabetic(letter)) {
        counts[Character.toLowerCase(letter) - 'a']++;
      }
    }
    return counts;
  }

  /**
   * Determines shortest word that contains letters from licensePlate.
   *
   * @param licensePlate The search letters.
   * @param words The words to look through.
   * @return The shortest word containing all the letters from licensePlate.
   */
  public String shortestCompletingWord(String licensePlate, String[] words) {
    String result = "";
    int[] counts = letterCounts(licensePlate);
    for (String word : words) {
      int[] wordCount = letterCounts(word);
      if (areEqual(counts, wordCount)) {
        if (result.equals("") || word.length() < result.length()) {
          result = word;
        }
      }
    }
    return result;
  }


}
