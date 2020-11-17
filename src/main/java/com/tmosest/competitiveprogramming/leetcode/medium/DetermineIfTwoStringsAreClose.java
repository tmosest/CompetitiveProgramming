package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class DetermineIfTwoStringsAreClose {

  boolean closeStrings(String word1, String word2) {
    if (word1.length() != word2.length()) {
      return false;
    }
    int[] fillOne = new int[26];
    int[] fillTwo = new int[26];
    int letterOne = 0;
    int letterTwo = 0;
    for (char letter : word1.toCharArray()) {
      letterOne |= (1 << letter - 97);
      fillOne[letter - 97]++;
    }
    for (char letter : word2.toCharArray()) {
      letterTwo |= (1 << letter - 97);
      fillTwo[letter - 97]++;
    }
    if (letterOne != letterTwo) {
      return false;
    }
    Arrays.sort(fillOne);
    Arrays.sort(fillTwo);
    for (int i = 0; i < 26; i++) {
      if (fillOne[i] != fillTwo[i]) {
        return false;
      }
    }
    return true;
  }
}
