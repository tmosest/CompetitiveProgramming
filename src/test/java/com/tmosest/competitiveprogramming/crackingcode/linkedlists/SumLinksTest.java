package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Cracking The Code Interview: Linked Lists: 2.5 Sum Lists")
public class SumLinksTest {

  @Test
  void shouldSumLinkedList() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.append(5);
    linkedList.append(3);
    linkedList.append(5);
    LinkedList<Integer> otherLinkedList = new LinkedList<Integer>();
    otherLinkedList.append(1);
    otherLinkedList.append(2);
    otherLinkedList.append(3);
    Assertions.assertEquals((535 + 123), SumLinks.sumLinks(linkedList.head(), otherLinkedList.head(), false));
    Assertions.assertEquals((535 + 321), SumLinks.sumLinks(linkedList.head(), otherLinkedList.head(), true));
  }

}
