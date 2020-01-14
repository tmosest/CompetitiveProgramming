package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class NumberOfMatchingSubsequences {

  int numMatchingSubseq(String str, String[] words) {
    return (int) Arrays.stream(words)
        .filter((word) -> isSubsequence(str, word))
        .count();
  }

  boolean isSubsequence(String word, String search) {
    char[] words = word.toCharArray();
    char[] searches = search.toCharArray();

    int wordIndex = 0;
    int searchIndex = 0;

    while (wordIndex < words.length && searchIndex < searches.length) {
      if (words[wordIndex] == searches[searchIndex]) {
        ++searchIndex;
      }
      ++wordIndex;
    }

    return searchIndex == searches.length;
  }
}
