package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Cracking The Code Interview: Linked Lists: 2.5 Palindrome")
public class PalindromeTest {

  @Test
  public void testCase0() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.append(1);
    linkedList.append(2);
    linkedList.append(3);
    linkedList.append(4);
    linkedList.append(3);
    linkedList.append(2);
    linkedList.append(1);
    Assertions.assertEquals(true, Palindrome.isPalindrome(linkedList.head()));
  }

  @Test
  public void testCase1() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.append(1);
    linkedList.append(2);
    Assertions.assertEquals(false, Palindrome.isPalindrome(linkedList.head()));
  }

  @Test
  public void testCase2() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    Assertions.assertEquals(true, Palindrome.isPalindrome(linkedList.head()));
  }

}
