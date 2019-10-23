package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MinimumAbsoluteDifference {

  public List<List<Integer>> minimumAbsDifference(int[] arr) {
    Arrays.sort(arr);
    int minDiff = Integer.MAX_VALUE;

    for (int i = 1; i < arr.length; i++) {
      minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
    }

    List<List<Integer>> l = new ArrayList<>();

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] - arr[i - 1] == minDiff) {
        List<Integer> temp = new ArrayList<>();
        temp.add(arr[i - 1]);
        temp.add(arr[i]);
        l.add(temp);
      }
    }
    return l;
  }
}
