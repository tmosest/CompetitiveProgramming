package com.tmosest.CompetitiveProgramming.datastructures.implementations;

import com.tmosest.CompetitiveProgramming.datastructures.SimpleStackADT;

public class StackLinkedList<T> implements SimpleStackADT<T> {

  private int size;

  private Node<T> root;

  public StackLinkedList() {
    size = 0;
  }

  @Override
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

  @Override
  public T pop() {
    T data = null;
    if (root != null) {
      --size;
      data = root.data;
      root = root.next;
    }
    return data;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public int size() {
    return size;
  }

}
