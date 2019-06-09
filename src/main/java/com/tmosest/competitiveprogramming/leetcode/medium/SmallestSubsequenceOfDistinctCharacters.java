package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class SmallestSubsequenceOfDistinctCharacters {

  int distinceCount = 0;
  private PriorityQueue<String> priorityQueue;

  /**
   * Smallest subsequence containing all distinct characters.
   *
   * @param text The text.
   * @return See description.
   */
  String smallestSubsequence(String text) {
    priorityQueue = new PriorityQueue<>();
    Set<Character> set = new HashSet<>();
    char[] letters = text.toCharArray();
    for (char letter : letters) {
      set.add(letter);
    }
    distinceCount = set.size();
    smallestSubsequence(letters, "", 0);
    return priorityQueue.peek();
  }

  private void smallestSubsequence(char[] text, String prev, int index) {
    if (prev.length() == distinceCount) {
      priorityQueue.add(prev);
    }
    if (index >= text.length) {
      return;
    }
    char letter = text[index++];
    if (prev.indexOf(letter) < 0) {
      smallestSubsequence(text, prev + letter, index);
    }
    smallestSubsequence(text, prev, index);
  }
}
