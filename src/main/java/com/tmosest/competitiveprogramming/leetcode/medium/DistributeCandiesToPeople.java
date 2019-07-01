package com.tmosest.competitiveprogramming.leetcode.medium;

class DistributeCandiesToPeople {

  /**
   * Print an array containing the final number of candies.
   *
   * @param candies The total number of candies.
   * @param numPeople The number of people.
   * @return An array of candy values.
   */
  int[] distributeCandies(int candies, int numPeople) {
    int[] result = new int[numPeople];
    for (int i = 1; candies > 0; i++) {
      int toAdd = (candies > i) ? i : candies;
      result[(i - 1) % numPeople] += toAdd;
      candies -= toAdd;
    }
    return result;
  }
}
