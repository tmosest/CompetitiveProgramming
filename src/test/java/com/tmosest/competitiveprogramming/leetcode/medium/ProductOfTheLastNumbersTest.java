package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("graph")
@Tag("wc176")
@DisplayName("LeetCode: 1352. Product of the Last K Numbers")
class ProductOfTheLastNumbersTest {

  @Test
  void testCase0() {
    ProductOfNumbers productOfNumbers = new ProductOfNumbers();
    productOfNumbers.add(3);
    productOfNumbers.add(0);
    productOfNumbers.add(2);
    productOfNumbers.add(5);
    productOfNumbers.add(4);
    Assertions.assertEquals(20, productOfNumbers.getProduct(2));
    Assertions.assertEquals(40, productOfNumbers.getProduct(3));
    Assertions.assertEquals(0, productOfNumbers.getProduct(4));
    productOfNumbers.add(8);
    Assertions.assertEquals(32, productOfNumbers.getProduct(2));
  }
}
