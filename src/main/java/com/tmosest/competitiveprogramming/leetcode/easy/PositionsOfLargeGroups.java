package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

class PositionsOfLargeGroups {
  /* Write code here. */

  /**
   * Gets the starting and ending position of every group of letters. That has 3 or more of the same
   * letter in a row.
   *
   * @param word The word we are looking through.
   * @return List of lists that are the start and end of large groups.
   */
  public List<List<Integer>> largeGroupPositions(String word) {
    List<List<Integer>> result = new ArrayList<>();
    int length = word.length();

    if (length < 3) {
      return result;
    }

    char prev = word.charAt(0);
    int prevIndex = 0;

    for (int i = 1; i < length; i++) {
      char letter = word.charAt(i);
      if (letter != prev) {
        if (i - prevIndex > 2) {
          result.add(createPair(prevIndex, i - 1));
        }
        prev = letter;
        prevIndex = i;
      }
    }

    if (length - prevIndex > 2) {
      result.add(createPair(prevIndex, length - 1));
    }

    return result;
  }

  private List<Integer> createPair(int first, int second) {
    List<Integer> result = new ArrayList<>();
    result.add(first);
    result.add(second);
    return result;
  }


}
