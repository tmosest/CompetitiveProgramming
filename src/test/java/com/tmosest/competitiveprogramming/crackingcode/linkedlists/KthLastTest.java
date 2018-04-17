package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Cracking The Code Interview: Linked Lists: 2.2 Return Kth to Last")
public class KthLastTest {
  @Test
  void testCase0() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.append(1);
    linkedList.append(5);
    linkedList.append(3);
    linkedList.append(5);
    Assertions.assertEquals(5, KthLast.kthLast(linkedList, 0));
    Assertions.assertEquals(3, KthLast.kthLast(linkedList, 1));
    Assertions.assertEquals(5, KthLast.kthLast(linkedList, 2));
    Assertions.assertEquals(1, KthLast.kthLast(linkedList, 3));
  }
}
