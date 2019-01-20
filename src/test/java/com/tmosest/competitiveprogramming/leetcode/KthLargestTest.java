package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("design")
@DisplayName("LeetCode: 703. Kth Largest Element in a Stream")
public class KthLargestTest {

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] start = {4,5,8,2};
    KthLargest kthLargest = new KthLargest(3, start);
    Assertions.assertEquals(4, kthLargest.add(3));
    Assertions.assertEquals(5, kthLargest.add(5));
    Assertions.assertEquals(5, kthLargest.add(10));
    Assertions.assertEquals(8, kthLargest.add(9));
    Assertions.assertEquals(8, kthLargest.add(4));
  }
}
