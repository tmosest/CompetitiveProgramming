package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.SimpleStackAdt;

public class StackLinkedList<T> implements SimpleStackAdt<T> {

  private int size;

  private Node<T> root;

  public StackLinkedList() {
    size = 0;
  }

  /**
   * Push a new element onto the stack.
   *
   * @param element new object to add.
   */
  public void push(T element) {
    if (root == null) {
      root = new Node<T>();
      root.data = element;
    } else {
      Node<T> toPrepend = new Node<T>();
      toPrepend.data = element;
      toPrepend.next = root;
      root = toPrepend;
    }
    ++size;
  }

  /**
   * Pop an element off of the stack.
   */
  public T pop() {
    T data = null;
    if (root != null) {
      --size;
      data = root.data;
      root = root.next;
    }
    return data;
  }

  /**
   * Determine if the stack is empty or not.
   *
   * @return True if the size is zero.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Get the size of the stack.
   *
   * @return Number of elements on the stack.
   */
  public int size() {
    return size;
  }

}
