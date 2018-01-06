package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.MaxPq;
import java.util.ArrayList;

/**
 * Max Priority Queue, using a Binary Heap. A Max Binary Heap is a Binary Tree with some special
 * features. 1) It is always complete or 1 away from being complete. 2) The Parent value is always
 * greater that the value of it's two children. This gives some great qualities: 1) The root of the
 * tree is always the max element. 2) Any subtree is also a binary heap.
 */
public class BinaryHeapMaxPq<T extends Comparable<T>> implements MaxPq<T> {

  int size;
  /**
   * Special Array Representation of the Heap. If Index is K then children are 2K + 1 and 2K + 2. If
   * indexed from 1 instead of 0 then you can use 2K and 2K + 1 instead. Parent is Floor (K/2).
   */
  ArrayList<T> binaryHeap;

  /**
   * Create a new binary heap.
   */
  public BinaryHeapMaxPq() {
    size = 0;
    binaryHeap = new ArrayList<T>();
  }

  /**
   * Private method to check if one element is less than another. Checks to see if the First element
   * is less than the second. O(1)
   *
   * @param first First element to compare.
   * @param second Second element to compare.
   * @return True if the first element is strictly less than the second.
   */
  private boolean less(T first, T second) {
    return first.compareTo(second) < 0;
  }

  /**
   * Function to swap two elements in the binary heap. O(1).
   *
   * @param firstIndex Index of first element to be switched.
   * @param secondIndex Index of the second element to be switched.
   */
  private void swap(int firstIndex, int secondIndex) {
    T temp = binaryHeap.get(firstIndex);
    binaryHeap.set(firstIndex, binaryHeap.get(secondIndex));
    binaryHeap.set(secondIndex, temp);
  }

  /**
   * Function to swim a new root down the tree. O(lg size).
   */
  private void sink() {
    int parentIndex = 0;
    int firstChildIndex = 2 * parentIndex + 1;
    int secondChildIndex = 2 * parentIndex + 2;
    while (firstChildIndex < size
        && (less(binaryHeap.get(parentIndex), binaryHeap.get(firstChildIndex))
        || less(binaryHeap.get(parentIndex), binaryHeap.get(secondChildIndex)))) {
      int maxChildIndex = firstChildIndex;
      if (secondChildIndex < size && less(binaryHeap.get(firstChildIndex),
          binaryHeap.get(secondChildIndex))) {
        maxChildIndex = secondChildIndex;
      }
      swap(parentIndex, maxChildIndex);
      parentIndex = maxChildIndex;
      firstChildIndex = 2 * parentIndex + 1;
      secondChildIndex = 2 * parentIndex + 2;
    }
  }

  /**
   * The bread an butter of inserting a new element into the Heap. It attempts to the move the
   * element up the heap by comparing it to its parent. Ensures that we have a Max Heap in O(lg
   * size).
   */
  private void swim(int index) {
    int parentIndex = index / 2;
    // Swim up while the parent is less than the child
    while (parentIndex >= 0 && less(binaryHeap.get(parentIndex), binaryHeap.get(index))) {
      // Exchange them
      swap(parentIndex, index);
      // Then move up the tree
      index = parentIndex;
      parentIndex = index / 2;
    }
  }

  /**
   * Delete the max element off the PQ and return it. O(lg size).
   *
   * @return The max element of the PQ.
   */
  public T delMax() {
    // Get the max element.
    T max = max();
    // Swap it with one at the end of the heap.
    swap(0, --size);
    // Swim the new root element down.
    sink();
    return max;
  }

  /**
   * Insert a new element into the PQ. O(lg size).
   *
   * @param key key to insert.
   */
  public void insert(T key) {
    // Append element to the end of the array;
    if (size >= binaryHeap.size()) {
      binaryHeap.add(key);
    } else {
      binaryHeap.set(size, key);
    }
    size++;
    // Need to swim that element up.
    swim(size - 1);
  }

  /**
   * Determine if the PQ has any elements or not. O(1)
   *
   * @return True if the size is zero.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Returns the max element without deleting it. O(1).
   *
   * @return The max element in the PQ.
   */
  public T max() {
    return binaryHeap.get(0);
  }

  /**
   * The size of the PQ. O(1)
   */
  public int size() {
    return size;
  }

}
