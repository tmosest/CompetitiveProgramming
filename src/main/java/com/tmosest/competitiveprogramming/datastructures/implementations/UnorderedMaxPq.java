package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.MaxPqAdt;

/**
 * Implementation of a Max Priority Queue using an unordered array.
 *
 * @param <T> Type of Unordered Max Priority Queue.
 */
public class UnorderedMaxPq<T extends Comparable<T>> implements MaxPqAdt<T> {

  int size;
  ArrayList<T> unorderedArray;

  public UnorderedMaxPq() {
    size = 0;
    unorderedArray = new ArrayList<T>();
  }

  /**
   * Deletes the top element off the stack and returns it.
   *
   * @return The max key on the stack.
   */
  public T delMax() {
    int max = 0;
    for (int i = 1; i < size; i++) {
      if (unorderedArray.get(i).compareTo(unorderedArray.get(i)) > 0) {
        max = i;
      }
    }
    T temp = unorderedArray.get(size - 1);
    unorderedArray.set(size - 1, unorderedArray.get(max));
    unorderedArray.set(max, temp);
    return unorderedArray.get(--size);
  }

  /**
   * Insert a new element onto the queue.
   *
   * @param key key to insert.
   */
  public void insert(T key) {
    if (size >= unorderedArray.size()) {
      unorderedArray.add(key);
    } else {
      unorderedArray.set(size, key);
    }
    size++;
  }

  /**
   * Determines if there are any elements in the queue.
   *
   * @return true if the queue is empty.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Function to get the max element in the array. Has a complexity of O(N).
   *
   * @return the max key in the unordered array.
   */
  public T max() {
    T max = unorderedArray.get(0);
    for (int i = 0; i < size; i++) {
      T toCheck = unorderedArray.get(i);
      if (max.compareTo(toCheck) < 0) {
        max = toCheck;
      }
    }
    return max;
  }

  /**
   * Gets the size of the priority queue.
   *
   * @return The number of elements in the queue.
   */
  public int size() {
    return size;
  }
}
