package com.tmosest.competitiveprogramming.datastructures;

/**
 * This class is used for Search Algorithms such as Binary Search for Example.
 *
 * @author tmosest
 */
public interface SearchAdt {

  /**
   * Searches an array of elements for a particular K and returns that value.
   *
   * @param element The element that is being searched for.
   * @return The index of that element or -1.
   */
  int search(int element);
}
