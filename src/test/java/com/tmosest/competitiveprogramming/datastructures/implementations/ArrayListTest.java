package com.tmosest.competitiveprogramming.datastructures.implementations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Data Structures: Resizing Array")
class ArrayListTest {

  ArrayList<Double> doubleArray;
  ArrayList<Integer> intArray;
  ArrayList<String> stringArray;

  @BeforeEach
  public void setUp() {
    doubleArray = new ArrayList<Double>();
    intArray = new ArrayList<Integer>();
    stringArray = new ArrayList<String>();
  }

  @Test
  @DisplayName("Uses Generics")
  public void canCreateArraysOfDifferentTypes() {
    Assertions.assertNotNull(doubleArray);
    Assertions.assertNotNull(intArray);
    Assertions.assertNotNull(stringArray);
  }

  @Test
  @DisplayName("Size is zero when empty")
  public void sizeShouldBeZeroForNewEmptyArray() {
    Assertions.assertTrue(doubleArray.isEmpty());
    Assertions.assertEquals(0, doubleArray.size());
    Assertions.assertTrue(intArray.isEmpty());
    Assertions.assertEquals(0, intArray.size());
    Assertions.assertTrue(stringArray.isEmpty());
    Assertions.assertEquals(0, stringArray.size());
  }

  @Test
  @DisplayName("Size shoud reflect object count")
  public void sizeShouldBeEqualToNumberOfItemsAdded() {
    int n = 0;
    Assertions.assertTrue(doubleArray.isEmpty());
    doubleArray.add(1.00);
    ++n;
    doubleArray.add(2.00);
    ++n;
    Assertions.assertEquals(2, doubleArray.size());
    double number = 1.00;
    for (int i = 0; i < 20; i++) {
      ++n;
      number += i;
      doubleArray.add(number);
    }
    Assertions.assertEquals(n, doubleArray.size());
    Assertions.assertEquals((Double) number, doubleArray.pop());
    for (int i = 0; i < n; i++) {
      doubleArray.pop();
    }
    Assertions.assertEquals(true, doubleArray.isEmpty());
  }

}
