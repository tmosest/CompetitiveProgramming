package com.tmosest.competitiveprogramming.datastructures;

/**
 * Interface for a Max Priority Queue.
 *
 * @param <T> Type of Priority Queue needs to be comparable.
 */
public interface MaxPqAdt<T extends Comparable<T>> {

  /**
   * Return and remove the largest key.
   *
   * @return Largest key in the priority queue.
   */
  T delMax();

  /**
   * Insert a key into the priority queue.
   *
   * @param key key to insert.
   */
  void insert(T key);

  /**
   * Determine if the priority queue is empty of not.
   *
   * @return true if the priority queue is empty and false otherwise.
   */
  boolean isEmpty();

  /**
   * Return the largest key but do not delete it off the queue.
   *
   * @return Largest key in the priority queue.
   */
  T max();

  /**
   * Return the size of the priority queue.
   *
   * @return Integer representing how big the queue is.
   */
  int size();
}
