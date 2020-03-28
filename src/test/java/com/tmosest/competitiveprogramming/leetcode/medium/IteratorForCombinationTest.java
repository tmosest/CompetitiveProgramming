package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("dynamic")
@Tag("binaryTree")
@DisplayName("LeetCode: 1286. Iterator for Combination")
class IteratorForCombinationTest {

  @Test
  void testCase0() {
    IteratorForCombination iteratorForCombination = new IteratorForCombination("abc", 2);
    Assertions.assertEquals("ab", iteratorForCombination.next());
    Assertions.assertTrue(iteratorForCombination.hasNext());
    Assertions.assertEquals("ac", iteratorForCombination.next());
    Assertions.assertTrue(iteratorForCombination.hasNext());
    Assertions.assertEquals("bc", iteratorForCombination.next());
    Assertions.assertFalse(iteratorForCombination.hasNext());
  }
}
