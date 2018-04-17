package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.SearchAdt;

/**
 * This class is a wrapper for binary search. The algorithm is as follows: Compare key against
 * middle: Too big, go left. Too small, go right. Equals then we can return.
 *
 * @author tmosest
 */
public class BinarySearch implements SearchAdt {

  /**
   * Array that we will be searching through We need this to be sorted.
   */
  private int[] searchArray;

  /**
   * At the moment we assume that the given array is already sorted. This will need to be updated to
   * make the program more robust.
   */
  public BinarySearch(int[] toSearch) {
    searchArray = toSearch;
  }

  /**
   * Implements Binary Search to find an element.
   */
  public int search(int element) {
    int low = 0;
    int high = searchArray.length - 1;
    while (low <= high) {
      int middle = (high + low) / 2; // The book uses: low + (high - low) / 2 but doesn't seem to
      // matter.
      if (element < searchArray[middle]) {
        high = middle - 1;
      } else if (element > searchArray[middle]) {
        low = middle + 1;
      } else {
        return middle;
      }
    }
    return -1;
  }

}
