package com.tmosest.competitiveprogramming.datastructures;

/**
 * ArrayListAdt, Class That represents an abstract ArrayList.
 *
 * @param <T> The type of ArrayList: EX: Integer, Long, String.
 * @author tmosest
 */
public interface ArrayListAdt<T> {

  /**
   * Adds a new item to the end of the Array.
   */
  void add(T item);

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
   * Function to set an index.
   * @param index index to be updated.
   * @param element value to set the index to.
   * @throws IndexOutOfBoundsException index was out of bounds.
   */
  void set(int index, T element) throws IndexOutOfBoundsException;

  /**
   * Returns the current size of the Array List.
   */
  int size();

}

