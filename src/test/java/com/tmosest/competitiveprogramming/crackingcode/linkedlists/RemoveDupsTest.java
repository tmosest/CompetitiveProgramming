package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Cracking The Code Interview: Arrays: 2.1 Remove the Dups")
public class RemoveDupsTest {

  @Test
  void shouldRemoveDups() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.append(5);
    linkedList.append(3);
    linkedList.append(5);
    LinkedList<Integer> result = new LinkedList<Integer>();
    result.append(5);
    result.append(3);
    Assertions.assertEquals(true, result.equals(RemoveDups.removeDups(linkedList)));
  }

}
