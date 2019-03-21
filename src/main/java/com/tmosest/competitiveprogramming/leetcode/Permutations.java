package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

  private List<List<Integer>> permuations;

  /**
   * Return all the permutations of an array.
   * @param nums An array of number.
   * @return A list of all the permutation.
   */
  public List<List<Integer>> permute(int[] nums) {
    permuations = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      List<Integer> remaining = new ArrayList<>();
      for (int j = 0; j < nums.length; j++) {
        if (i != j) {
          remaining.add(nums[j]);
        }
      }
      List<Integer> permutation = new ArrayList<>();
      permutation.add(nums[i]);
      permute(remaining, permutation);
    }
    return permuations;
  }

  private void permute(List<Integer> nums, List<Integer> permutation) {
    if (nums.size() == 0) {
      permuations.add(permutation);
      return;
    }
    for (int i = 0; i < nums.size(); i++) {
      List<Integer> remaining = new ArrayList<>();
      for (int j = 0; j < nums.size(); j++) {
        if (i != j) {
          remaining.add(nums.get(j));
        }
      }
      List<Integer> newPermutation = new ArrayList<>();
      newPermutation.add(nums.get(i));
      for (Integer num : permutation) {
        newPermutation.add(num);
      }
      permute(remaining, newPermutation);
    }
  }
}
