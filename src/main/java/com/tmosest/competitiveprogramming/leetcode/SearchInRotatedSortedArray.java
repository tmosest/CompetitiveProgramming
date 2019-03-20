package com.tmosest.competitiveprogramming.leetcode;

public class SearchInRotatedSortedArray {

  /**
   * Binary search in a rotated array.
   * @param nums The numbers to search through.
   * @param target The target to look for.
   * @return The index of the number or -1.
   */
  public int search(int[] nums, int target) {
    int length = nums.length;

    if (length == 0) {
      return -1;
    }

    if (length == 1) {
      return nums[0] == target ? 0 : -1;
    }

    int rotateIndex = findRotationIndex(nums,0, length - 1);

    if (nums[rotateIndex] == target) {
      return rotateIndex;
    }

    if (rotateIndex == 0) {
      return search(nums, 0, length - 1, target);
    }

    if (target < nums[0]) {
      return search(nums, rotateIndex, length - 1, target);
    }

    return search(nums, 0, rotateIndex, target);
  }

  private int findRotationIndex(int[] nums, int left, int right) {
    if (nums[left] < nums[right]) {
      return 0;
    }

    while (left <= right) {
      int pivot = (left + right) / 2;
      if (nums[pivot] > nums[pivot + 1]) {
        return pivot + 1;
      } else {
        if (nums[pivot] < nums[left]) {
          right = pivot - 1;
        } else {
          left = pivot + 1;
        }
      }
    }
    return 0;
  }

  private int search(int[] nums, int left, int right, int target) {
    while (left <= right) {
      int pivot = (left + right) / 2;
      if (nums[pivot] == target) {
        return pivot;
      } else {
        if (target < nums[pivot]) {
          right = pivot - 1;
        } else {
          left = pivot + 1;
        }
      }
    }
    return -1;
  }
}
