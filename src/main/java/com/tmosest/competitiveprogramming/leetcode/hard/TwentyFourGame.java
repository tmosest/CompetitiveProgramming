package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TwentyFourGame {

  boolean judgePoint24(int[] nums) {
    List<Double> list = new ArrayList<>();
    for (int num : nums) {
      list.add((double) num);
    }
    return helper(list);
  }

  // Take two elements -- do all operations -- adc to the list
  // continue till the list has only one element
  // see any one of them is 24
  public boolean helper(List<Double> list) {
    if (list.size() == 1) {
      if (Math.abs(list.get(0) - 24.0) < 0.1) {
        return true;
      }
    }

    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        double one = list.get(i);
        double two = list.get(j);

        List<Double> allPossible = Arrays
            .asList(one + two, one - two, one * two, one / two, two - one, two / one);
        for (double next : allPossible) {
          List<Double> neighbor = new ArrayList<>();
          neighbor.add(next);

          for (int k = 0; k < list.size(); k++) {
            if (k != j && k != i) {
              neighbor.add(list.get(k));
            }
          }
          if (helper(neighbor)) {
            return true;
          }
        }
      }
    }
    return false;
  }
}
