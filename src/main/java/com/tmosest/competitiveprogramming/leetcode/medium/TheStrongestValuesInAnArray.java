package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

class TheStrongestValuesInAnArray {

  int[] getStrongest(int[] arr, int size) {
    final double median = median(arr);

    Integer[] copy = Arrays.stream(arr).boxed().toArray( Integer[]::new );

    Arrays.sort(copy, new Comparator<Integer>() {
      public int compare(Integer one, Integer two) {
        double diffOne = Math.abs(one - median);
        double diffTwo = Math.abs(two - median);

        if (diffOne == diffTwo) {
          return Integer.compare(two, one);
        }

        if (diffOne < diffTwo) {
          return 1;
        }

        return -1;
      }
    });

    int[] res = new int[size];

    for (int i = 0; i < res.length; i++) {
      res[i] = copy[i];
    }

    return res;
  }

  private double median(int[] arr) {
    Arrays.sort(arr);

    int index = ((arr.length - 1) / 2);
    return arr[index];
  }
}
