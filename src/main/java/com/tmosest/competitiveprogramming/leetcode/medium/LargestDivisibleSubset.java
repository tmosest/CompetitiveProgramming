package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class LargestDivisibleSubset {

  // cache or memo. For each number in nums this stores the longest
  // subset ending in that number. Note that I don't see this as a matrix, I
  // see this as an array of arrays
  private int[][] cache;

  List<Integer> largestDivisibleSubset(int[] nums) {
    if (nums.length == 0) {
      return Collections.emptyList();
    }

    // instantiating an array of arrays with "nums.length" length and "null" throughout
    cache = new int[nums.length][];
    Arrays.sort(nums);
    cache[0] = new int[]{nums[0]};

    int[] longestSubset = new int[0];
    // starting from the largest number, lookup the longest subset
    // ending in that number. Next, go to the second largest number,
    // and so on.
    for (int i = nums.length - 1; i >= 0; i--) {
      int[] subset = largetDivisibleSubset(nums, i);

      // if the subset ending in nums[i] is larger than the previous
      // one, promote the subset as the new longest
      if (subset.length > longestSubset.length) {
        longestSubset = subset;
      }
    }

    // return the longest subset
    List<Integer> list = new ArrayList<>(longestSubset.length);
    for (int num : longestSubset) {
      list.add(num);
    }
    return list;
  }

  public int[] largetDivisibleSubset(int[] nums, int index) {
    int[] subset = cache[index];
    if (subset != null) {
      return subset;
    }

    int largestNumber = nums[index];
    int[] longestSubset = new int[0];

    for (int i = index - 1; i >= 0; i--) {
      // if nums[i] is not a multiple of the largest number, discard it
      if (largestNumber % nums[i] != 0) {
        continue;
      }

      // nums[i] is multiple. Let's get the largest subset ending in nums[i]
      subset = largetDivisibleSubset(nums, i);
      if (subset.length > longestSubset.length) {
        // this is larger than the current "longest" so we promote it
        longestSubset = subset;
      }
    }

    // let's copy the longest/largest subset and append "largestNumber" to it
    int[] result = new int[longestSubset.length + 1];
    System.arraycopy(longestSubset, 0, result, 0, longestSubset.length);
    result[result.length - 1] = largestNumber;

    cache[index] = result;
    return result;
  }
}
