package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.MinPqAdt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OrderedMinPqTest {

  int capacity = 100;
  Integer min = 1;
  Integer max = 7;
  Integer bigger = 5;
  MinPqAdt<Integer> integerMinPq;

  @BeforeEach
  void setIntegerMinPq() {
    integerMinPq = new OrderedMinPq<Integer>(capacity);
  }

  @Test
  @DisplayName("Empty queue has size 0")
  void emptySizeTest() {
    Assertions.assertEquals(0, integerMinPq.size());
    Assertions.assertEquals(true, integerMinPq.isEmpty());
  }

  @Test
  @DisplayName("Can insert keys")
  void canInsert() {
    integerMinPq.insert(5);
    Assertions.assertEquals(1, integerMinPq.size());
    Assertions.assertEquals(false, integerMinPq.isEmpty());
    integerMinPq.insert(7);
    Assertions.assertEquals(2, integerMinPq.size());
    integerMinPq.insert(7);
    integerMinPq.insert(7);
    Assertions.assertEquals(4, integerMinPq.size());
  }

  @Test
  @DisplayName("Can get min element")
  void canGetMaxElement() {
    integerMinPq.insert(max);
    Assertions.assertEquals(max, integerMinPq.min());
    integerMinPq.insert(bigger);
    Assertions.assertEquals(bigger, integerMinPq.min());
    integerMinPq.insert(min);
    Assertions.assertEquals(min, integerMinPq.min());
  }

  @Test
  @DisplayName("Can delete min element")
  void canDeleteMaxElement() {
    integerMinPq.insert(max);
    Assertions.assertEquals(max, integerMinPq.delMin());
    Assertions.assertEquals(0, integerMinPq.size());
    Assertions.assertEquals(true, integerMinPq.isEmpty());
    integerMinPq.insert(min);
    Assertions.assertEquals(min, integerMinPq.min());
    Assertions.assertEquals(1, integerMinPq.size());
    Assertions.assertEquals(false, integerMinPq.isEmpty());
    integerMinPq.insert(bigger);
    Assertions.assertEquals(min, integerMinPq.delMin());
    Assertions.assertEquals(bigger, integerMinPq.delMin());
    integerMinPq.insert(max);
    integerMinPq.insert(min);
    integerMinPq.insert(min);
    Assertions.assertEquals(min, integerMinPq.delMin());
    Assertions.assertEquals(min, integerMinPq.delMin());
    Assertions.assertEquals(max, integerMinPq.delMin());
    integerMinPq.insert(min);
    integerMinPq.insert(bigger);
    integerMinPq.insert(max);
    integerMinPq.insert(min);
    integerMinPq.insert(min);
    integerMinPq.insert(bigger);
    integerMinPq.insert(max);
    integerMinPq.insert(bigger);
    integerMinPq.insert(bigger);
    integerMinPq.insert(max);
    Assertions.assertEquals(min, integerMinPq.delMin());
    Assertions.assertEquals(min, integerMinPq.delMin());
    Assertions.assertEquals(min, integerMinPq.delMin());
    Assertions.assertEquals(bigger, integerMinPq.delMin());
    Assertions.assertEquals(bigger, integerMinPq.delMin());
    Assertions.assertEquals(bigger, integerMinPq.delMin());
    Assertions.assertEquals(bigger, integerMinPq.delMin());
    Assertions.assertEquals(max, integerMinPq.delMin());
  }

  @Test
  @DisplayName("Capacity Test")
  void capacityTest() {
    for (int i = 0; i < capacity; i++) {
      integerMinPq.insert(max);
    }
    Assertions.assertEquals(100, integerMinPq.size());
  }

}
