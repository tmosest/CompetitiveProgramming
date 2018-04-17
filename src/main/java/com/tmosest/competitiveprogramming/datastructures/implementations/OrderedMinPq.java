package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.MinPqAdt;

public class OrderedMinPq<T extends Comparable<T>> implements MinPqAdt<T> {

  int size; // How many elements on in the queue.
  T[] orderedArray; // Store the elements from highest to lowest.

  private boolean less(T first, T second) {
    if (first == null || second == null) {
      return false;
    }
    return first.compareTo(second) < 0;
  }

  private void shiftUp(int index) {
    for (int i = size - 1; i > index; i--) {
      orderedArray[i] = orderedArray[i - 1];
    }
  }

  /**
   * Create a new Ordered Min Priority Queue.
   *
   * @param capacity The maximum number of elements.
   */
  public OrderedMinPq(int capacity) {
    size = 0;
    orderedArray = (T[]) new Comparable[capacity];
  }

  /**
   * Delete the minimum element off the queue and return it.
   *
   * @return The minimum element.
   */
  public T delMin() {
    return orderedArray[--size];
  }

  /**
   * Insert a new element into the queue.
   *
   * @param element New element to add.
   */
  public void insert(T element) {
    ++size;
    int index;
    for (index = 0; index < size; index++) {
      if (less(orderedArray[index], element)) {
        break;
      }
    }
    if (index == size) {
      orderedArray[index - 1] = element;
    } else {
      // shift up
      shiftUp(index);
      orderedArray[index] = element;
    }
  }

  /**
   * Determine if the queue is empty.
   *
   * @return True if there are no elements in the queue.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Returns the minimum element without deleting it.
   *
   * @return The minimum element.
   */
  public T min() {
    return orderedArray[size - 1];
  }

  /**
   * The number of elements in the queue.
   *
   * @return The size of the queue.
   */
  public int size() {
    return size;
  }
}
