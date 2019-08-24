package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class Hindex {

  int hindex(int[] citations) {
    if (citations.length == 0) {
      return 0;
    }

    Arrays.sort(citations);

    int result = Integer.MIN_VALUE;
    for (int i = 0; i < citations.length; ++i) {
      int count = citations.length - i;
      int minValue = citations[i];

      result = Math.max(result, Math.min(count, minValue));
    }

    return result;
  }
}
