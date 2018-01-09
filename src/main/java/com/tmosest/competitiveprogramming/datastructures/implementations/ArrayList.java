package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.ArrayListAdt;

import java.util.Iterator;

public class ArrayList<T> implements ArrayListAdt<T>, Iterable<T> {

  private int size;
  private T[] array;

  public ArrayList() {
    size = 0;
    array = (T[]) new Object[10];
  }

  /**
   * Private function to resize the array.
   */
  private void resize() {
    int length = array.length;
    if (size == length) {
      T[] array2 = (T[]) new Object[2 * array.length];
      for (int i = 0; i < length; i++) {
        array2[i] = array[i];
      }
      array = array2;
    } else if (size * 4 > length) {
      T[] array2 = (T[]) new Object[size];
      for (int i = 0; i < size; i++) {
        array2[i] = array[i];
      }
      array = array2;
    }
  }

  /**
   * Push an element onto the end of the Array.
   *
   * @param item Item to be pushed.
   */
  public void add(T item) {
    if (size == array.length) {
      resize();
    }
    array[size++] = item;
  }

  /**
   * Get the element at the index.
   *
   * @param index The index to get the element from.
   * @return The element at the index.
   * @throws IndexOutOfBoundsException index was outside of the bounds.
   */
  public T get(int index) throws IndexOutOfBoundsException {
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException();
    }
    return array[index];
  }

  /**
   * Determine if the Array is empty.
   *
   * @return True if the size is zero.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Pop the top element.
   *
   * @return the last element in the array.
   */
  public T pop() {
    T top = null;
    if (size > 0) {
      top = array[--size];
      resize();
    }
    return top;
  }

  /**
   * Get the size of the Array.
   */
  public int size() {
    return size;
  }

  /**
   * Function to update the value at an index.
   *
   * @param index index to be updated.
   * @param element value to set the index to.
   */
  public void set(int index, T element) {
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException();
    }
    array[index] = element;
  }

  /**
   * Make Array List Iterable.
   *
   * @return Iterator over the array.
   */
  public Iterator<T> iterator() {
    return new Iterator<T>() {
      private int counter = 0;

      public boolean hasNext() {
        return size > counter;
      }

      public T next() {
        return array[counter++];
      }

    };
  }

}
