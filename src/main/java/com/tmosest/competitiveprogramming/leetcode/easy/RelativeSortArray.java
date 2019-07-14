package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Map;
import java.util.TreeMap;

class RelativeSortArray {

  /**
   * Sort first array based on second.
   *
   * @param arr1 The array to sort.
   * @param arr2 The array to sort by,
   * @return A copy of the first array sorted by the second.
   */
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    Map<Integer, Integer> valueCounts = new TreeMap<>(/**/);
    for (int val : arr1) {
      int count = valueCounts.getOrDefault(val, 0);
      valueCounts.put(val, count + 1);
    }

    int[] result = new int[arr1.length];
    int index = 0;
    for (int j = 0; index < arr1.length && j < arr2.length; j++) {
      int sortVal = arr2[j];
      int count = valueCounts.getOrDefault(sortVal, 0);
      while (count > 0) {
        result[index++] = sortVal;
        --count;
      }
      valueCounts.put(sortVal, 0);
    }

    for (int key : valueCounts.keySet()) {
      int count = valueCounts.get(key);
      while (count > 0) {
        result[index++] = key;
        --count;
      }
    }

    return result;
  }


}
