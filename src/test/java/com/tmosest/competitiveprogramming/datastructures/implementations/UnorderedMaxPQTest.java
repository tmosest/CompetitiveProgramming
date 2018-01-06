package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.MaxPqAdt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Data Structures: Priority Queues: Unordered Max Priority Queue")
public class UnorderedMaxPQTest {

  MaxPqAdt<Integer> integerUnorderedMaxPQ;

  @BeforeEach
  void createPq() {
    integerUnorderedMaxPQ = new UnorderedMaxPq<Integer>();
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
    integerUnorderedMaxPQ.insert(7);
    Assertions.assertEquals(5, integerUnorderedMaxPQ.size());
  }

  @Test
  @DisplayName("Can get max element")
  void canGetMaxElement() {
    Integer max = 5;
    Integer min = 1;
    integerUnorderedMaxPQ.insert(max);
    Assertions.assertEquals(max, integerUnorderedMaxPQ.max());
    integerUnorderedMaxPQ.insert(min);
    Assertions.assertEquals(max, integerUnorderedMaxPQ.max());
  }

  @Test
  @DisplayName("Can delete max element")
  void canDeleteMaxElement() {
    Integer max = 5;
    Integer min = 1;
    integerUnorderedMaxPQ.insert(max);
    Assertions.assertEquals(max, integerUnorderedMaxPQ.delMax());
    Assertions.assertEquals(0, integerUnorderedMaxPQ.size());
    Assertions.assertEquals(true, integerUnorderedMaxPQ.isEmpty());
    integerUnorderedMaxPQ.insert(min);
    Assertions.assertEquals(min, integerUnorderedMaxPQ.max());
    Assertions.assertEquals(1, integerUnorderedMaxPQ.size());
    Assertions.assertEquals(false, integerUnorderedMaxPQ.isEmpty());
  }
}
