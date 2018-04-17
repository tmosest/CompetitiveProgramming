package com.tmosest.competitiveprogramming.datastructures;

/**
 * This interface represents the 3 - Sum - Problem. The key is to find an algorithm that can count
 * the number of different ways that we can make a sum of zero using any three distinct elements of
 * an array.
 *
 * @author tmosest
 */
public interface ThreeSumProblemAdt {

  /**
   * Count method takes an array and counts the numbers of way we can pick three elements to sum to
   * zero.
   *
   * @param array integer array.
   * @return The number of ways that we can have 3 ints sum to zero.
   */
  int count(int[] array);

}
