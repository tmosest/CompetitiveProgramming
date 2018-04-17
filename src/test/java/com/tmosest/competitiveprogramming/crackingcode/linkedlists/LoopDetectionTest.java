package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Cracking The Code Interview: Linked Lists: 2.8 Loop Detection")
public class LoopDetectionTest {

  @Test
  void testCase0() {
    Node<Integer> head = new Node<Integer>();
    head.data = 1;
    Node<Integer> nodeB = new Node<Integer>();
    nodeB.data = 2;
    Node<Integer> nodeC = new Node<Integer>();
    nodeC.data = 3;
    Node<Integer> nodeD = new Node<Integer>();
    nodeD.data = 4;
    Node<Integer> nodeE = new Node<Integer>();
    nodeE.data = 5;
    Node<Integer> nodeF = new Node<Integer>();
    nodeF.data = 5;

    head.next = nodeB;
    nodeB.next = nodeC;
    nodeC.next = nodeD;
    nodeD.next = nodeE;
    nodeE.next = nodeF;
    nodeF.next = nodeC;

    Assertions.assertEquals(nodeC, LoopDetection.findLoopNode(head));
  }

  @Test
  void testCase1() {
    Node<Integer> head = new Node<Integer>();
    head.data = 1;
    Node<Integer> nodeB = new Node<Integer>();
    nodeB.data = 2;
    Node<Integer> nodeC = new Node<Integer>();
    nodeC.data = 3;

    head.next = nodeB;
    nodeB.next = nodeC;

    Assertions.assertEquals(null, LoopDetection.findLoopNode(head));
  }
}
