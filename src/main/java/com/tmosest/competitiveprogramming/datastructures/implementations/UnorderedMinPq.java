package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.MinPqAdt;

/**
 * Implementation of a minimum priority queue using an unordered array.
 *
 * @param <T> Type of minimum priority queue. Ex: Integer, Double, String.
 */
public class UnorderedMinPq<T extends Comparable<T>> implements MinPqAdt<T> {

  int size;
  T[] unorderedArray;


  /**
   * Create an empty Minimum Priority Queue.
   *
   * @param capacity How big the queue can get.
   */
  public UnorderedMinPq(int capacity) {
    size = 0;
    unorderedArray = (T[]) new Comparable[capacity];
  }

  private boolean less(T first, T second) {
    return first.compareTo(second) < 0;
  }

  private void exch(int first, int second) {
    T temp = unorderedArray[first];
    unorderedArray[first] = unorderedArray[second];
    unorderedArray[second] = temp;
  }

  private int minIndex() {
    int index = 0;
    for (int i = 0; i < size; i++) {
      if (less(unorderedArray[i], unorderedArray[index])) {
        index = i;
      }
    }
    return index;
  }

  /**
   * Deletes the minimum element and returns it.
   *
   * @return The minimum element in the queue.
   */
  public T delMin() {
    int minIndex = minIndex();
    exch(minIndex, size - 1);
    return unorderedArray[--size];
  }

  /**
   * Insert a new element into the queue.
   *
   * @param element The element to be inserted.
   */
  public void insert(T element) {
    unorderedArray[size++] = element;
  }

  /**
   * Determines if the queue is empty or not.
   *
   * @return True if empty.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * The minimum element in the queue.
   *
   * @return The minumum element.
   */
  public T min() {
    return unorderedArray[minIndex()];
  }

  /**
   * The size of the queue.
   *
   * @return Number of elements in the queue.
   */
  public int size() {
    return size;
  }
}
