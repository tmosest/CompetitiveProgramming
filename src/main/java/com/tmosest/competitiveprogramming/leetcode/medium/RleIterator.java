package com.tmosest.competitiveprogramming.leetcode.medium;

class RleIterator {

  private int[] vals;
  private int index;

  /**
   * Create a new RLE iterator
   *
   * @param vals the values.
   */
  RleIterator(int[] vals) {
    this.vals = vals;
    index = 0;
    setToNonZero();
  }

  private void setToNonZero() {
    while (index < vals.length && vals[index] == 0) {
      index += 2;
    }
  }

  /**
   * Iterate a number of times and get the latest value.
   *
   * @param times The number of times to iterate.
   * @return The last value.
   */
  int next(int times) {
    if (index + 1 >= vals.length) {
      return -1;
    }
    int diff = 0;
    while (index < vals.length && (diff = vals[index] - times) < 0) {
      times = -diff;
      vals[index] = 0;
      setToNonZero();
    }
    int val = -1;
    if (index < vals.length) {
      vals[index] = diff;
      val = vals[index + 1];
    }
    return val;
  }
}
