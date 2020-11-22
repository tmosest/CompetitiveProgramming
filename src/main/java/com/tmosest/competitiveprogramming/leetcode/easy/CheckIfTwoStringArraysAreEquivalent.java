package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class CheckIfTwoStringArraysAreEquivalent {

  boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    return arrayToString(word1).equals(arrayToString(word2));
  }

  private String arrayToString(String[] str) {
    return Arrays.stream(str).reduce((word1, word2) -> word1 + word2).orElse("");
  }
}
