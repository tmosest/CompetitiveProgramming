package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;

class SortIntegersByTheNumberOfOneBits {

  class BitComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer one, Integer two) {
      int bitCountOne = Integer.bitCount(one);
      int bitCountTwo = Integer.bitCount(two);
      if (bitCountOne == bitCountTwo) {
        return one - two;
      }
      return bitCountOne - bitCountTwo;
    }
  }

  int[] sortByBits(int[] arr) {
    Integer[] res = new Integer[arr.length];
    for (int i = 0; i < arr.length; ++i) {
      res[i] = arr[i];
    }
    Arrays.sort(res, new BitComparator());
    for (int i = 0; i < arr.length; ++i) {
      arr[i] = res[i];
    }
    return arr;
  }
}
