package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.MaxPq;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Data Structures: Priority Queues: Binary Heap Max Priority Queue")
public class BinaryHeapMaxPqTest {

  int capacity = 100;
  MaxPq<Integer> integerUnorderedMaxPQ;

  @Test
  @DisplayName("Empty queue has size 0")
  void emptySizeTest() {
    integerUnorderedMaxPQ = new BinaryHeapMaxPq<Integer>();
    Assertions.assertEquals(0, integerUnorderedMaxPQ.size());
    Assertions.assertEquals(true, integerUnorderedMaxPQ.isEmpty());
  }

  @Test
  @DisplayName("Can insert keys")
  void canInsert() {
    integerUnorderedMaxPQ = new BinaryHeapMaxPq<Integer>();
    integerUnorderedMaxPQ.insert(5);
    Assertions.assertEquals(1, integerUnorderedMaxPQ.size());
    Assertions.assertEquals(false, integerUnorderedMaxPQ.isEmpty());
    integerUnorderedMaxPQ.insert(7);
    Assertions.assertEquals(2, integerUnorderedMaxPQ.size());
    integerUnorderedMaxPQ.insert(7);
    integerUnorderedMaxPQ.insert(7);
    integerUnorderedMaxPQ.insert(7);
    Assertions.assertEquals(5, integerUnorderedMaxPQ.size());
  }

  @Test
  @DisplayName("Can get max element")
  void canGetMaxElement() {
    Integer max = 5;
    Integer min = 1;
    Integer bigger = 7;
    integerUnorderedMaxPQ = new BinaryHeapMaxPq<Integer>();
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
    Integer min = 1;
    Integer max = 7;
    Integer bigger = 5;
    integerUnorderedMaxPQ = new BinaryHeapMaxPq<Integer>();
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
    Integer max = 5;
    integerUnorderedMaxPQ = new BinaryHeapMaxPq<Integer>();
    for (int i = 0; i < capacity; i++) {
      integerUnorderedMaxPQ.insert(max);
    }
    Assertions.assertEquals(100, integerUnorderedMaxPQ.size());
  }
}
