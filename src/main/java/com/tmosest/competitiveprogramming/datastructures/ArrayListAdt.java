package com.tmosest.competitiveprogramming.datastructures;

import java.util.List;

/**
 * ArrayListAdt, Class That represents an abstract ArrayList.
 *
 * @param <T> The type of ArrayList: EX: Integer, Long, String.
 * @author tmosest
 */
public interface ArrayListAdt<T> extends List {

  /**
   * Returns the current item in the i'th slot. Starting at zero.
   * @throws IndexOutOfBoundsException index was out of bounds.
   */
  T get(int index) throws IndexOutOfBoundsException;

  /**
   * Determines if an Array is empty or not.
   */
  boolean isEmpty();

  /**
   * Remove the last element.
   * @return The last element in the ArrayList.
   */
  T pop();

  /**
   * Returns the current size of the Array List.
   */
  int size();
}

