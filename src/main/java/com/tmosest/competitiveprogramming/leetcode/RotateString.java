package com.tmosest.competitiveprogramming.leetcode;

public class RotateString {

  /**
   * Determine if one string can be shifted into another string.
   * @param word The first string.
   * @param possiblePermutation String to check if shift of.
   * @return True if word could be shifted to match possiblePermutation.
   */
  public boolean rotateString(String word, String possiblePermutation) {
    return word.length() == possiblePermutation.length()
        && (word + word).contains(possiblePermutation);
  }
}
