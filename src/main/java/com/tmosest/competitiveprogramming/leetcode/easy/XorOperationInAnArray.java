package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.stream.IntStream;

class XorOperationInAnArray {

  int xorOperation(int num, int start) {
    return IntStream
        .range(0, num)
        .map(i -> start + 2 * i)
        .reduce(0, (one, two) -> one ^ two);
  }
}
