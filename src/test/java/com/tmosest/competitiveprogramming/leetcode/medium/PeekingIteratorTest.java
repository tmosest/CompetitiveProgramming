package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.Iterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 284. Peeking Iterator")
class PeekingIteratorTest {

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Integer[] one = {
        1, 2
    };
    Integer[] two = {
        3, 4, 5, 6
    };
    Integer[] expected = {
        1, 3, 2, 4, 5, 6
    };
    int index = 0;
    PeekingIterator peekingIterator = new PeekingIterator(
        new ZigzagIterator(Arrays.asList(one), Arrays.asList(two)));
    for (Integer num : peekingIterator) {
      if (index < expected.length - 1) {
        Assertions.assertEquals(expected[index + 1], peekingIterator.peek());
      }
      Assertions.assertEquals(expected[index++], num);
    }
  }
}
