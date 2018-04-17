package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.MaxPqAdt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Data Structures: Priority Queues: Ordered Max Priority Queue")
public class OrderedMaxPqTest {

  MaxPqAdt<Integer> integerUnorderedMaxPQ;
  Integer max = 7;
  Integer min = 1;
  Integer bigger = 5;

  @BeforeEach
  void createPq() {
    integerUnorderedMaxPQ = new OrderedMaxPq<Integer>();
  }

  @Test
  @DisplayName("Empty queue has size 0")
  void emptySizeTest() {
    Assertions.assertEquals(0, integerUnorderedMaxPQ.size());
    Assertions.assertEquals(true, integerUnorderedMaxPQ.isEmpty());
  }

  @Test
  @DisplayName("Can insert keys")
  void canInsert() {
    integerUnorderedMaxPQ.insert(bigger);
    Assertions.assertEquals(1, integerUnorderedMaxPQ.size());
    Assertions.assertEquals(false, integerUnorderedMaxPQ.isEmpty());
    integerUnorderedMaxPQ.insert(max);
    Assertions.assertEquals(2, integerUnorderedMaxPQ.size());
    integerUnorderedMaxPQ.insert(max);
    integerUnorderedMaxPQ.insert(max);
    integerUnorderedMaxPQ.insert(max);
    Assertions.assertEquals(5, integerUnorderedMaxPQ.size());
  }

  @Test
  @DisplayName("Can get max element")
  void canGetMaxElement() {
    Integer max = 5;
    Integer min = 1;
    Integer bigger = 7;
    integerUnorderedMaxPQ.insert(max);
    Assertions.assertEquals(max, integerUnorderedMaxPQ.max());
    integerUnorderedMaxPQ.insert(min);
    Assertions.assertEquals(max, integerUnorderedMaxPQ.max());
    integerUnorderedMaxPQ.insert(bigger);
    Assertions.assertEquals(bigger, integerUnorderedMaxPQ.max());
  }

  @Test
  @DisplayName("Can delete max element")
  void canDeleteMaxElement() {
    integerUnorderedMaxPQ.insert(max);
    Assertions.assertEquals(max, integerUnorderedMaxPQ.delMax());
    Assertions.assertEquals(0, integerUnorderedMaxPQ.size());
    Assertions.assertEquals(true, integerUnorderedMaxPQ.isEmpty());
    integerUnorderedMaxPQ.insert(min);
    Assertions.assertEquals(min, integerUnorderedMaxPQ.max());
    Assertions.assertEquals(1, integerUnorderedMaxPQ.size());
    Assertions.assertEquals(false, integerUnorderedMaxPQ.isEmpty());
    integerUnorderedMaxPQ.insert(bigger);
    Assertions.assertEquals(bigger, integerUnorderedMaxPQ.delMax());
    Assertions.assertEquals(min, integerUnorderedMaxPQ.delMax());
  }

  @Test
  @DisplayName("Capacity Test")
  void capacityTest() {
    Integer max = 5;
    for (int i = 0; i < 100; i++) {
      integerUnorderedMaxPQ.insert(max);
    }
    Assertions.assertEquals(100, integerUnorderedMaxPQ.size());
  }
}
