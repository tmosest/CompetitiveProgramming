package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeleteMiddleNodeTest {
  @Test
  void shouldRemoveMiddle() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.append(5);
    linkedList.append(3);
    linkedList.append(5);
    LinkedList<Integer> result = new LinkedList<Integer>();
    result.append(5);
    result.append(5);
    Assertions.assertEquals(true, DeleteMiddleNode.deleteMiddleNode(linkedList.head().next));
    linkedList.decreaseSize();
    Assertions.assertEquals(true, result.equals(result));
  }
}
