package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.MaxPqAdt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Data Structures: Priority Queues: Binary Heap Max Priority Queue")
public class BinaryHeapMaxPqTest {

  int capacity = 100;
  Integer min = 1;
  Integer max = 7;
  Integer bigger = 5;
  MaxPqAdt<Integer> integerUnorderedMaxPQ;

  @BeforeEach
  void createPq() {
    integerUnorderedMaxPQ = new BinaryHeapMaxPq<Integer>();
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
    integerUnorderedMaxPQ.insert(5);
    Assertions.assertEquals(1, integerUnorderedMaxPQ.size());
    Assertions.assertEquals(false, integerUnorderedMaxPQ.isEmpty());
    integerUnorderedMaxPQ.insert(7);
    Assertions.assertEquals(2, integerUnorderedMaxPQ.size());
    integerUnorderedMaxPQ.insert(7);
    integerUnorderedMaxPQ.insert(7);
    Assertions.assertEquals(4, integerUnorderedMaxPQ.size());
  }

  @Test
  @DisplayName("Can get max element")
  void canGetMaxElement() {
    integerUnorderedMaxPQ.insert(min);
    Assertions.assertEquals(min, integerUnorderedMaxPQ.max());
    integerUnorderedMaxPQ.insert(bigger);
    Assertions.assertEquals(bigger, integerUnorderedMaxPQ.max());
    integerUnorderedMaxPQ.insert(max);
    Assertions.assertEquals(max, integerUnorderedMaxPQ.max());
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
    integerUnorderedMaxPQ.insert(max);
    integerUnorderedMaxPQ.insert(min);
    integerUnorderedMaxPQ.insert(min);
    Assertions.assertEquals(max, integerUnorderedMaxPQ.delMax());
    Assertions.assertEquals(min, integerUnorderedMaxPQ.delMax());
    Assertions.assertEquals(min, integerUnorderedMaxPQ.delMax());
    integerUnorderedMaxPQ.insert(min);
    integerUnorderedMaxPQ.insert(bigger);
    integerUnorderedMaxPQ.insert(max);
    integerUnorderedMaxPQ.insert(min);
    integerUnorderedMaxPQ.insert(min);
    integerUnorderedMaxPQ.insert(min);
    integerUnorderedMaxPQ.insert(bigger);
    integerUnorderedMaxPQ.insert(max);
    integerUnorderedMaxPQ.insert(bigger);
    integerUnorderedMaxPQ.insert(bigger);
    integerUnorderedMaxPQ.insert(max);
    integerUnorderedMaxPQ.insert(min);
    Assertions.assertEquals(max, integerUnorderedMaxPQ.delMax());
    Assertions.assertEquals(max, integerUnorderedMaxPQ.delMax());
    Assertions.assertEquals(max, integerUnorderedMaxPQ.delMax());
    Assertions.assertEquals(bigger, integerUnorderedMaxPQ.delMax());
    Assertions.assertEquals(bigger, integerUnorderedMaxPQ.delMax());
    Assertions.assertEquals(bigger, integerUnorderedMaxPQ.delMax());
    Assertions.assertEquals(bigger, integerUnorderedMaxPQ.delMax());
    Assertions.assertEquals(min, integerUnorderedMaxPQ.delMax());
  }

  @Test
  @DisplayName("Capacity Test")
  void capacityTest() {
    for (int i = 0; i < capacity; i++) {
      integerUnorderedMaxPQ.insert(max);
    }
    Assertions.assertEquals(100, integerUnorderedMaxPQ.size());
  }
}
