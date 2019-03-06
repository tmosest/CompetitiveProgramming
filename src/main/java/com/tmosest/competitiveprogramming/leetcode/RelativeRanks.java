package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;

public class RelativeRanks {

  /**
   * Determine relative ranks of people.
   * @param nums The scores of the people as an array.
   * @return A string array of there relative ranks.
   */
  public String[] findRelativeRanks(int[] nums) {
    int[] ranked = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      ranked[i] = nums[i];
    }

    Arrays.sort(ranked);

    String[] result = new String[nums.length];

    for (int i = nums.length - 1; i >= 0; --i) {
      for (int j = 0; j < nums.length; j++) {
        if (ranked[i] == nums[j]) {
          if (i == nums.length - 1) {
            result[j] = "Gold Medal";
          } else if (i == nums.length - 2) {
            result[j] = "Silver Medal";
          } else if (i == nums.length - 3) {
            result[j] = "Bronze Medal";
          } else {
            int rank = nums.length - i;
            result[j] = String.valueOf(rank);
          }
        }
      }
    }
    return result;
  }
}
