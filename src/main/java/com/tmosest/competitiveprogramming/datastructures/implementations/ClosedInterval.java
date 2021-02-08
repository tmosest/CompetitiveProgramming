package com.tmosest.competitiveprogramming.datastructures.implementations;


import com.tmosest.competitiveprogramming.datastructures.Interval;

/**
 * Interval that includes both endpoints.
 * Aka [a,b] in mathematical notation.
 * @param <T> A Comparable value for determining if another value is within or not.
 */
public class ClosedInterval<T extends Comparable<T>> implements Interval<T> {

  private T start;
  private T end;

  private ClosedInterval(T start, T end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public T getStart() {
    return start;
  }

  @Override
  public T getEnd() {
    return end;
  }

  public boolean isInInterval(T value) {
    return start.compareTo(value) <= 0 && value.compareTo(end) <= 0;
  }

  public static ClosedInterval<Integer> fromIntString(String str) {
    String[] values = str.trim().split(DELIMITER);
    return new ClosedInterval<>(Integer.valueOf(values[0]), Integer.valueOf(values[1]));
  }
}
