package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class CompareStringsByFrequencyOfTheSmallestCharacter {

  int[] numSmallerByFrequency(String[] queries, String[] words) {
    int[] queryIndex = new int[queries.length];
    int[] wordIndex = new int[words.length];
    for (int i = 0; i < queryIndex.length; i++) {
      queryIndex[i] = getFunc(queries[i]);
    }
    for (int i = 0; i < wordIndex.length; i++) {
      wordIndex[i] = getFunc(words[i]);
    }
    Arrays.sort(wordIndex);
    int[] res = new int[queryIndex.length];
    for (int i = 0; i < queryIndex.length; i++) {
      int left = 0;
      int right = wordIndex.length - 1;
      while (left <= right) {
        int mid = (right + left) / 2;
        if (wordIndex[mid] <= queryIndex[i]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
      res[i] = wordIndex.length - left;
    }
    return res;
  }

  private int getFunc(String str) {
    char chr = 'z';
    int count = 0;
    for (char ch : str.toCharArray()) {
      if (ch < chr) {
        count = 1;
        chr = ch;
      } else if (chr == ch) {
        count++;
      }
    }
    return count;
  }
}
