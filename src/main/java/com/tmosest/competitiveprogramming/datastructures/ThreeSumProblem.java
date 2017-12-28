package com.tmosest.competitiveprogramming.datastructures;

/**
 * This interface represents the 3 - Sum - Problem.
 * 
 * The key is to find an algorithm that can count the number of different ways that we can make a
 * sum of zero using any three distinct elements of an array.
 * 
 * @author tmosest
 */
public interface ThreeSumProblem {
  /**
   * Count method takes an array and counts the numbers of way we can pick three elements to sum to
   * zero.
   * 
   * @param array
   * @return
   */
  public int count(int[] array);

}
