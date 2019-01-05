package com.tmosest.competitiveprogramming.leetcode;

public class FindFirstAndLastPositionOfElementInSortedArray {

  private int binarySearch(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      int val = nums[mid];
      if (target < val) {
        high = mid - 1;
      } else if (target > val) {
        low = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  /**
   * Function to find the start and end index for a given element. Must be O(lg(n)).
   * @param nums An array of integers.
   * @param target The desired target.
   * @return An array of two number indicating the desired indexes.
   */
  public int[] searchRange(int[] nums, int target) {
    int foundIndex = binarySearch(nums, target);
    int[] result = {-1, -1};
    if (foundIndex == -1) {
      return result;
    }
    result[0] = foundIndex;
    result[1] = foundIndex;
    while (result[0] - 1 >= 0 && nums[result[0] - 1] == target) {
      result[0]--;
    }
    while (result[1] + 1 < nums.length && nums[result[1] + 1] == target) {
      result[1]++;
    }
    return result;
  }
}
