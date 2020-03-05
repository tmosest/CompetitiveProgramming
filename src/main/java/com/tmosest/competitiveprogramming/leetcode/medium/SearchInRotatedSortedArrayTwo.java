package com.tmosest.competitiveprogramming.leetcode.medium;

class SearchInRotatedSortedArrayTwo {

  boolean search(int[] nums, int target) {
    if (nums.length == 0) {
      return false;
    }
    return solv(nums, 0, nums.length - 1, target);
  }

  boolean solv(int[] nums, int left, int right, int target) {
    if (right == left) {
      return nums[right] == target;
    } else if (nums[left] < nums[right]) {
      while (left <= right) {
        int middle = (left + right) >> 1;
        if (nums[middle] == target) {
          return true;
        } else if (nums[middle] > target) {
          right = middle - 1;
        } else {
          left = middle + 1;
        }
      }
      return false;
    }
    return solv(nums, left, (left + right) >> 1, target) | solv(nums, ((left + right) >> 1) + 1,
        right, target);
  }
}
