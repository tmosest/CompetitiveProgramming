package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.SimpleStackADT;

public class StackLinkedList<T> implements SimpleStackADT<T> {

  private int size;

  private Node<T> root;

  public StackLinkedList() {
    size = 0;
  }

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

  public T pop() {
    T data = null;
    if (root != null) {
      --size;
      data = root.data;
      root = root.next;
    }
    return data;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

}
