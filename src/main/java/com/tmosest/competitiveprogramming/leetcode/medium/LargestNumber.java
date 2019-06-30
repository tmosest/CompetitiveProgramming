package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

class LargestNumber {

  private class LargerNumberComparator implements Comparator<String> {

    @Override
    public int compare(String one, String two) {
      String order1 = one + two;
      String order2 = two + one;
      return order2.compareTo(order1);
    }
  }

  /**
   * Determine largest number that can be made.
   */
  public String largestNumber(int[] nums) {
    // Get input integers as strings.
    String[] asStrs = new String[nums.length];
    for (int i = 0; i < nums.length; i++) {
      asStrs[i] = String.valueOf(nums[i]);
    }

    // Sort strings according to custom comparator.
    Arrays.sort(asStrs, new LargerNumberComparator());

    // If, after being sorted, the largest number is `0`, the entire number
    // is zero.
    if (asStrs[0].equals("0")) {
      return "0";
    }

    // Build largest number from sorted array.
    String largestNumberStr = new String();
    for (String numAsStr : asStrs) {
      largestNumberStr += numAsStr;
    }

    return largestNumberStr;
  }
}
