package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Cracking The Code Interview: Linked Lists: 2.7 Intersection")
public class IntersectionTest {

  @Test
  void testCase0() {
    Node<Integer> tail = new Node<Integer>();
    tail.data = 5;
    Node<Integer> node = new Node<Integer>();
    node.data = 3;
    node.next = tail;
    Node<Integer> firstHead = new Node<Integer>();
    firstHead.data = 1;
    firstHead.next = node;
    firstHead.next = node;
    Node<Integer> place = new Node<Integer>();
    place.data = 2;
    place.next = node;
    Node<Integer> secondHead = new Node<Integer>();
    secondHead.data = 7;
    secondHead.next = place;
    Assertions.assertEquals(node, Intersection.intersect(firstHead, secondHead));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(null, Intersection.intersect(null, null));
  }
}
