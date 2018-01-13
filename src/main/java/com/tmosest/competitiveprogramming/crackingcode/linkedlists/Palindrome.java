package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.Node;

import java.util.Stack;

public class Palindrome {

  private static Node<Integer> reversedLinkedList(Node<Integer> head) {
    Stack<Integer> stack = new Stack<Integer>();
    while (head != null) {
      stack.push(head.data);
      head = head.next;
    }
    if (stack.empty()) {
      return null;
    }
    Node<Integer> reversed = new Node<Integer>();
    reversed.data = stack.pop();
    Node<Integer> pointer = null;
    Node<Integer> next;
    while (!stack.empty()) {
      if (pointer == null) {
        pointer = new Node<Integer>();
        pointer.data = stack.pop();
        reversed.next = pointer;
      } else {
        next = new Node<Integer>();
        next.data = stack.pop();
        pointer.next = next;
        pointer = pointer.next;
      }
    }
    return reversed;
  }

  /**
   * Function to check if a linked list is a palindrome.
   *
   * @param head First node in linked list.
   * @return True if it is the same backwards.
   */
  public static boolean isPalindrome(Node<Integer> head) {
    Node<Integer> reversed = reversedLinkedList(head);
    while (head != null) {
      if (head.data != reversed.data) {
        return false;
      }
      head = head.next;
      reversed = reversed.next;
    }
    return true;
  }

}
