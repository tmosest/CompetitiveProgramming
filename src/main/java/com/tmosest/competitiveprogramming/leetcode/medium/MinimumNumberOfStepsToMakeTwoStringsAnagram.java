package com.tmosest.competitiveprogramming.leetcode.medium;

class MinimumNumberOfStepsToMakeTwoStringsAnagram {

  int minSteps(String one, String two) {
    int[] countOne = getLetterCounts(one);
    int[] countTwo = getLetterCounts(two);

    int diff = 0;

    for (int i = 0; i < countOne.length; i++) {
      diff += Math.abs(countOne[i] - countTwo[i]);
    }

    return diff / 2;
  }

  private int[] getLetterCounts(String word) {
    int[] res = new int[26];

    for (char letter : word.toCharArray()) {
      res[letter - 'a']++;
    }

    return res;
  }
}
