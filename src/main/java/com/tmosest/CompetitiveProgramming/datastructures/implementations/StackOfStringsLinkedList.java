package com.tmosest.CompetitiveProgramming.datastructures.implementations;

import com.tmosest.CompetitiveProgramming.datastructures.StringStackADT;

public class StackOfStringsLinkedList implements StringStackADT {

  private int size;
  private Node<String> root;

  public StackOfStringsLinkedList() {
    size = 0;
  }

  @Override
  public void push(String s) {
    // If no root node
    if (root == null) {
      root = new Node<String>();
      root.data = s;
    }
    // Other wise append new node
    else {
      Node<String> toPush = new Node<String>();
      toPush.data = s;
      toPush.next = root;
      root = toPush;
    }
    ++size;
  }

  @Override
  public String pop() {
    String data = null;
    if (!isEmpty()) {
      // Get data
      data = root.data;
      // Update Root
      root = root.next;
      // Update Size
      --size;
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
