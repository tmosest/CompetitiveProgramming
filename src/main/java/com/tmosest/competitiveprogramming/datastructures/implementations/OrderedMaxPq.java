package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.MaxPq;

public class OrderedMaxPq<T extends Comparable<T>> implements MaxPq<T> {

  int size;
  T[] orderedArray;

  public OrderedMaxPq(int capacity) {
    size = 0;
    orderedArray = (T[]) new Comparable[capacity];
  }

  public T delMax() {
    return orderedArray[--size];
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void insert(T key) {
    int toInsert = 0;
    for (int i = 0; i < size; i++) {
      if (orderedArray[i].compareTo(key) > 0) {
        toInsert = i;
        break;
      }
    }
    if (toInsert == size) {
      orderedArray[size] = key;
    } else {
      // Need to shift up
      for (int i = size; i > toInsert; i--) {
        orderedArray[i] = orderedArray[i - 1];
      }
      orderedArray[toInsert] = key;
    }
    size++;
  }

  public T max() {
    return orderedArray[size - 1];
  }

  public int size() {
    return size;
  }
}
