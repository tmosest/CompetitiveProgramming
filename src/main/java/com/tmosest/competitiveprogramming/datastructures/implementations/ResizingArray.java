package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.ArrayListADT;

public class ResizingArray<T> implements ArrayListADT<T> {

  private int N;
  private T[] array;
  
  @SuppressWarnings("unchecked")
  public ResizingArray() {
      N = 0;
      array = (T[]) new Object[10];
  }
  
  public boolean isEmpty() { return N == 0; }
  
  public int size() { return N; }

  public T get(int i) throws IndexOutOfBoundsException {
      if(i >= N || i < 0) 
          throw new IndexOutOfBoundsException();
      return array[i];
  }
  
  @SuppressWarnings("unchecked")
  private void resize() {
      int length = array.length;
      if(N == length) {
          T[] array2 = (T[]) new Object[2 * array.length];
          for(int i = 0; i < length; i++) {
              array2[i] = array[i];
          }
          array = array2;
      } else if(N * 4 > length) {
            
          T[] array2 = (T[]) new Object[array.length / 4];
          for(int i = 0; i < length; i++) {
              array2[i] = array[i];
          }
          array = array2;
      }
  }

  public T pop() {
      return (isEmpty()) ? null : array[--N];
  }

  public void push(T item) {
      if(N == array.length)
          resize();
      array[N++] = item;
  }

  public T peek() {
      return (isEmpty()) ? null : array[N-1];
  }
}
