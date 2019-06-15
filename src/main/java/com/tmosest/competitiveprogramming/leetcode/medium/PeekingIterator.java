package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class PeekingIterator implements Iterator<Integer>, Iterable<Integer> {

  private int index;
  private List<Integer> list;

  /**
   * Create a PeekingIterator.
   * Decorator that gives peek to an iterator.
   *
   * @param iterator The iterator we are wrapping.
   */
  public PeekingIterator(Iterator<Integer> iterator) {
    list = new ArrayList<>();
    while (iterator.hasNext()) {
      Integer num = iterator.next();
      list.add(num);
    }
  }

  /**
   * Peek at the next element.
   *
   * @return a peek at the next element.
   */
  public Integer peek() {
    return list.get(index);
  }

  /**
   * Next element in the base iterator.
   *
   * @return The next element.
   */
  @Override
  public Integer next() {
    return list.get(index++);
  }

  /**
   * Determine if the iterator has a next value.
   *
   * @return True if there is a next value.
   */
  @Override
  public boolean hasNext() {
    return index < list.size();
  }

  @Override
  public Iterator<Integer> iterator() {
    return this;
  }
}
