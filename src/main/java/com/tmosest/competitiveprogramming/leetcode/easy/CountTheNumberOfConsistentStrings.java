package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class CountTheNumberOfConsistentStrings {

  int countConsistentStrings(String allowed, String[] words) {
    return (int) Arrays.stream(words).filter(word -> {
      for (char letter : word.toCharArray()) {
        if (!allowed.contains(letter + "")) {
          return false;
        }
      }
      return true;
    }).count();
  }
}
