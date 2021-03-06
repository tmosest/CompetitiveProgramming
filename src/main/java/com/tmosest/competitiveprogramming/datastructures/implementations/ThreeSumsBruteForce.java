package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.ThreeSumProblemAdt;

/**
 * This class represents a brute force solution to the Three Sums Problems.
 *
 * @author tmosest
 */
public class ThreeSumsBruteForce implements ThreeSumProblemAdt {

  /**
   * Counts the number of ways we can add up to zero using 3 for loops.
   */
  public int count(int[] array) {
    int count = 0;
    for (int i = 0; i < array.length - 2; i++) {
      for (int j = i + 1; j < array.length - 1; j++) {
        for (int k = j + 1; k < array.length; k++) {
          if (array[i] + array[k] + array[j] == 0) {
            ++count;
          }
        }
      }
    }
    return count;
  } // end count
}
