package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

class RichestCustomerWealth {

  int maximumWealth(int[][] accounts) {
    int[] totals = Arrays.stream(accounts).mapToInt(arr -> IntStream.of(arr).sum()).toArray();
    return Arrays.stream(totals).reduce((one, two) -> Math.max(one, two)).orElse(-1);
  }
}
