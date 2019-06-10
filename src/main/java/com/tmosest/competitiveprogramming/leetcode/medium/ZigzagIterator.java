package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Iterator;
import java.util.List;

class ZigzagIterator implements Iterator<Integer>, Iterable<Integer> {

  private int indexOne;
  private int indexTwo;
  private List<Integer> listOne;
  private List<Integer> listTwo;

  /**
   * Create a new zig zag iterator.
   *
   * @param listOne The first list.
   * @param listTwo The second list.
   */
  public ZigzagIterator(List<Integer> listOne, List<Integer> listTwo) {
    indexOne = 0;
    indexTwo = 0;
    this.listOne = listOne;
    this.listTwo = listTwo;
  }

  /**
   * Return the next element in the zig zag.
   *
   * @return the next element.
   */
  public Integer next() {
    if (indexOne >= listOne.size()) {
      return listTwo.get(indexTwo++);
    }
    if (indexTwo >= listTwo.size()) {
      return listOne.get(indexOne++);
    }
    if (indexOne == indexTwo) {
      return listOne.get(indexOne++);
    }
    return listTwo.get(indexTwo++);
  }

  /**
   * Determine if there is a next element.
   *
   * @return true if there is a next element.
   */
  public boolean hasNext() {
    return indexOne < listOne.size() || indexTwo < listTwo.size();
  }

  @Override
  public Iterator<Integer> iterator() {
    return this;
  }
}
