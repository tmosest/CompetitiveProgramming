package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.Node;

import java.util.Stack;

public class Palindrome {

  private static Node<Integer> reversedLinkedList(Node<Integer> head) {
    Node<Integer> reversed = null;
    while (head != null) {
      // Clone
      Node<Integer> node = new Node<Integer>();
      node.data = head.data;
      node.next = reversed;
      reversed = node;
      head = head.next;
    }
    return reversed;
  }

  private static boolean isEqual(Node<Integer> firstHead, Node<Integer> secondHead) {
    while (firstHead != null && secondHead != null) {
      if (firstHead.data != secondHead.data) {
        return false;
      }
      firstHead = firstHead.next;
      secondHead = secondHead.next;
    }
    return true;
  }

  /**
   * Function to check if a linked list is a palindrome.
   *
   * @param head First node in linked list.
   * @return True if it is the same backwards.
   */
  public static boolean isPalindrome(Node<Integer> head) {
    Node<Integer> reversed = reversedLinkedList(head);
    return isEqual(head, reversed);
  }

}
