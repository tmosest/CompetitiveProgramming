package com.tmosest.CompetitiveProgramming.datastructures.implementations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ResizingArrayTest {

  ResizingArray<Double> doubleArray;
  ResizingArray<Integer> intArray;
  ResizingArray<String> stringArray;

  @BeforeEach
  public void setUp() {
    doubleArray = new ResizingArray<Double>();
    intArray = new ResizingArray<Integer>();
    stringArray = new ResizingArray<String>();
  }

  @Test
  public void canCreateArraysOfDifferentTypes() {
    Assertions.assertNotNull(doubleArray);
    Assertions.assertNotNull(intArray);
    Assertions.assertNotNull(stringArray);
  }

  @Test
  public void sizeShouldBeZeroForNewEmptyArray() {
    Assertions.assertTrue(doubleArray.isEmpty());
    Assertions.assertEquals(0, doubleArray.size());
    Assertions.assertTrue(intArray.isEmpty());
    Assertions.assertEquals(0, intArray.size());
    Assertions.assertTrue(stringArray.isEmpty());
    Assertions.assertEquals(0, stringArray.size());
  }

  @Test
  public void sizeShouldBeEqualToNumberOfItemsAdded() {
    int n = 0;
    Assertions.assertTrue(doubleArray.isEmpty());
    doubleArray.push(1.00);
    ++n;
    doubleArray.push(2.00);
    ++n;
    Assertions.assertEquals(2, doubleArray.size());
    double number = 1.00;
    for (int i = 0; i < 20; i++) {
      ++n;
      number += i;
      doubleArray.push(number);
    }
    Assertions.assertEquals(n, doubleArray.size());
    Assertions.assertEquals((Double) number, doubleArray.peek());
  }

}