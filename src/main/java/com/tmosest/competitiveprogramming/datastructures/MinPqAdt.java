package com.tmosest.competitiveprogramming.datastructures;

/**
 * Interface for a Minimum Priority Queue.
 *
 * @param <T> Type of Minimum Priority Queue, needs to be Comparable.
 */
public interface MinPqAdt<T extends Comparable<T>> {

  /**
   * Deletes the minimum element off the queue and returns it.
   *
   * @return The minimum element of the queue.
   */
  T delMin();

  /**
   * Insert a new element into the queue.
   *
   * @param key new element to insert.
   */
  void insert(T key);

  /**
   * Determines if the Queue is empty or not.
   *
   * @return True if empty.
   */
  boolean isEmpty();

  /**
   * Returns the minimum element.
   *
   * @return The minimum element.
   */
  T min();

  /**
   * Gets the size of the queue.
   *
   * @return Number of elements in the queue.
   */
  int size();
}
