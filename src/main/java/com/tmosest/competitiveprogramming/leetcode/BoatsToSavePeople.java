package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;

public class BoatsToSavePeople {

  /**
   * Determine the minimum number of boats needed to save everyone.
   * Each boat can carry two people.
   * @param people The weight of the people.
   * @param limit The weight limit for the boat.
   * @return The number of boats.
   */
  public int numRescueBoats(int[] people, int limit) {
    int result = 0;
    Arrays.sort(people);
    int left = 0;
    int right = people.length - 1;
    while (left <= right) {
      if (people[left] + people[right] > limit) {
        ++result;
        --right;
      } else {
        ++result;
        --right;
        ++left;
      }
    }
    return result;
  }
}
