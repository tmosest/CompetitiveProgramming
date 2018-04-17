package com.tmosest.competitiveprogramming.crackingcode.arrays;

public class IsUnique {

  /**
   * Solves Cracking the Code Interview Problem 1.1
   * @param word String to check.
   * @return True if it contains all unique characters.
   */
  public static boolean isUnique(String word) {
    int wordLength = word.length();
    if (wordLength > 128) {
      return false;
    }
    int[] counts = new int[128];
    for (int c = 0; c < wordLength; c++) {
      int letterIndex = (int) word.charAt(c);
      counts[letterIndex]++;
      if (counts[letterIndex] > 1) {
        return false;
      }
    }
    return true;
  }

}
