package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class HeightChecker {

  /**
   * Determine how many points make this non-decreasing.
   * @param heights An array of integers.
   * @return The number of values that are non-decreasing.
   */
  public int heightChecker(int[] heights) {
    //Make a copy of heights and sort it
    int[] sorted = heights.clone();
    Arrays.sort(sorted);
    //Variable to track misplaced students
    int students = 0;

    //Compare values to determine misplacement
    for (int i = 0; i < heights.length; i++) {
      if (heights[i] != sorted[i]) {
        students++;
      }
    }

    return students;
  }
}
