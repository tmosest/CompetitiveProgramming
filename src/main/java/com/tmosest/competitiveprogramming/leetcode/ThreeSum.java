package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ThreeSum {

  /**
   * Function to find all unique three sum solutions to a problem.
   * @param nums An array of numbers.
   * @return A list of unique solutions.
   */
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> results = new ArrayList<>();

    if (nums.length < 3) {
      return results;
    }

    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int target = -nums[i];
      int left = i + 1;
      int right = nums.length - 1;

      while (right > left) {
        int sum = nums[right] + nums[left];
        if (sum > target) {
          right--;
        } else if (sum < target) {
          left++;
        } else {
          List<Integer> result = Arrays.asList(-target, nums[left], nums[right]);
          results.add(result);

          left++;
          right--;

          // check if two elements in a row are the same.
          while (left < right && nums[left] == nums[left - 1]) {
            left++;
          }

          while (left < right && nums[right] == nums[right + 1]) {
            right--;
          }
        }
      }
    }
    return results;
  }
}
