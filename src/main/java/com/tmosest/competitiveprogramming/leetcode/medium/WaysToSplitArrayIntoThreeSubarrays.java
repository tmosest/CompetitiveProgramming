package com.tmosest.competitiveprogramming.leetcode.medium;

class WaysToSplitArrayIntoThreeSubarrays {

  int waysToSplit(int[] nums) {

    int mod = (int) (1e9 + 7);

    int len = nums.length;

    int[] prefixArray = new int[len];
    prefixArray[0] = nums[0];
    for (int i = 1; i < len; ++i) {
      prefixArray[i] = prefixArray[i - 1] + nums[i];
    }

    int res = 0;
    for (int i = 1; i < len - 1; ++i) {

      if (prefixArray[i - 1] > prefixArray[len - 1] - prefixArray[i - 1]) {
        break;  // early termination
      }

      int left = helper(prefixArray, prefixArray[i - 1], i, true);
      int right = helper(prefixArray, prefixArray[i - 1], i, false);

      if (left == -1 || right == -1) {
        continue;  // none is satisfied
      }

      res = (res + (right - left + 1) % mod) % mod;
    }

    return res;
  }

  private int helper(int[] arr, int leftSum, int index, boolean searchLeft) {

    int len = arr.length;
    int left = index;
    int right = len - 2;
    int res = -1;

    while (left <= right) {

      int mid = (right - left) / 2 + left;
      int midSum = arr[mid] - arr[index - 1];
      int rightSum = arr[len - 1] - arr[mid];

      if (leftSum <= midSum && midSum <= rightSum) {
        res = mid;
        if (searchLeft) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else if (leftSum > midSum) {  // shrink left
        left = mid + 1;
      } else {  // shrink right
        right = mid - 1;
      }

    }

    return res;
  }
}
