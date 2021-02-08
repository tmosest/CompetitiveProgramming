package com.tmosest.competitiveprogramming.datastructures;

public interface Interval<T extends Comparable<T>> {

  // Use for converting from string to interval
  String DELIMITER = "-";

  /**
   * Get the starting position for the interval.
   * @return T the start.
   */
  T getStart();

  /**
   * Get the closing position for the interval.
   * @return T the end.
   */
  T getEnd();

  /**
   * Determines if the value is in the interval or not.
   * @param value The value to check for.
   * @return True if it is with in the interval.
   */
  boolean isInInterval(T value);
}
