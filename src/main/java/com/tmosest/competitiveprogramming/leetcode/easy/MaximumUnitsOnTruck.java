package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class MaximumUnitsOnTruck {

  int maximumUnits(int[][] boxTypes, int truckSize) {
    int res = 0;

    Arrays.sort(boxTypes, (o1, o2) -> Integer.compare(o2[1], o1[1]));

    int index = 0;
    while (truckSize > 0 && index < boxTypes.length) {
      int count = boxTypes[index][0];
      int amount = boxTypes[index][1];

      int left = Math.min(count, truckSize);
      res += (left * amount);
      truckSize -= left;
      index++;
    }

    return res;
  }
}
