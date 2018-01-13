package com.tmosest.competitiveprogramming.crackingcode.linkedlists;

import com.tmosest.competitiveprogramming.datastructures.implementations.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Cracking The Code Interview: Arrays: 2.3 Partition")
public class PartitionTest {

  @Test
  void shouldpartition() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.append(5);
    linkedList.append(3);
    linkedList.append(5);
    LinkedList<Integer> result = new LinkedList<Integer>();
    result.append(3);
    result.append(5);
    result.append(5);
    Assertions.assertEquals(true, Partition.partitioned(linkedList.head(), 5));
    Assertions.assertEquals(true, result.equals(result));
  }

}
