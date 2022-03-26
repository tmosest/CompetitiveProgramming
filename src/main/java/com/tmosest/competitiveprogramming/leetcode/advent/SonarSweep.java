package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.ArrayList;
import java.util.List;

class SonarSweep {

  int countIncreases(List<Integer> input) {
    int count = 0;
    Integer last = null;

    for (Integer num : input) {
      if (last != null && num > last) {
        ++count;
      }
      last = num;
    }

    return count;
  }

  int countIncreasesInWindows(List<Integer> input) {
    List<Integer> windowList = new ArrayList<>();

    int windowSum = 0;
    for (int i = 0; i < input.size(); i++) {
      if (i > 2) {
        windowList.add(windowSum);
        windowSum -= input.get(i - 3);
      }
      windowSum += input.get(i);
    }
    windowList.add(windowSum);

    return countIncreases(windowList);
  }
}
