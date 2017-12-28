package com.tmosest.competitiveprogramming.datastructures;

public interface StringStackADT {
  /**
   * Insert a new String into the stack.
   * @param s new string to add.
   */
  void push(String s);
  /**
   * Remove and return last string added to the stack.
   * @return Last string added to the stack.
   */
  String pop();
  /**
   * Is the Stack Empty?
   * @return true if the stack is empty.
   */
  boolean isEmpty();
  /**
   * The Number of Strings on the stack.
   * @return
   */
  int size();
}
