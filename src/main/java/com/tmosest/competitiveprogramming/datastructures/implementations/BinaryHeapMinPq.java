package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.MinPqAdt;

public class BinaryHeapMinPq<T extends Comparable<T>> implements MinPqAdt<T> {

  int size;
  T[] binaryHeap; // Parent is floor(index / 2); Children are 2 index + 1 and 2 index + 2.

  /**
   * Create an empty minimum priority queue.
   *
   * @param capacity maximum number of elements.
   */
  public BinaryHeapMinPq(int capacity) {
    size = 0;
    binaryHeap = (T[]) new Comparable[capacity];
  }

  /**
   * Swap the position of two elements in the array. O(1).
   *
   * @param first Fist index.
   * @param second Second index.
   */
  private void swap(int first, int second) {
    T temp = binaryHeap[first];
    binaryHeap[first] = binaryHeap[second];
    binaryHeap[second] = temp;
  }

  /**
   * Determine if first element is less than second. False is either are null. O(1).
   *
   * @param first First element.
   * @param second Second element.
   * @return True if first is less than second.
   */
  private boolean less(T first, T second) {
    if (first == null || second == null) {
      return false;
    }
    return first.compareTo(second) < 0;
  }

  /**
   * Sinks root to proper position in the binary heap. O(lg size).
   */
  private void sink() {
    int parent = 0;
    int childLeft = 1;
    int childRight = 2;
    while (childLeft < size && (less(binaryHeap[childLeft], binaryHeap[parent]) || less(
        binaryHeap[childRight], binaryHeap[parent]))) {
      int minIndex = childLeft;
      if (childRight < size && less(binaryHeap[childRight], binaryHeap[childLeft])) {
        minIndex = childRight;
      }
      swap(parent, minIndex);
      parent = minIndex;
      childLeft = 2 * parent + 1;
      childRight = 2 * parent + 2;
    }
  }

  /**
   * Swim up an index to the proper position in the binary heap. O(lg size).
   *
   * @param index Index of where to start swimming from.
   */
  private void swim(int index) {
    while (less(binaryHeap[index], binaryHeap[index / 2])) {
      swap(index, index / 2);
      index /= 2;
    }
  }

  /**
   * Delete the minimum element from the queue and return it. O(lg size).
   *
   * @return The minimum element that was just deleted.
   */
  public T delMin() {
    T min = min();
    swap(0, --size);
    sink();
    return min;
  }

  /**
   * Insert a new element into the queue. O(lg size).
   *
   * @param element The new elment to be inserted.
   */
  public void insert(T element) {
    binaryHeap[size++] = element;
    swim(size - 1);
  }

  /**
   * Determines if there are any elements in the queue. O(1).
   *
   * @return True if the size is 0.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Returns the minimum element in the queue without deleting it. O(1).
   *
   * @return The minimum element.
   */
  public T min() {
    return binaryHeap[0];
  }

  /**
   * Number of elements in the queue. O(1).
   *
   * @return Size of the queue.
   */
  public int size() {
    return size;
  }
}
