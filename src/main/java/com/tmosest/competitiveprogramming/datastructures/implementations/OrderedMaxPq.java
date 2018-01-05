package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.MaxPq;

import java.util.ArrayList;

/**
 * Ordered Array version of a Max Priority Queue.
 */
public class OrderedMaxPq<T extends Comparable<T>> implements MaxPq<T> {

  int size;
  ArrayList<T> orderedArray;

  /**
   * Creates an empty priority queue.
   */
  public OrderedMaxPq() {
    size = 0;
    orderedArray = new ArrayList<T>();
  }

  /**
   * Delete the max element from the queue and return it. O(1).
   *
   * @return The max element on the queue.
   */
  public T delMax() {
    return orderedArray.get(--size);
  }

  /**
   * Determine if the queue is empty or not.
   *
   * @return Return true if the size is zero.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Insert a new element onto the queue. O(size).
   *
   * @param key key to insert.
   */
  public void insert(T key) {
    int toInsert = size;
    for (int i = 0; i < size; i++) {
      if (orderedArray.get(i).compareTo(key) > 0) {
        toInsert = i;
        break;
      }
    }
    if (toInsert == size) {
      if (size >= orderedArray.size()) {
        orderedArray.add(key);
      } else {
        orderedArray.set(size, key);
      }
    } else {
      // Need to shift up
      for (int i = size; i > toInsert; i--) {
        if (i >= orderedArray.size()) {
          orderedArray.add(orderedArray.get(i - 1));
        } else {
          orderedArray.set(i, orderedArray.get(i - 1));
        }
      }
      orderedArray.set(toInsert, key);
    }
    size++;
  }

  /**
   * Get the max element. O(1).
   */
  public T max() {
    return orderedArray.get(size - 1);
  }

  /**
   * Return the size.
   *
   * @return Number of elements in the queue.
   */
  public int size() {
    return size;
  }
}
