package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.LinkedList;
import com.tmosest.competitiveprogramming.datastructures.implementations.Node;
import java.util.HashSet;
import java.util.Set;

public class RemoveDups {

  public static LinkedList<Integer> removeDups(LinkedList<Integer> linkedList) {
    Set<Integer> set = new HashSet<Integer>();
    Node<Integer> head = linkedList.head();
    while(head  != null && head.next != null) {
      set.add(head.data);
      if (set.contains(head.next.data)) {
        head.next = head.next.next;
        linkedList.decreaseSize();
      }
      head = head.next;
    }
    return linkedList;
  }

}
